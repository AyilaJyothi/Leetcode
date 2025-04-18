class Solution {
    public int reachNumber(int target) {
        target=Math.abs(target);
        int s=0;
        int steps=0;
        while(s<target || (s-target)%2!=0){
            steps++;
            s=s+steps;
        }
        return steps;
    }
}