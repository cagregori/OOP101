//Gregori, Christian Jowell A.

import java.util.Scanner;

public class Mod3Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hrsWorked; int hrlyRate;

        //Get hours worked integer
        System.out.print("Enter hours worked: ");
        hrsWorked = scanner.nextDouble();

        //Get hourly rate integer
        System.out.print("Enter hourly rate: ");
        hrlyRate = scanner.nextInt();

        System.out.println();
        System.out.println("Gross Salary = " + (hrsWorked*hrlyRate));
    }
}
