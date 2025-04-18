class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a1=nums[n-1]*nums[n-2]*nums[n-3];
        int a2=nums[n-1]*nums[0]*nums[1];
        int c=Math.max(a1,a2);
        return c;
    }
}