class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
         String[] words=text.split(" ");
         int count=0;
         for(String word:words){
            int broken=0;
            for(int i=0;i<brokenLetters.length();i++){
                String ch=String.valueOf(brokenLetters.charAt(i));
                if(word.contains(ch)){
                    broken++;
                    break;
                }
            }
            if(broken==0){
                count++;
            }
         }
         return count;
    }
}