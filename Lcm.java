import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int fact=lcm(num1,num2);
        System.out.println("LCM of "+num1+" and "+num2+" is: "+fact);
       
    }
    public static int lcm(int a, int b){
       int i =1;
         while(true){
              int fact = a*i;
              if(fact%b==0){
                  return fact;
              }
              i++;
    }
}
}