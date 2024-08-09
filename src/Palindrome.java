public class Palindrome {
    public static void main(String[] args) {
        System.out.println("101 is palindrome: " + isPalindrome(101));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number; // to make it positive
        }

        int reversedNumber = 0;
        int originalNumber = number;
        while(number > 0) {
            reversedNumber = (reversedNumber * 10) + (number % 10);
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
