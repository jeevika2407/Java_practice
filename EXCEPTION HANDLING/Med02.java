package com.exception;

import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) throws InvalidInputException {
        if (a == 0 || b == 0 || a == 1 || b == 1) {
            throw new InvalidInputException("should not be 0 or 1.");
        }
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Denominator should not be zero.");
        }
        return a / b;
    }
}

public class Med02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.println("Enter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            System.out.println("Operations: +, -, *, /");
            char op = sc.next().charAt(0);

            double result = 0;

            switch (op) {
                case '+':
                    result = calc.add(num1, num2);
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    break;
                case '*':
                    result = calc.multiply(num1, num2);
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        } finally {
            sc.close();
        }
    }
}
