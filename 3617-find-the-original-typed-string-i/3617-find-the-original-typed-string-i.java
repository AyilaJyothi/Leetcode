class Solution {
    public int possibleStringCount(String word) {
        int a=word.length();
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)!=word.charAt(i)){
                a=a-1;
            }
        }
        return a;
    }
}