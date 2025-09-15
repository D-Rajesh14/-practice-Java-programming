import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to find sum of its digits: ");
        int n = scn.nextInt();
        int sum = sumOfDigits(n);
        System.out.println("Sum of digits of "+n+" is: "+sum);
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
}