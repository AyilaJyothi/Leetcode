class Solution {
    public int climbStairs(int n) {
        ArrayList<Integer> l=new ArrayList<>();
        if(n==1 || n==0){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a=1;
        int b=2;
        l.add(a);
        l.add(b);
        int c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            l.add(c);
            a=b;
            b=c;
            System.out.println(l);
        }
        return c;
    }
}