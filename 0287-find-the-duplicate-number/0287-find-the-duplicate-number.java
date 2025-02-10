class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>1){
                return e.getKey();
            }
        }
        return -1;
    }
}