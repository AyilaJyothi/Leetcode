class Solution {
    public int findMin(int[] nums) {
        int a=Integer.MAX_VALUE;
        for(int i:nums){
            a=Math.min(a,i);
        }
        return a;
    }
}