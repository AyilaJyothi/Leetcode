class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s="";
        String t="";
        for(int i=0;i<word1.length;i++){
            s=s+word1[i];
        }
        for(int i=0;i<word2.length;i++){
            t=t+word2[i];
        }
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}