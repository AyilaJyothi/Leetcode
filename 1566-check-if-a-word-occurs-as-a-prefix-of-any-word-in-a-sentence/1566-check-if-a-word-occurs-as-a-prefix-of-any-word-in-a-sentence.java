class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        StringBuilder sb=new StringBuilder();
        sentence=sentence+" ";
        int j=0;
        for(int i=0;i<sentence.length();i++){
            if(((int)sentence.charAt(i))!=32){
                sb.append(sentence.charAt(i));
                // System.out.println(sb);
            }
            else{
                j++;
                System.out.println(sb);
                if(sb.toString().startsWith(searchWord)){
                    return j;
                }
                sb.setLength(0);
            }
        }
        return -1;
    }
}