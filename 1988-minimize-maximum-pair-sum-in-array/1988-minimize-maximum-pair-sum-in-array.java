class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        List<Integer> List =new ArrayList<>();
        while(i<j){
            // List<Integer> List =new ArrayList<>();
            List.add(nums[i]+nums[j]);
            i++;
            j--;
        }
        return Collections.max(List);
    }
}