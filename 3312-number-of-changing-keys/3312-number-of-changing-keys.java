class Solution {
    public int countKeyChanges(String s) {
        String a=s.toLowerCase();
        // System.out.println(a);
        int j=0;
        int count=0;
        for(int i=1;i<a.length();i++){
            if(a.charAt(j)!=a.charAt(i)){
                count=count+1;
            }
            j++;
        }
        return count;
    }
}