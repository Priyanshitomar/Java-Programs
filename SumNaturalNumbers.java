import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }
}
