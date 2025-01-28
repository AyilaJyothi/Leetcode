class Solution {
    public int prefixCount(String[] words, String pref) {
        int s=words.length;
        int count=0;
        for(int i=0;i<s;i++){
            if(words[i].startsWith(pref)){
                count=count+1;
            }
        }
        return count;
    }
}