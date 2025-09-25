class ReverseArray{
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        reverseArray(numArr);
        System.out.println("Reversed Array:");
        ArrayUtility.displayArray(numArr);


            
    }
    public static void reverseArray(int[] arr){
        int i =0;
        while(i < arr.length/2){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
}}