import java.util.Scanner;
public class BitwiseOperations {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Simple Bitwise Calculator ---");

        
        System.out.print("Enter the first integer (A): ");
        int numA = scanner.nextInt();

        System.out.print("Enter the second integer (B): ");
        int numB = scanner.nextInt();

        
        int andResult = numA & numB;  
        int orResult = numA | numB;   
        int xorResult = numA ^ numB;  

        System.out.println("\n--- Results ---");
        
        
        System.out.println("A (Dec/Bin): " + numA + " / " + Integer.toBinaryString(numA));
        System.out.println("B (Dec/Bin): " + numB + " / " + Integer.toBinaryString(numB));
        System.out.println("-----------------");
        
       
        System.out.println("AND Result (A & B):");
        System.out.println("  Decimal: " + andResult);
        System.out.println("  Binary:  " + Integer.toBinaryString(andResult));
        System.out.println();

        
        System.out.println("OR Result (A | B):");
        System.out.println("  Decimal: " + orResult);
        System.out.println("  Binary:  " + Integer.toBinaryString(orResult));
        System.out.println();
        
        
        System.out.println("XOR Result (A ^ B):");
        System.out.println("  Decimal: " + xorResult);
        System.out.println("  Binary:  " + Integer.toBinaryString(xorResult));
        System.out.println("-----------------");
    }
}
