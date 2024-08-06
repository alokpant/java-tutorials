public class MethodOverloading {
    public static void main(String[] args) {
        double cm = convertToCentimeters(7, 5);
        System.out.println(cm);
    }

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInInches, int heightInFeet) {
        double result = convertToCentimeters(heightInInches) + convertToCentimeters(heightInFeet * 12);
        System.out.println("Centimeter for " + heightInInches + " inches and " + heightInFeet + " feet is " + result) ;
        return result;
    }

}
