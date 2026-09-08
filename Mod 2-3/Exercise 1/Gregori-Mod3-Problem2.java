//Gregori, Christian Jowell A. TA21

import java.util.Scanner;

public class Mod3Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double productPrice; int quantity;

        double subtotal; double vat; double total;

        //Get product price
        System.out.print("Enter product price: ");
        productPrice = scanner.nextDouble();

        //Get quantity
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        //Calculate subtotal, vat, and total
        subtotal = productPrice * quantity;
        vat = subtotal * 0.12;
        total = subtotal + vat;

        //Display data output
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("VAT: %.4f%n", vat);
        System.out.printf("Total: %.4f%n", total);

        // Closing the scanner
        scanner.close();
    }
}
