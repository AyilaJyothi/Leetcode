class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-1 && j==n-1){
                    return i;
                }
                if(i==j){
                    continue;
                }
                if(s.charAt(i) == s.charAt(j)){
                    break;
                }
                if(j==n-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
    