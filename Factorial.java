import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        long fact=fact(n);
        System.out.println("Factorial of "+n+" is: "+fact);
    }
    public static long fact(int n){
        if(n<2){
            return 1;
        }
        int i = 2;
        long factorial = 1;
        while(i<=n){
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
} 