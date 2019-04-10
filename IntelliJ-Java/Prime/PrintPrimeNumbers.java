import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int num = 2;

        System.out.println("How many prime numbers do you want ?");
        int n = input.nextInt();

        while (count < n) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        double squareRoot = Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
