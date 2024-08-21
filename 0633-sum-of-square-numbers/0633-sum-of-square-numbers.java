class Solution {
    public boolean judgeSquareSum(int c) {
        if(c==1){
            return true;
        }
        for(long i=0;i<=c;i++){
            double number=Math.sqrt(c-(i*i));
            double decimalPart = number - (long) number;
            if(decimalPart==0){
                if((i*i)+(c-(i*i))==c){
                    return true;
                }
            } if(i*i>c){
                    break;
                }
               
            }
        return false;
    }
}