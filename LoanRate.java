import java.util.Scanner;

public class LoanRate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("How many year loan do you have: ");
        double loanYear = input.nextDouble();

        System.out.print("How much is the loan for: ");
        double loanAmount = input.nextDouble();

        double interesttoDecimal = annualInterestRate / 100;
        double monthlyInterestRate = interesttoDecimal / 12;
        double monthlyInterestDecimal = annualInterestRate / 1200;

        double monthlyPayment = (loanAmount * monthlyInterestRate)/
        (1-(1/(Math.pow(1+monthlyInterestRate,loanYear * 12))));

        double totalPayment = (monthlyPayment * 12) * loanYear;

        System.out.println("Your monthly payment is: " + monthlyPayment + 
            " and total amount owed over the lifetime of the loan is: " + totalPayment);

        input.close();
    }
}