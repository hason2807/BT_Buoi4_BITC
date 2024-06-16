  //  bai1 _  tính tổng các số
import java.util.Scanner;

public class Bai1_Calculator {
    public int calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String input;

        while (true) {
            System.out.print("Enter a number : ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("n")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        scanner.close();
        return sum;
}
public static void main(String[] args) {
    Bai1_Calculator calculator = new Bai1_Calculator();
    int sum = calculator.calculateSum();
    System.out.println("Tong la: " + sum);
}
}
