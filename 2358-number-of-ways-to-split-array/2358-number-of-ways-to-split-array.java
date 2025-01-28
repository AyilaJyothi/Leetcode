class Solution {
    public int waysToSplitArray(int[] nums) {
        long c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            c=c+nums[i];
        }
        // System.out.println(c);
        int count=0;
        long s=0;
        for(int i=0;i<n-1;i++){
            c=c-nums[i];
            s=s+nums[i];
            // System.out.println(c);
            if(s>=c){
                count=count+1;
                // System.out.println(count);
            }
        }
        return count;
    }
}