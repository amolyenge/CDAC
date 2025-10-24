

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int n2 = sc.nextInt();

        System.out.print("Enter Operator (+, -, *, /, %): ");
        String op = sc.next();

        try {
            int result = Calculator.calculate(n1, n2, op);
            System.out.println("Result: " + result);
        } catch (WrongOperatorException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
