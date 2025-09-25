class PalindromeArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if (isPalin) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int[] numArr) {  // <-- fixed parameter type
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
