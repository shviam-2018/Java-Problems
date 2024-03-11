import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 1. Read an integer from the standard input
        int a = scanner.nextInt();

        // 2. Find out if the number is EVEN or ODD and print it.
        EvenorOdd(a);

        // 3. Calculate and print the absolute value of the input number.
        System.out.println(Math.abs(a));
    }

    // Method to determine if a number is even or odd
    public static void EvenorOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
