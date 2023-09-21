public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(4000));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int hours = seconds / 3600;
            int remainderSecs = seconds % 3600;
            int minutes = remainderSecs / 60;
            int remainderSecs2 = seconds % minutes;
            String myString = getDurationString(minutes, seconds);
            return hours + "h " + minutes + "m " + remainderSecs2 + "s";
        } else {
            return "Invalid input";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int minutesToSecs = minutes * 60;
            int allSeconds = minutesToSecs + seconds;
            return Integer.toString(allSeconds);
        } else {
            return "Invalid input";
        }
    }
}
