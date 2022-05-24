public class Base {
    public static void main(String[] args) throws Exception {
        Numbers num = new Numbers();
        double numberOne = num.setInputNumber();
        double numberTwo = num.setInputNumber();
        Calculator calculator = new Calculator();
        char operation = calculator.getOperation();
        try {
            double result = calculator.setResult(numberOne, numberTwo, operation);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e){
            System.out.println("Error devided by 0: " + e.getMessage());
        }
    }
}