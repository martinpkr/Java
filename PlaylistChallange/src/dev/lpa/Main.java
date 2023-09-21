package dev.lpa;

import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Album album = new Album("AphexTwin", "Aphex Twing");
        LinkedList<Song> playlist = new LinkedList<>();


        album.addSong("Xtal", 4);
        album.addSong("Xtal", 4);
        album.addSong("Math", 11);
        album.addSong("St.Michel", 8);
        album.addSong("Syro", 40);


        album.findSong("Xtal");
        album.addToPlayList("Xtal", playlist);
        album.addToPlayList("Syro", playlist);

        System.out.println(playlist);

    }
}