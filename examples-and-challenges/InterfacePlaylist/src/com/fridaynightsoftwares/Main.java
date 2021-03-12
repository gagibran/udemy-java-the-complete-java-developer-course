// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// hint: listIterator.remove()


package com.fridaynightsoftwares;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Album> albums = new ArrayList<>();
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playList = new LinkedList<>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24
        play(playList);
    }
    private static void printMenu() {
        System.out.println("Press 0 to see the songs in the playlist.");
        System.out.println("Press 1 to skip to the next song.");
        System.out.println("Press 2 to go back to the previous song.");
        System.out.println("Press 3 to replay the previous song.");
        System.out.println("Press 4 to remove a song from the playlist.");
        System.out.println("Press any other number to quit.");
    }
    private static void printPlaylist(List<Song> playlist) {
        for (Song song : playlist) {
            System.out.println(song);
        }
    }
    private static void play(List<Song> playlist) {
        final String PLAYING_MESSAGE = "Now playing: ";
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playlist.listIterator();
        printMenu();
        boolean quit = false;
        boolean goingForward = true;
        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    if (playlist.size() == 0) {
                        System.out.println("No songs in this playlist.");
                    } else {
                        printPlaylist(playlist);
                    }
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println(PLAYING_MESSAGE + listIterator.next());
                    } else {
                        goingForward = false;
                        System.out.println("You've reached the end of the playlist.");
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println(PLAYING_MESSAGE + listIterator.previous());
                    } else {
                        goingForward = true;
                        System.out.println("You've reached the beginning of the playlist.");
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println(PLAYING_MESSAGE + listIterator.previous());
                            goingForward = false;
                        } else {
                            System.out.println("You are at the beginning of the playlist.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println(PLAYING_MESSAGE + listIterator.next());
                            goingForward = true;
                        } else {
                            System.out.println("You are at the end of the playlist.");
                        }
                    }
                    break;
                case 4:
                    if (listIterator.hasPrevious()) {
                        System.out.println("\"" + listIterator.previous().getTitle() + "\" was removed from the playlist.");
                        listIterator.next();
                        listIterator.remove();
                    } else if (playlist.size() == 0) {
                        System.out.println("The playlist is empty.");
                    } else {
                        System.out.println("Ypu are at the beginning of the playlist.");
                    }
                    break;
                default:
                    System.out.println("Now terminating...");
                    quit = true;
                    scanner.close();
                    break;
            }
        }
    }
}
