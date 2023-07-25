package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Album {
    // write code here
    private String name;
    private String artist;

    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song songToAdd = new Song(title, duration);
        for (Song song :
                songs) {
            if (song.getTitle().equals(title)) {
                System.out.println("Song already in playlist");
                return false;
            }
        }

        songs.add(new Song(title, duration));
        System.out.println("Song added in playlist");
        return true;
    }

    public Song findSong(String titleOfSong) {
        var itarator = songs.listIterator();
        while (itarator.hasNext()) {
            Song song = itarator.next();
            if (song.getTitle().equals(titleOfSong)) {
                System.out.println(song);
                return song;
            } else {
                return null;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (songs.size() >= trackNumber) {
            playlist.add(songs.get(trackNumber));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        var iterator = songs.listIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getTitle() == title) {
                playlist.add(song);
                return true;
            }
        }
        return false;
    }

}