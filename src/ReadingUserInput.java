import java.util.Calendar;

import static java.lang.Integer.parseInt;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int userInput = getInputFromConsole();

        System.out.println(currentYear);
        System.out.println(userInput);
        System.out.println("Your current age is: " + (currentYear - userInput));
    }

    public static int getInputFromConsole() {
        String year = System.console().readLine("What year were you born?");
        return parseInt(year);
    }
}
