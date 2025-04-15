import java.sql.SQLOutput;
import java.util.Scanner;

public class CompundInterest {
    public static void main(String[] args) {

        // Compound Interest Calculator

        // Scanner function
        Scanner scanner = new Scanner(System.in);

        // Variables used:
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        // Principal Amount
        System.out.print("Enter your principal amount: ");
        principal = scanner.nextDouble();

        // Interest Rate
        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble() /100 ;

        // How often is this compounded? Yearly/ Quarter/ Biweekly etc...
        System.out.print("Enter number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        // How long does the principle compound for.
        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        // Compound Interest Formula
        amount = principal * Math.pow(1+ rate / timesCompounded, timesCompounded * years);

        System.out.printf(
                "After %d years, your original principal amount of %.2f compounded %d times per year at an interest rate of %.2f%% will become %.2f\n",
                years, principal, timesCompounded, rate, amount);

        // Closing the Scanner when the Calculates are finished
        scanner.close();
    }
}
