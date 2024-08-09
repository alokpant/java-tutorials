public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of digits: -1 is " + sumDigits(-1));
        System.out.println("Sum of digits: 1 is " + sumDigits(1));
        System.out.println("Sum of digits: 12 is " + sumDigits(12));
        System.out.println("Sum of digits: 123 is " + sumDigits(123));
        System.out.println("Sum of digits: 1234 is " + sumDigits(1234));
        System.out.println("Sum of digits: 1000 is " + sumDigits(1000));
        System.out.println("Sum of digits: 12345 is " + sumDigits(12345));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0; // 3
        while (number > 0) {
            sum += (number % 10); // 5
            number /= 10;
        };

        return sum;
    }
}
