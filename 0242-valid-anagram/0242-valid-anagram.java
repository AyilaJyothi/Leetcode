class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1=s.toCharArray();
        Arrays.sort(c1);
        String s1 = new String(c1);
        char[] c2=t.toCharArray();
        Arrays.sort(c2);
        String s2=new String(c2);
        if(s1.equals(s2)){
            return true;
        }
        return false;

    }
}