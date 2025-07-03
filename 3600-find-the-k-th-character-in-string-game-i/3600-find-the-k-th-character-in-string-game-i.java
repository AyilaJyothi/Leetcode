class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k){
            StringBuilder s = new StringBuilder();
            for(int i=0;i<sb.length();i++){
                char ch=sb.charAt(i);
                char ch1=(ch=='z')?'a':(char)(ch+1);
                s.append(ch1);
            }
            sb.append(s);
        }
        return sb.charAt(k-1);
    }
}