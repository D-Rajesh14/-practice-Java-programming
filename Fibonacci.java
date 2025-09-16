import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=sc.nextInt();
        fibonacciSeries(n);
        sc.close();
        
    }
    public static void fibonacciSeries(int n){
        int a=0,b=1;
        System.out.print(a+" "+b);
        while(n>2){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            n--;
        }
    }
}