class Solution {
    public int[] diStringMatch(String s) {
        int min =0;
        int max =s.length();
        int[] result = new int[max+1];
        int i =0;
        
        for(i = 0; i < s.length(); i++) {
           result[i] = s.charAt(i) == 'I' ? min++ : max--;
        }
        result[i] = min;
        return result;
     }
}