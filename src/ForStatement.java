public class ForStatement {
    public static void main(String[] args) {
        primeCounter(100);
    }

    public static boolean isPrime(int n) {
        boolean value = false;

        for (int i = 2; i < (n / 2); i++) {
            int reminder = n % i;
            if (reminder == 0) {
                value = false;
                break;
            }

            value = true;
        }

        return value;
    }

    public static void primeCounter(int n) {
        int counter = 0;

        if (n > 1000) {
            System.out.println("Prime counter over 1000");
        }

        for (int i = 2; i < n / 2; i++) {
            if (counter == 3) {
                break;
            }
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                counter++;
            }
        }
    }
}
