//Gregori, Christian Jowell A. TA21

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        String category;
        double price;
        int servingSize;

        //Get item name string
        System.out.print("Enter item name: ");
        itemName = scanner.nextLine(); // Consume the newline character

        //Get item category string
        System.out.print("Enter item category: ");
        category = scanner.nextLine(); // Consume the newline character

        //Get item price double
        System.out.print("Enter item price: ");
        price = scanner.nextDouble();

        //Get serving size int
        System.out.print("Enter item serving size: ");
        servingSize = scanner.nextInt();

        // Displaying the input values
        System.out.println();
        System.out.println("Item: " + itemName);
        System.out.println("Category: " + category);
        System.out.printf("Price: PHP %.1f%n", price);
        System.out.println("Serving Size: " + servingSize);

        // Closing the scanner
        scanner.close();

    }
}
