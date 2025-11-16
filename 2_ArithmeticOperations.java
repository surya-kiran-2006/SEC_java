import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Simple Arithmetic Calculator ---");
        System.out.print("Enter the first integer (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer (num2): ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        System.out.println("\n--- Results ---");
        System.out.println("Sum (num1 + num2):        " + sum);
        System.out.println("Difference (num1 - num2): " + difference);
        System.out.println("Product (num1 * num2):    " + product);

        // 3. Division and Remainder (with division-by-zero check)
        if (num2 != 0) {
            System.out.println("Quotient (num1 / num2):   " + (num1 / num2));
            System.out.println("Remainder (num1 % num2):  " + (num1 % num2));
        } else {
            System.out.println("Quotient:                 Division by zero is not allowed.");
            System.out.println("Remainder:                Not applicable.");
        }
        System.out.println("-----------------");
    }
}
