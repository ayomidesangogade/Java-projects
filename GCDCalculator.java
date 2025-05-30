
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers:");

        int[] userNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        int resultGCD = gcd(userNumbers);
        System.out.println("GCD of the entered numbers is: " + resultGCD);
    }

    public static int gcd(int... numbers) {
        if (numbers.length == 0) {
            return 0; // No numbers provided
        }

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = findGCD(result, numbers[i]);
        }

        return result;
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
