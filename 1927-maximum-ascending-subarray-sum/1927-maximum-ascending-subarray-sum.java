class Solution {
    
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum=sum+nums[i];
            }
            else{
                max=Math.max(max,sum);
                sum=nums[i];
            }
        }
        return Math.max(max,sum);
    }
}