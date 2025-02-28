class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=0;
        for(int i=0;i<k;i++){
            b=b+a;
            a++;
        }
        // int m=(a*k)+k;
        return b;
    }
}