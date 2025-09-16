import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }

        int i = 2;
        while (i < num) { // check divisibility from 2 to num-1
            if (num % i == 0) {
                return false; // divisible, not prime
            }
            i++;
        }

        return true; // no divisors found, prime
    }
}
