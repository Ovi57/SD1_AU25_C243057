import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = input.next().charAt(0);

        if (op == '+') {
            System.out.println("Result = " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("Result = " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("Result = " + (num1 * num2));
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        input.close();
    }
    
}
