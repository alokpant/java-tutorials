public class Challenge {
    public static void main(String[] args) {
            double twenty = 20.00;
            double eighty = 80.00;
            double result = (twenty + eighty) * 100.00;
            boolean value = (double) (result % 40.00d) == 0.0;


            System.out.println(result);
            System.out.println(value);
            System.out.println((result % 40.00));

            if (value) {
                System.out.println("YES");
            }

    }
}
