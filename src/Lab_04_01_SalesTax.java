import java.util.Scanner;
public class Lab_04_01_SalesTax {
    public static void main(String[] args) {

        //Declare Variables
        Scanner sc = new Scanner(System.in);
        double price;
        double total;
        double tax;
        System.out.print("Enter a price: ");
        price = sc.nextDouble();

        //Math
        tax = price * .05;
        total = price + tax;

        //Output

        System.out.println();
        System.out.print("Your total price is $" + total + " with an initial price of $" + price + " and a sales tax of $" + tax + ".");


    }
}