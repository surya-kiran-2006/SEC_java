public class EvenOddChecker {

    public static void main(String[] args) {
        
        System.out.println("--- Simplified Even/Odd Checker ---");
        int number = 99;
        
        System.out.println("Checking the number: " + number);
        String result = (number % 2 == 0) 
                        ? "is Even." 
                        : "is Odd.";
        System.out.println("Result: The number " + number + " " + result);
        System.out.println("----------------------------------------");
    }
}