import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger val1 = new BigInteger(num1);
        BigInteger val2 = new BigInteger(num2);
        BigInteger val = val1.multiply(val2);
        String num = val.toString();        
        return num;
    }
}