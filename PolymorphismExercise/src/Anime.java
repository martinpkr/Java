public class Anime {
    private String title;

    public Anime(String title) {
        this.title = title;
    }

    public static Anime getAnime(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'F' -> new Fantasy(title);
            case 'M' -> new Mystery(title);
            default -> new Anime(title);
        };
    }

    public void isPlaying() {
        System.out.println("We are playing " + this.title);
    }
}

class Fantasy extends Anime {

    private String isInstance = getClass().getSimpleName();

    public Fantasy(String title) {
        super(title);
    }

    @Override
    public void isPlaying() {
        super.isPlaying();
        System.out.println("The genre is " + isInstance);
    }
}

class Mystery extends Anime {

    String isInstance = this.getClass().getSimpleName();

    public Mystery(String title) {
        super(title);
    }

    @Override
    public void isPlaying() {
        super.isPlaying();
        System.out.println("The genre is " + isInstance);
    }
}
