import java.util.Scanner;

public class Calculator {
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String breakerString = "Y";

        while (breakerString.toLowerCase().equals("y")) {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("+ = addition");
            System.out.println("- = subtraction");
            System.out.println("* = multiplication");
            System.out.println("/ = division");

            char operator = scanner.next().charAt(0);
            double result;
            switch (operator) {
                case '+': 
                {
                    result = addition(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                }

                case '-': 
                {
                    result = substraction(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                }

                case '*': 
                {
                    result = multiplication(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                }

                case '/':
                {
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not possible.");
                        break;
                    }
                    result = division(num1, num2);
                    System.out.println("Result = " + result);
                    break;
                }
            
                default:
                {
                    System.out.println("Error: Invalid Operation");
                    break;
                }
            }

            System.out.println("Continue using Calculator(Y/N): ");
            breakerString = scanner.next();
        }

        scanner.close();
        System.out.println("Thank You for using my Calculator.");
    }
}
