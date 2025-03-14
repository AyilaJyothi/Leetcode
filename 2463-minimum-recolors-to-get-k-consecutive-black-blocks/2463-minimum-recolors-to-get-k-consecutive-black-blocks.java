class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count=count+1;
            }
        }
        int max=count;
        for(int i=k;i<n;i++){
            if(blocks.charAt(i)=='W'){
                count=count+1;
            }
            if(blocks.charAt(i-k)=='W'){
                count=count-1;
            }
            max=Math.min(max,count);
        }
        return max;
    }
}