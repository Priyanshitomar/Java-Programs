public class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int number = 100; number <= 999; number++) {
            int temp = number, sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            }
        }
    }
}
