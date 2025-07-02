class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int i = 0, c = 1, max = 1;
        for (int j = 1; j < s.length(); j++) {
            for (int k = i; k < j; k++) {
                if (s.charAt(k) == s.charAt(j)) {
                    i = k + 1;
                    c = j - i + 1;
                    break;
                } else {
                    c = j - i + 1;
                }
            }
            max = Math.max(max, c);
        }
        return max;
    }
}