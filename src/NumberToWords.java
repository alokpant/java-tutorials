public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(10);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        StringBuilder sum = new StringBuilder();
        int reversedNumber = reverse(number);

        StringBuilder suffix = new StringBuilder();
        int differenceInCount = getDigitCount(number) - getDigitCount(reversedNumber);

        if (differenceInCount > 0) {
            suffix.append(" Zero".repeat(differenceInCount));
        }

        while (reversedNumber > 0) {
            String word = switch (reversedNumber % 10) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid number";
            };
            sum.append(" ").append(word);
            reversedNumber /= 10;
        }

        System.out.println(sum + suffix.toString());
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number < 10) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }


    public static int reverse(int number) {
        int reversedNumber = 0;
        boolean isNegative = number < 0;
        number = Math.abs(number);

        while (number > 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        return isNegative ? -reversedNumber : reversedNumber;
    }
}