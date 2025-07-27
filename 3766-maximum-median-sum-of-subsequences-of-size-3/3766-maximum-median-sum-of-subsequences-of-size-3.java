class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int a=(nums.length)/3;
        long sum=0;
        for(int i=nums.length-1;i>=0;i=i-2){
            sum=sum+nums[i-1];
            a--;
            if(a==0){
                break;
            }
        }
        return sum;
    }
}