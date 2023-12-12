package com.generation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your first name:  ");
        String firstName = console.next();

        System.out.println("Enter your last name:  ");
        String lastName = console.next();

        printFullName(firstName, lastName);
        printNameCharacters(firstName);
        printNameLength(firstName);

        

        // Part 2: CalculatorBrain
        Scanner calculatorConsole = new Scanner(System.in);  // Create a new Scanner
        CalculatorBrain calculator = new CalculatorBrain();
        System.out.println("Enter two numbers for arithmetic operations:");
        double num1 = calculatorConsole.nextDouble();
        double num2 = calculatorConsole.nextDouble();

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));

        // Challenge: Square Root and Power Of
        System.out.println("Square Root of " + num1 + ": " + calculator.squareRoot(num1));
        System.out.println(num1 + " to the power of " + num2 + ": " + calculator.powerOf(num1, num2));

        // Close the Scanner after user input
        console.close();
        
        // Close the new Scanner
        calculatorConsole.close();
    }

    private static void printNameLength(String name) {
        System.out.println("Length of the name: " + name.length());
    }

    private static void printNameCharacters(String name) {
        System.out.println("Characters in the name:");
        for (char c : name.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println(); // Move to the next line after printing characters.
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}
