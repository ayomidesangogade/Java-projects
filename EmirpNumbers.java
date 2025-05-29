
public class EmirpNumbers {
    public static void main(String[] args) {
        displayEmirps();
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int reverseNum(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    static void displayEmirps() {
        int count = 0;
        int num = 13;

        while (count < 100) {
            if (isPrime(num) && isPrime(reverseNum(num)) && num != reverseNum(num)) {
                System.out.print(num + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }
}
