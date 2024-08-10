import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadingUserInput {
    public static void main(String[] args) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int userInput;
        try {
            userInput = getInputFromConsole();
        } catch (NullPointerException e) {
            userInput = getInputFromScanner(currentYear);
        }

        System.out.println(currentYear);
        System.out.println(userInput);
        System.out.println("Your current age is: " + (currentYear - userInput));
    }

    public static int getInputFromConsole() {
        String year = System.console().readLine("What year were you born?");
        return parseInt(year);
    }

    public static int getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year were you born?");
        boolean validDOB = false;
        do {
            String year = scanner.nextLine();
            int numberYear = parseInt(year);

            if (checkData(currentYear, numberYear)) {
                validDOB = true;
                return parseInt(year);
            }
            System.out.println("The value that you entered is not valid: " + year + " \n Please try again");
        } while (!validDOB);

        return 0;
    }

    public static boolean checkData(int currentYear, int dateOfBirth) {
        int minimumYear = currentYear - 125;

        if (dateOfBirth < minimumYear || dateOfBirth > currentYear) {
            return false;
        }

        return true;
    }
}
