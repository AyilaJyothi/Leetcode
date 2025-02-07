class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder c = new StringBuilder();
        int i = 0, j = 0;
        int a = word1.length(), b = word2.length();
        while (i < a || j < b) {
            if (i < a) c.append(word1.charAt(i++));
            if (j < b) c.append(word2.charAt(j++));
        }
        return c.toString();
    }
}
