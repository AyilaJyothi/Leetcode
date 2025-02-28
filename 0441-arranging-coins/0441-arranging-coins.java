class Solution {
    public int arrangeCoins(int n) {

        int c=1;
        int c1=0;
        while(n>0){
            n=n-c;
            c++;
            if(n>=c){
                c1=c1+1;
            }
        }
        return c1+1;
    }
}