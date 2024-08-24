class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int a=(nums.length+1)/2;
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=a){
                return nums[i];
            }
        }
        return 1;
    }
}