//Gregori, Christian Jowell A. TA21

import java.util.Scanner;

public class Mod3Problem1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      int hrsWorked; int hrlyRate;

      //Get hours worked integer
      System.out.print("Enter hours worked: ");
      hrsWorked = scanner.nextInt();

      //Get hourly rate integer
      System.out.print("Enter hours worked: ");
      hrlyRate = scanner.nextInt();

      System.out.println();
      System.out.println("Gross Salary = " + (hrsWorked*hrlyRate));
    }
}
