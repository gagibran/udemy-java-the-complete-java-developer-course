package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;
    public Album(String name, String artist) {
        songs = new SongList();
        this.name = name;
        this.artist = artist;
    }
    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        Song songToBeAdded = songs.findSong(track);
        if (songToBeAdded != null) {
            playlist.add(songToBeAdded);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song songToBeAdded = songs.findSong(title);
        if (songToBeAdded != null) {
            playlist.add(songToBeAdded);
            return true;
        }
        return false;
    }
    public boolean addSong(String title, double duration) {
        for (Song song : songs.songs) {
            if (song.getTitle().equals(title)) {
                return false;
            }
        }
        songs.songs.add(new Song(title, duration));
        return true;
    }
    public static class SongList {
        private ArrayList<Song> songs;
        private SongList() {
            this.songs = new ArrayList<>();
        }
        private boolean add(Song song) {
            if (findSong(song.getTitle()) != null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }
        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            System.out.println("The song " + title + " is not in this album");
            return null;
        }
        private Song findSong(int track) {
            if (track <= 0 || track > this.songs.size()) {
                System.out.println("This album does not have a track " + track);
                return null;
            }
            return this.songs.get(track - 1);
        }
    }
}
