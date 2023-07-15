// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10_000;
        int bonus = 200;
        int levelCompleted = 8;

        int finalScore = score;
        if(gameOver) {
            finalScore += bonus * levelCompleted;
            System.out.println(finalScore);
        }

    }
}