import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix (and rows for the second): ");
        int cols1Rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1Rows2];
        int[][] matrix2 = new int[cols1Rows2][cols2];
        int[][] product = new int[rows1][cols2];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1Rows2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < cols1Rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1Rows2; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
