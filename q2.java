package questo;

import java.util.Scanner;

// Investment Calculator

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Investment Calculator");
        System.out.print("Enter the initial investment amount: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Calculate the future value
        double futureValue = calculateFutureValue(initialInvestment, annualInterestRate, years);

        System.out.println("The future value of your investment is: $" + futureValue);

        scanner.close();
    }

    // Function to calculate future value
    public static double calculateFutureValue(double initialInvestment, double annualInterestRate, int years) {
        double futureValue = initialInvestment * Math.pow(1 + annualInterestRate, years);
        return futureValue;
    }
}
