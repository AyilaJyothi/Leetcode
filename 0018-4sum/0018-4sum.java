import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list1=new ArrayList<>();
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                      long m=(nums[i]+nums[j]);
                      long d= (nums[k]+nums[l]);
                    if(m+d==target  ) {
                        List<Integer> List=new ArrayList<>();
                        List.add(nums[i]);
                        List.add(nums[j]);
                        List.add(nums[k]);
                        List.add(nums[l]);
                        s.add(List);
                        k++;
                        l--;
                    //    long m=(nums[i]+nums[j]);
                    //   long d= (nums[k]+nums[l]);
                    //   System.out.println(m+d);
                    }
                    else if(nums[i]+nums[j]+nums[k]+nums[l]>target){
                            l--;
                    }
                    else{
                        k++;
                    }
                }
            }
        }
        list1.addAll(s);
        return list1;
    }
}