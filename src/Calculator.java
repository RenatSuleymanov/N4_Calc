import java.util.Scanner;

public class Calculator extends Base {
    static Scanner scanner = new Scanner(System.in);

    public Calculator() {}

    public double setResult(double firstNumber, double secondNumber, char operation) throws Exception {
        double result;
        switch (operation) {
            case '+':
                result = addition(firstNumber, secondNumber);
                break;
            case '-':
                result = subtraction(firstNumber, secondNumber);
                break;
            case '*':
                result = multiplication(firstNumber, secondNumber);
                break;
            case '/':
                result = divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Unknown operation. Reenter operation!");
                result = setResult(firstNumber, secondNumber, getOperation());
        }
        return result;
    }

    public Character getOperation() {
        System.out.print("Enter operation: ");
        char operation;
        operation = scanner.next().charAt(0);
        try {
            if (operation == '%') {
                throw new Exception("Unknown operation. Choose '/', '*', '+' or '-'");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return operation;
    }

    private static double addition(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}