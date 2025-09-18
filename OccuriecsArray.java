import java.util.Scanner;
class OccuriecsArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numArray[] = ArrayUtility.inputArray();
        System.out.print("Enter the number to find its occurrences: ");
        int num = input.nextInt();
        int occerences = numberOfOccurrences(numArray, num);
        System.out.println("The number of occurrences of "+num+" in the array is: "+occerences);
        input.close();


    }
    public static int numberOfOccurrences(int[] numArray, int num){
        int occ =0;
        int i =0;
        while(i < numArray.length){
            if(numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
    
}
