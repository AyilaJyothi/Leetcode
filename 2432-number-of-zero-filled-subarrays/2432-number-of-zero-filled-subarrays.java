class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int count=0;
        long total=0;
        for(int i:nums){
            if(i==0){
                count++;
            }
            else{
                count=0;
            }
            total=total+count;
        }
        return total;
    }
}