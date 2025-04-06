class Solution {
    public boolean isPalindrome(int number) {
       if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}


