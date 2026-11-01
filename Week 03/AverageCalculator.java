import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("The number of values must be greater than zero.");
            return;
        }

        double total = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter value " + i + ": ");
            double value = input.nextDouble();
            total += value;
        }

        double average = total / count;
        System.out.println("Average: " + average);

        input.close();
    }
}