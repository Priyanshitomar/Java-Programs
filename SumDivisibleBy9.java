public class SumDivisibleBy9 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of integers between 100 and 200 divisible by 9: " + sum);
    }
}
