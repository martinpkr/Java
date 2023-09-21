public class MethodsChallange {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));

        displayHighScorePosition("Nicole", calculateHighScorePosition(1000));
        displayHighScorePosition("Maritn", calculateHighScorePosition(500));
        displayHighScorePosition("TheWeakest", calculateHighScorePosition(100));

    }

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + "managed to get to position " + position + " on the high score list");

    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }


        return 4;


    }
}
