class Solution {
    public void reverseString(char[] s) {
        int a=s.length;
        int i=0;
        int j=s.length-1;
        int l=(a+1)/2;
        while(l-->0){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
            i++;
        }
        System.out.println(s);
    }
}