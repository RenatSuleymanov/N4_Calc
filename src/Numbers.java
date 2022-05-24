import java.util.Scanner;

public class Numbers extends Base {

    public Numbers(){}

    public double setInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        return scanner.nextDouble();
    }
}