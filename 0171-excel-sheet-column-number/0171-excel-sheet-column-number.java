class Solution {
    public int titleToNumber(String columnTitle) {
        int count=0;
        for(int i=0;i<columnTitle.length();i++){
            count=count*26;
            count=count+columnTitle.charAt(i)-'A'+1;
        }
        return count;
    }
}