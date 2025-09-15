import java.util.Scanner;

public class MultiplectionTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();
        multiplicationTable(num);
    }
    public static void multiplicationTable(int n){
        int i =1;
        while(i<=10){
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
    }
}
}