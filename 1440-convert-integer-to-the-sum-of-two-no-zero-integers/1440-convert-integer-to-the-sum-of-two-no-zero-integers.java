class Solution {
    public static int[] ContainsZero(int a,int b){
        String c=Integer.toString(a);
        String d=Integer.toString(b);
        if(!c.contains("0") && !d.contains("0")){
            int e=Integer.parseInt(c);
            int f=Integer.parseInt(d);
            return new int[]{e,f};
        }
        else{
            a++;
            b--;
            return ContainsZero(a,b);
        }
        // return new int[]{1,1};
    }
    public int[] getNoZeroIntegers(int n) {
        int a=1;
        int b=n-1;
        return ContainsZero(a,b);
    }
}