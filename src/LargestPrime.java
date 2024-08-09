public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(31));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(3127));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = number;
        for (int i = 2; i <= number; i++) {
            int mod = number % i;
            if (mod == 0) {
                largestPrime = i;
                number /= i;
                i -= 1;
            }
        }


        return largestPrime;
    }
}