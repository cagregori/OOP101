//Gregori, Christian Jowell A. TA21

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brand;
        String model;
        String plateNum;
        int yearMod;
        double displacement;

        //Get brand name
        System.out.print("Enter vehicle brand name: ");
        brand = scanner.nextLine();

        //Get vehicle model
        System.out.print("Enter vehicle model: ");
        model = scanner.nextLine();

        //Get plate number
        System.out.print("Enter vehicle plate number: ");
        plateNum = scanner.nextLine();

        //Get vehicle year model
        System.out.print("Enter vehicle year model: ");
        yearMod = scanner.nextInt();

        //Get engine displacement
        System.out.print("Enter engine displacement: ");
        displacement = scanner.nextDouble();

        // Displaying the input values
        System.out.println();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Plate: " + plateNum);
        System.out.println("Year: " + yearMod);
        System.out.printf("Engine: %.1f L", displacement);

        // Closing the scanner
        scanner.close();

    }
}
