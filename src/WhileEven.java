public class WhileEven {
    public static void main(String[] args) {
        int counter = 5;
        int evenTotal = 0;
        int oddTotal = 0;

        while (counter <= 20) {
            if (isEvenNumber(counter) && evenTotal < 5) {
                evenTotal++;
                System.out.println(counter + " is even");
            } else {
                oddTotal++;
            }
            counter++;
        }

        System.out.println("Even count: " + evenTotal);
        System.out.println("Odd count: " + oddTotal);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
