import java.util.Scanner;

public class SalesTax{
    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = keyboardInput.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.println("Sales tax is $" + (int)(tax * 100)/100);

        keyboardInput.close();
    }
}