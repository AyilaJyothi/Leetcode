class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(nums[i]==n){
                    n++;
                }
                else if(nums[i]<n){
                    n=n;
                }
                else{
                    return n;
                }
            }
        }
        if(n<=nums.length) return n;
        return nums.length+1;
    }
}