
import java.util.Scanner;
class DeleteFromArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now,enter then number you want to delete: ");
        int numToDelete = input.nextInt();
       
        int[] newArr =deleteNumber(numArr, numToDelete);
         System.out.println("Here is the new array ");
         ArrayUtility.displayArray(newArr);
        
    }
    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ = OccuriecesArray.numberOfOccurrences(numArr, numToDelete);
        if (occ == 0){
            System.out.println("The number you want to delete is not found in the array");
            return numArr;  
            
        }
         int newSize = numArr.length - occ;
         int[] newArr = new int[newSize]; 
            int i = 0, j = 0;
            while (i < numArr.length) {
                if (numArr[i] != numToDelete) {
                    newArr[j] = numArr[i];
                    j++;
                }
                i++;
            }
         
         return newArr;
    }
}