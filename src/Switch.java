public class Switch {
    public static void main(String[] args) {
        int value = 4;
        switch (value) {
            case 1 -> System.out.println("1");
            case 2, 3, 4, 5 -> {
                System.out.println("Either one of 2, 3, 4, or 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("3");
        }

        System.out.println(getQuarter("March"));
        System.out.println(getNatoPhonetic("a"));
        printDayOfWeek(3);
        printDayOfWeek(10);
        printDayOfWeek(30);
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> {
                yield "1st";
            }
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "Invalid month";
        };
    }

    public static String getNatoPhonetic(String phoneticAlphabet) {
        return switch (phoneticAlphabet.toUpperCase()) {
            case "A" -> "Able";
            case "B" -> "Baker";
            case "C" -> "Charlie";
            case "D" -> "Dog";
            case "E" -> "Easy";
            default -> "Invalid phonetic alphabet. Should be between A and E";
        };
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day");
        };
    }
}

