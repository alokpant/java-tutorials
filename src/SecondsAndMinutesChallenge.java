public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        String message = getDurationString(30, 120);
        System.out.println(message);

        message = getDurationString(3600);
        System.out.println(message);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid seconds (" + seconds + ") passed";
        };

        int hour = seconds / (60 * 60);
        double hourReminder = (seconds % (60 * 60));
        int minutes = (int) (hourReminder / 60);
        int remainingSeconds = (int) hourReminder % 60;

        return hour + "h " + minutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int seconds, int minutes) {
        if (seconds < 0 || 59 < seconds || minutes < 0) {
            return "Invalid seconds (" + seconds + ") and minutes (" + minutes + ") passed ";
        };

        int totalSeconds = seconds + (minutes * 60);
        return getDurationString(totalSeconds);
    }
}
