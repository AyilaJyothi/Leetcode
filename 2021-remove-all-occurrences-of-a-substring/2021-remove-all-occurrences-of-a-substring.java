class Solution {
    public String removeOccurrences(String s, String part) {
        int n=s.length();
        // System.out.println(n);
        while(s.contains(part)){
            s=s.replaceFirst(part,"");
            // System.out.println(s);
        }
        return s;
    }
}