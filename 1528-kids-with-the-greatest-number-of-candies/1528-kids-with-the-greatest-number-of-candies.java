class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int a=candies[0];
        int b=candies.length;
        for(int i=0;i<b;i++){
            if(candies[i]>a){
            a=candies[i];
            }
        }
    for(int i=0;i<b;i++){
        list.add(candies[i]+extraCandies>=a);

    }
    return list;
}
}