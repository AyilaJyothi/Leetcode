class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }
            else{
                m.put(i,1);
            }
        }
        int c=-1;
        for(Map.Entry<Integer,Integer> map1:m.entrySet()){
            if(map1.getKey()==map1.getValue()){
                c=map1.getKey();
            }
        }
        return c;
    }
}