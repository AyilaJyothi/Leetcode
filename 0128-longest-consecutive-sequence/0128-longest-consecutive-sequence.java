class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> ss=new HashSet<>();
        for(int i:nums){
            ss.add(i);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:ss){
            l.add(i);
        }
        Collections.sort(l);
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            int s=l.get(i)-i;
            arr[i]=s;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int a=0;
        for(int i:map.values()){
            a=Math.max(a,i);
        }
        return a;
    }
}