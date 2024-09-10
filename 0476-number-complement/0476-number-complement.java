class Solution {
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);
        StringBuilder complement = new StringBuilder();
        for (char bit : binaryString.toCharArray()) {
            complement.append(bit == '0' ? '1' : '0');
        }
        return Integer.parseInt(complement.toString(), 2);
    }
}
