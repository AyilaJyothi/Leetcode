class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>>que=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            que.offer(ele);
        }
         int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=que.poll().getKey();
        }

        return arr ;
    }
}