import java.util.Scanner;
public class Yatzy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diceNumber;

        while (true) {
            System.out.print("Roll the dice (1-6): ");
            diceNumber = scanner.nextInt();
            if (diceNumber == 6) {
                System.out.println("Yatzy!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
