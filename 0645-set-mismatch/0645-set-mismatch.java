class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int[] arr=new int[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(!s.add(nums[i])){
                arr[0]=nums[i];
            }
            sum=sum+nums[i];
        }
        int n=nums.length;
        int total=(n*(n+1))/2;
        int diff=total-(sum-arr[0]);
        arr[1]=diff;
        return arr;
    }
}