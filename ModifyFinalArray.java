public class ModifyFinalArray {
    public static void main(String[] args) {
        final int[] array = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        // Modifying an element
        array[2] = 99;

        System.out.println("\nModified Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
