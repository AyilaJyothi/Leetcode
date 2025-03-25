class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count=0;
        Set<Integer> s=new HashSet<>();
        for(int i=nums.size()-1;i>=0;i--){
            count++;
            if(nums.get(i)<=k){
                s.add(nums.get(i));
            }
            if(s.size()==k){
                break;
            }
        }
        return count;
    }
}