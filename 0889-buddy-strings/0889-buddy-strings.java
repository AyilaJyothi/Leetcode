class Solution {
    public boolean buddyStrings(String s, String goal) {
        int a = s.length();
        int b = goal.length();
        if (a != b) {
            return false;
        }
        if (a == 2) {
            if (s.equals(goal)) {
                if (s.charAt(0) == s.charAt(1)) {
                    return true;
                }
                return false;
            }
        }
        int k = 0, l = 0, m = 0, n = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count = count + 1;
                if (count == 1) {
                    k = s.charAt(i);
                    l = goal.charAt(i);
                }
                if (count == 2) {
                    m = s.charAt(i);
                    n = goal.charAt(i);
                }
            }
        }
        if (count == 2) {
            if (k == n && l == m) {
                return true;
            }
        } else if (count == 0) {
            Set<Character> set1 = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set1.add(s.charAt(i));
            }
            System.out.println(set1.size());
                if (set1.size()==s.length()) {
                    return false;
                }
            return true;
        }
        return false;
    }
}