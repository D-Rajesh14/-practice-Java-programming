import java.util.*;
public class Palindrom {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is a Palindrome number.");
        } else {
            System.out.println(num+" is not a Palindrome number.");
        }
        sc.close();
    }
    public static boolean isPalindrome(int num){
        int originalNum=num;
        int reversedNum=0;
        while(num>0){
            int digit=num%10;
            reversedNum=reversedNum*10+digit;
            num/=10;
        }
        return reversedNum==originalNum;
    }
    
}
