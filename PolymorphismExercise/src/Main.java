import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Anime fantasyAnime = new Fantasy("Fairy Tail");
//        fantasyAnime.isPlaying();
//        Anime mysteryAnime = new Mystery("Death Note");
//        mysteryAnime.isPlaying();
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.print("What type of anime you want to watch?");
            String userType = s.nextLine();
            if ("Qq".contains(userType)){
                break;
            }
            System.out.print("Enter movie title: ");
            String userTitle = s.nextLine();
            Anime anime = Anime.getAnime(userType,userTitle);
            anime.isPlaying();
        }


    }
}