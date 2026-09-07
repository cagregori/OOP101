package com.mycompany.exercise1;
//Gregori, Christian Jowell A. TA21

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);

      //Get name string
        System.out.print("Enter your name: ");
        scanner.nextLine(); // Consume the newline character
        String studentName = scanner.nextLine();

      //Get student number string
        System.out.print("Enter your student number: ");
        scanner.nextLine(); // Consume the newline character
        String studentNum = scanner.nextLine();

      //Get program name string
        System.out.print("Enter your program: ");
        scanner.nextLine(); // Consume the newline character
        String studentProgram = scanner.nextLine();

      //Get year level integer
        System.out.print("Enter an integer: ");
        int studentYearLevel = scanner.nextInt();

      //Get GPA double
        System.out.print("Enter your GPA: ");
        double studentGPA = scanner.nextDouble();

        // Displaying the input values
        System.out.println("Name: " + studentName);
        System.out.println("Student Number: " + studentNum);
        System.out.println("Program: " + studentProgram);
        System.out.println("Year: " + studentYearLevel);
        System.out.printf("GPA: %.2f%n", studentGPA);

        // Closing the scanner
        scanner.close();
      
    }    
}
