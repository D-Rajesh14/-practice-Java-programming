import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int nums[] = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the element no" + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] nemArr) {
        int i = 0;
        while (i < nemArr.length) {
            System.out.print(nemArr[i] + " ");
            i++;
        }
        System.out.println(); // optional, for newline after printing array
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = input.nextInt();
        int nums[][] = new int[rows][cols];
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("Enter the element no" + (i + 1) + "," + (j + 1) + ": ");
                nums[i][j] = input.nextInt(); 
                j++;
            }
            i++;
        }
        return nums;
    }
}
