import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Simple Voting Eligibility Checker ---");

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        System.out.println("\n--- Result ---");

        boolean isEligible = (age >= 18) && isCitizen;

        String resultMessage = isEligible 
                               ? "Congratulations! You are eligible to vote." 
                               : "Sorry, you are NOT eligible to vote.";
                               
        System.out.println(resultMessage);
        
        System.out.println("---------------------------------------");
    }
}