class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k = k%n;
        int c=n-k;
        List<Integer> list = new ArrayList<>();
        for(int i=c;i<n;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<c;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=list.get(i);
        }
    }
}