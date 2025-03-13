class Solution {
    public int hammingWeight(int n) {
        String a=Integer.toBinaryString(n);
        int len = a.length();
        int c=0;
        for(int i=0;i<len;i++){
            int mask=1<<i;
            if((n&mask)!=0){
                c=c+1;
            }
        }
        return c;
    }
}