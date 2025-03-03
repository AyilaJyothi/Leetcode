class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                l1.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                l1.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=l1.get(i);
        }
        return nums;
    }
}