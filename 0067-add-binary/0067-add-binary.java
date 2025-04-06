import java.math.BigInteger;
class Solution {
    public static String addBinary(String binary1, String binary2) {
            BigInteger num1 = new BigInteger(binary1, 2);
            BigInteger num2 = new BigInteger(binary2, 2);
            BigInteger sum = num1.add(num2);
            return sum.toString(2);
       
    }
}