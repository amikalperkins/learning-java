import java.util.Scanner;  
public class ChangeMachine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number to be converted to coins: ");
        double dollarAmount = input.nextDouble();
        int cents = (int)(dollarAmount * 100);

        int dollars = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        System.out.println("You have " + dollars + " dollars " + quarters + " quarters " +
            + dimes + " dimes and " + nickels + " nickels with " + pennies + " pennies.");






        input.close();
    }
}