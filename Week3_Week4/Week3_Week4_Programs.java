import java.util.Scanner;

// Public class (File name must match this)
public class Week3_Week4_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== LEVEL 1 =====");
        DivisibilityChecker.checkDivisibleByFive(input);
        SmallestNumberChecker.checkFirstSmallest(input);
        LargestNumberChecker.checkLargest(input);
        NaturalNumberSum.calculateNaturalSum(input);

        System.out.println("\n===== LEVEL 2 =====");
        OddEvenPrinter.printOddEven(input);
        EmployeeBonusCalculator.calculateBonus(input);
        MultiplicationTableGenerator.generateTable(input);

        System.out.println("\n===== LEVEL 3 =====");
        LeapYearChecker.checkLeapYearMultipleIf(input);
        LeapYearChecker.checkLeapYearSingleIf(input);

        input.close();
    }
}

// ================= LEVEL 1 =================

// Program 1
class DivisibilityChecker {

    static void checkDivisibleByFive(Scanner input) {

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number +
                " divisible by 5? " + isDivisible);
    }
}

// Program 2
class SmallestNumberChecker {

    static void checkFirstSmallest(Scanner input) {

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number3: ");
        int number3 = input.nextInt();

        boolean isFirstSmallest =
                (number1 < number2 && number1 < number3);

        System.out.println("Is the first number the smallest? "
                + isFirstSmallest);
    }
}

// Program 3
class LargestNumberChecker {

    static void checkLargest(Scanner input) {

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number3: ");
        int number3 = input.nextInt();

        boolean isFirstLargest =
                (number1 > number2 && number1 > number3);

        boolean isSecondLargest =
                (number2 > number1 && number2 > number3);

        boolean isThirdLargest =
                (number3 > number1 && number3 > number2);

        System.out.println("Is the first number the largest? "
                + isFirstLargest);

        System.out.println("Is the second number the largest? "
                + isSecondLargest);

        System.out.println("Is the third number the largest? "
                + isThirdLargest);
    }
}

// Program 4
class NaturalNumberSum {

    static void calculateNaturalSum(Scanner input) {

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {

            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number +
                    " natural numbers is " + sum);

        } else {

            System.out.println("The number " + number +
                    " is not a natural number");
        }
    }
}

// ================= LEVEL 2 =================

// Program 5
class OddEvenPrinter {

    static void printOddEven(Scanner input) {

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Not a natural number.");
        }
    }
}

// Program 6
class EmployeeBonusCalculator {

    static void calculateBonus(Scanner input) {

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        double bonus = 0;

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount is " + bonus);
    }
}

// Program 7
class MultiplicationTableGenerator {

    static void generateTable(Scanner input) {

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {

            int result = number * i;

            System.out.println(number + " * " + i +
                    " = " + result);
        }
    }
}

// ================= LEVEL 3 =================

// Multiple if-else
class LeapYearChecker {

    static void checkLeapYearMultipleIf(Scanner input) {

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year < 1582) {

            System.out.println("Year must be >= 1582");

        } else {

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        System.out.println("Year is a Leap Year");
                    } else {
                        System.out.println("Year is not a Leap Year");
                    }

                } else {
                    System.out.println("Year is a Leap Year");
                }

            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
    }

    // Single if condition
    static void checkLeapYearSingleIf(Scanner input) {

        System.out.print("Enter year again: ");
        int year = input.nextInt();

        if (year >= 1582 &&
                (year % 4 == 0 &&
                        (year % 100 != 0 || year % 400 == 0))) {

            System.out.println("Year is a Leap Year");

        } else {

            System.out.println("Year is not a Leap Year");
        }
    }
}
