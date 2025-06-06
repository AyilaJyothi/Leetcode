class Solution {
    public static boolean isDividing(int num){
        int a=num;
        while(a>0){
            int digit=a%10;
            if(digit==0 || num % digit!=0){
                return false;
            }
            a=a/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isDividing(i)){
                result.add(i);
            }
        }
        return result;
    }
}