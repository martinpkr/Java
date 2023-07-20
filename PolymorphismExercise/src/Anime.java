public class Anime {
    private String title;

    public Anime(String title) {
        this.title = title;
    }
    public void isPlaying(){
        System.out.println("We are playing " + this.title);
    }

    public static Anime getAnime(String type,String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'F' -> new Fantasy(title);
            case 'M' -> new Mystery(title);
            default -> new Anime(title);
        };
    }
}

class Fantasy extends Anime{

    public Fantasy(String title) {
        super(title);
    }
    private String isInstance = getClass().getSimpleName();
    @Override
    public void isPlaying() {
        super.isPlaying();
        System.out.println("The genre is " + isInstance);
    }
}
class Mystery extends Anime{

    public Mystery(String title) {
        super(title);
    }
    String isInstance = this.getClass().getSimpleName();
    @Override
    public void isPlaying() {
        super.isPlaying();
        System.out.println("The genre is " + isInstance);
    }
}
