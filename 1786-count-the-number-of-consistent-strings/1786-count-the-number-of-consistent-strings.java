class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> charSet=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            charSet.add(allowed.charAt(i));
        }
        int count=0;
        for(String word:words){
            boolean a=true;
            for(int i=0;i<word.length();i++){
                if(!charSet.contains(word.charAt(i))){
                    a=false;
                    break;
                }
            }
            if(a){
                count++;
            }
        }
        return count;
    }
}