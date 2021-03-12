package com.fridaynightsoftwares;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;
    public Album(String name, String artist) {
        songs = new ArrayList<>();
        this.name = name;
        this.artist = artist;
    }
    public boolean addSong(String title, double duration) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return false;
            }
        }
        songs.add(new Song(title, duration));
        return true;
    }
    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, List<Song> playlist) {
        if (trackNumber > songs.size() || trackNumber <= 0) {
            return false;
        }
        Song songToBeAdded = songs.get(trackNumber - 1);
        if (findSong(songToBeAdded.getTitle()) != null) {
            playlist.add(songToBeAdded);
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, List<Song> playlist) {
        Song songToBeAdded = findSong(title);
        if (songToBeAdded != null) {
            playlist.add(songToBeAdded);
            return true;
        }
        return false;
    }
}
