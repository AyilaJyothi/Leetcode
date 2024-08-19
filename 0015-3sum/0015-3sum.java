import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                         s.add(list);
                         j++;
                         k--;
            }
            else if(nums[i]+nums[j]+nums[k]>0)
            {
                k--;
            }
            else{
                j++;
            }
        }
        }
        l.addAll(s);
        return l;
    }
}
   