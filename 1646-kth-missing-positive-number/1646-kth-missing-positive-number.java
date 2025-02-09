class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int a=arr[n-1];
        int c=0;
        int g=0;
        List<Integer>l=new ArrayList<>();
        for(int num:arr){
            l.add(num);
        }
        System.out.print(l);
        for(int i=1;i<=(a+k);i++){
            if(!l.contains(i)){
                c=c+1;
                if(c==k){
                    g=i;
                }
            }
        }
        return g;
    }
}