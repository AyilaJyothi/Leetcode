class Solution {
    public static boolean palindrome(String s,int x,int y){
        while(x<y){
            if(s.charAt(x)==s.charAt(y)){
                x++;
                y--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int a=s.length();
        int i=0;
        int j=s.length()-1;
        int count=0;
        int d=0;
        while(a-->0){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                d=(a+1)-2;
                if(d<3){
                    return true;
                }
            }
            else{
                boolean w=palindrome(s,i+1,j);
                boolean z=palindrome(s,i,j-1);
                if(w||z){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}