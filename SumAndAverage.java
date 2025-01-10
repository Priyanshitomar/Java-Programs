import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        int sum = 0;

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double average = (double) sum / size;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
