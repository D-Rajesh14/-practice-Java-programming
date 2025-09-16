import java.util.Scanner;
class Reverceanumber
{
    public static void main(String args[])
    {
        int n, r, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();
        r = reverse(n);
        System.out.println("The reverse of the number is: " + r);
       
    }
    public static int reverse(int n)
    {
        int r, sum = 0;
        while(n > 0)
        {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return sum;
    }
}