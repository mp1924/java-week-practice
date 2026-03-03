import java.util.Scanner;


public class Week1_Week2_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("LEVEL 1 PROGRAMS ");
        AgeCalculator.displayAge();
        AveragePCM.calculateAverage();
        DistanceConverter.convertDistance();

        System.out.println("\n LEVEL 2 PROGRAMS ");
        TriangleAreaCalculator.calculateTriangleArea(input);
        SquareSideCalculator.calculateSquareSide(input);

        System.out.println("\n LEVEL 3 PROGRAM ");
        TemperatureConversion.convertCelsiusToFahrenheit(input);

        input.close();
    }
}

// LEVEL 1

// Program 1 - Age Calculator
class AgeCalculator {

    static void displayAge() {

        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}

// Program 2 - Average PCM
class AveragePCM {

    static void calculateAverage() {

        String name = "Sam";

        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        int totalSubjects = 3;

        int totalMarks = mathsMarks + physicsMarks + chemistryMarks;

        double averagePercentage = (double) totalMarks / totalSubjects;

        System.out.println(name + "'s average mark in PCM is " + averagePercentage);
    }
}

// Program 3 - Distance Converter
class DistanceConverter {

    static void convertDistance() {

        double distanceInKilometers = 10.8;
        double conversionFactor = 1.6;

        double distanceInMiles = distanceInKilometers / conversionFactor;

        System.out.println("The distance " + distanceInKilometers +
                " km in miles is " + distanceInMiles);
    }
}

//  LEVEL 2 

// Program 4 - Triangle Area Calculator
class TriangleAreaCalculator {

    static void calculateTriangleArea(Scanner input) {

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaInSquareCm = 0.5 * base * height;

        double oneInchInCm = 2.54;

        double areaInSquareInches =
                areaInSquareCm / (oneInchInCm * oneInchInCm);

        System.out.println("The Area of the triangle in sq in is " +
                areaInSquareInches +
                " and sq cm is " + areaInSquareCm);
    }
}

// Program 5 - Square Side Finder
class SquareSideCalculator {

    static void calculateSquareSide(Scanner input) {

        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}

// LEVEL 3 

// Program 6 - Temperature Conversion
class TemperatureConversion {

    static void convertCelsiusToFahrenheit(Scanner input) {

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult +
                " fahrenheit");
    }
}
