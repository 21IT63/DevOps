import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Check if n is greater than 0
        if (n <= 0) {
            System.out.println("Please enter a valid number of elements greater than 0.");
            return;
        }

        double sum = 0;

        System.out.println("Enter the elements:");

        // Input n numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            sum += num;
        }

        // Calculate the average
        double average = sum / n;

        // Display the result
        System.out.println("The average is: " + average);

        // Close the scanner
        scanner.close();
    }
}
