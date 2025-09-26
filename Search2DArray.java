import java.util.Scanner;
class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numArr[][] = ArrayUtility.input2DArray();
        System.out.print("Enter the element to be searched:");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound) {
            System.out.println("Element found in the array");
        } else {
            System.out.println("Element not found in the array");
        }
    }

    public static boolean search(int numArr[][], int target) {
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == target) {
                    return true;
                } else {
                    j++;
                }
            }
            i++; // 
        }
        return false;
    }
}
