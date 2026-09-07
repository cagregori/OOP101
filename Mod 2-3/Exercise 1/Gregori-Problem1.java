package com.mycompany.exercise1;
//Gregori, Christian Jowell A. TA21

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        
        String studentName;
        String studentNum;
        String studentProgram;
        int studentYearLevel;
        double studentGPA;

      //Get name string
        System.out.print("Enter your name: ");
        studentName = scanner.nextLine(); // Consume the newline character

      //Get student number string
        System.out.print("Enter your student number: ");
        studentNum = scanner.nextLine(); // Consume the newline character

      //Get program name string
        System.out.print("Enter your program: ");
        studentProgram = scanner.nextLine(); // Consume the newline character

      //Get year level integer
        System.out.print("Enter your year level: ");
        studentYearLevel = scanner.nextInt();

      //Get GPA double
        System.out.print("Enter your GPA: ");
        studentGPA = scanner.nextDouble();

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
