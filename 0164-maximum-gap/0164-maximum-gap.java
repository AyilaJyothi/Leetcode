class Solution {
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int c=0;
        for(int i=1;i<nums.length;i++){
            int d=nums[i]-nums[i-1];
            if(d>c){
                c=d;
            }
        }
        return c;
    }
}