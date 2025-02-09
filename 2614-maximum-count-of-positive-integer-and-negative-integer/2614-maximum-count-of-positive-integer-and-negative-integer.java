class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                c1=c1+1;
            }
            else if(nums[i]<0){
                c2=c2+1;
            }
            else{
                continue;
            }
        }
        return Math.max(c1,c2);
    }
}