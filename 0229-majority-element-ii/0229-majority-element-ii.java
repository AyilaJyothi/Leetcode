class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int a=(nums.length)/3;
        for(int i:nums){
            if(map.get(i)>a && !(l.contains(i))){
                l.add(i);
            }
        }
        return l;
    }
}