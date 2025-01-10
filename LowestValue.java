import java.util.Scanner;
public class LowestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Lowest value in the array: " + min);
    }
}
