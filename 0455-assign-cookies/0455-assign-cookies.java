class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m=g.length;
        int n=s.length;
        int c=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(g[j]<=s[i]){
                c=c+1; 
                j++;
                if(m==j){
                    return c;
                } 
            }
        }
        return c;
    }
}