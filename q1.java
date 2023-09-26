package questo;

import java.util.Scanner;

// Loan Approval System
public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Loan Approval System");
        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter your annual income: ");
        double annualIncome = scanner.nextDouble();

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        // Define predefined criteria for loan approval
        int minimumCreditScore = 650;
        double minimumIncome = 250000.0;
        double maximumLoanAmount = 1000000.0;

        // Check if the user meets the criteria
        if (creditScore >= minimumCreditScore && annualIncome >= minimumIncome && loanAmount <= maximumLoanAmount) {
            System.out.println("Congratulations! Your loan is approved.");
        } else {
            System.out.println("Sorry, your loan is denied.");
        }

        scanner.close();
    }
}
