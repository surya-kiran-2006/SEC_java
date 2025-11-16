import java.util.Scanner;
public class NumberSignChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Number Sign Checker ---");
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();       
        System.out.println("\n--- Result ---");
        if (number > 0) {
            System.out.println("The number " + number + " is Positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is Negative.");
        } else {
            System.out.println("The number " + number + " is Zero.");
        }
        
        System.out.println("---------------------------");
    }
}