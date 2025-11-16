import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Multiplication Table Generator ---");
        System.out.print("Enter the number for the multiplication table: ");
        int number = scanner.nextInt();
        System.out.println("\n--- Table for " + number + " (1 to 10) ---");
        for (int i = 1; i <= 10; i++) {

            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        
        System.out.println("-----------------------------------------");
    }
}