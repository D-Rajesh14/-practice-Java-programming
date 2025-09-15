import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = Scanner.nextInt();
       int sum=odd(n);
         System.out.println("Sum of odd numbers upto " + n + " is " + sum);
    }
    public static int odd(int n){
        int i =1;
        int sum =0;
        while(i<=n){
            sum = sum + i;
            i+=2;
        }
       return sum;
    }
}
