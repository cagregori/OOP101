//Gregori, Christian Jowell A. TA21

import java.util.Scanner;

public class Mod3Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double productPrice; int quantity;

        double subtotal; double vat; double total;

        //Get hours worked integer
        System.out.print("Enter product price: ");
        productPrice = scanner.nextDouble();

        //Get hourly rate integer
        System.out.print("Enter quantity: ");
        quantity = scanner.nextInt();

        subtotal = productPrice * quantity;
        vat = subtotal * 0.12;
        total = subtotal + vat;

        System.out.println();
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("VAT: %.4f%n", vat);
        System.out.printf("Total: %.4f%n", total);

        // Closing the scanner
        scanner.close();

    }
}
