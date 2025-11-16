
public class CompoundAssignment {

    public static void main(String[] args) {
        
        System.out.println("--- Simplified Compound Assignment Demo ---");
        int number = 20; 
        
        System.out.println("\nStarting value: " + number);
        System.out.println("---------------------------------------");
        number += 5;
        System.out.println("1. After += 5 (Addition):    " + number);
        number -= 8;
        System.out.println("2. After -= 8 (Subtraction): " + number);
        number *= 2;
        System.out.println("3. After *= 2 (Multiplication):" + number);
        
        System.out.println("---------------------------------------");
    }
}