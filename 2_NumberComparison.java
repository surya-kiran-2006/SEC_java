import java.util.Scanner;

public class NumberComparison {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Simple Number Comparison ---");

        
        System.out.print("Enter the first number (num1): ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number (num2): ");
        int num2 = scanner.nextInt();
        
        System.out.println("\n--- Result ---");

    
        String comparison;
        
        if (num1 == num2) {
            comparison = "is equal to";
        } else {
            comparison = (num1 > num2) ? "is greater than" : "is less than";
        }

        System.out.println(num1 + " " + comparison + " " + num2 + ".");
        
        System.out.println("---------------------------------");
        // We omit scanner.close() for simplicity in this very basic example.
    }
}
