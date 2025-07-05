class Solution {
    public boolean isPalindrome(String s) {
        // String a=s.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(((int)s.charAt(i)>=48 && (int)s.charAt(i)<=57)  || ((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90) || ((int)s.charAt(i)>=97 && (int)s.charAt(i)<=122)){
                sb.append(Character.toLowerCase(s.charAt(i)));
                // sb.toLowerCase();
            }
        }
        int left=0;
        int right=sb.length()-1;
        while(left<right){
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}