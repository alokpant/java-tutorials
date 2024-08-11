import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class SumOfInputIntegers {
    public static void main(String[] args) {
        int total;
        try {
            total = getInputFromConsole();
        } catch (NumberFormatException e) {
            total = getInputFromScanner();
        }

        System.out.println(total);
    }

    public static int getInputFromConsole() {
        int sum = 0;
        int i = 0;

        while (i < 5) {
            String num = System.console().readLine("Enter a valid number " + (i + 1));
            int numInt = parseInt(num);
            if (numInt > 0) {
                i++;
                sum += numInt;
            }
        }

        return sum;
    }

    public static int getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        do {
            System.out.println("Enter a valid number " + (i + 1));
            String num = scanner.nextLine();
            int numberYear = parseInt(num);
            if (numberYear > 0) {
                i++;
                sum += parseInt(num);
            } else {
                System.out.println("Invalid number " + num + " \n Please try again");
            }
        } while (i < 5);

        return sum;
    }
}
