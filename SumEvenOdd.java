import java.util.Scanner;
public class SumEvenOdd {
    public static int sumEven(int a, int b) {
        return a + b;
    }

    public static int sumOdd(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first even number: ");
        int even1 = scanner.nextInt();
        System.out.print("Enter second even number: ");
        int even2 = scanner.nextInt();

        System.out.print("Enter first odd number: ");
        int odd1 = scanner.nextInt();
        System.out.print("Enter second odd number: ");
        int odd2 = scanner.nextInt();

        int evenSum = sumEven(even1, even2);
        int oddSum = sumOdd(odd1, odd2);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
