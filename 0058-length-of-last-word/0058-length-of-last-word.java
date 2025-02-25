class Solution {
    public int lengthOfLastWord(String s) {
        // int n=s.length();
        String[] s1=s.split(" ");
        String a=s1[s1.length-1];
        int d=a.length();
        return d;
    }
}