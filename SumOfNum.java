import java.util.Scanner;
public class SumOfNum {
    public static int calculateSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSum(number);
        System.out.println("Sum of digits: " + sum);
    }
}
