import java.util.Scanner;

public class Level1_Programs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Divisible by 5
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Divisible by 5? " + (number % 5 == 0));

        // Smallest
        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("First smallest? " + (a < b && a < c));

        // Largest
        System.out.println("First largest? " + (a > b && a > c));
        System.out.println("Second largest? " + (b > a && b > c));
        System.out.println("Third largest? " + (c > a && c > b));

        // Natural Sum
        System.out.print("Enter natural number: ");
        int n = input.nextInt();
        if (n > 0)
            System.out.println("Sum: " + (n * (n + 1) / 2));
        else
            System.out.println("Not natural number");

        input.close();
    }
}

