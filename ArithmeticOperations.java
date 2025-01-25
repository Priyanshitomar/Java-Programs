public class ArithmeticOperations {
    public static int operate(int a, int b) {
        return a + b;
    }

    public static int operate(int a, int b, char operator) {
        if (operator == '-') return a - b;
        else if (operator == '*') return a * b;
        return 0; // Default case
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + operate(10, 5));
        System.out.println("Subtraction: " + operate(10, 5, '-'));
        System.out.println("Multiplication: " + operate(10, 5, '*'));
    }
}
