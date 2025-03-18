import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = getNonNegativeInteger();

        long factorial = calculateFactorial(number);

        System.out.println("The factorial of " + number + " is: " + factorial);
    }

    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1; // Initialize with an invalid value

        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Invalid input! Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close(); // Close the scanner to avoid resource leak
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Multiply factorial by i in each iteration
        }

        return factorial;
    }
}
