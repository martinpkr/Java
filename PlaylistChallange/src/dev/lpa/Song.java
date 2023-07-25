package dev.lpa;

public class Song {
    private final String title;
    private final double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("%s:%f", title, duration);
    }
}
