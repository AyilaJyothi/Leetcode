class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c = 0;
        List<Integer> l = new ArrayList<>();
        StringBuilder s = new StringBuilder(s1);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                c = c + 1;
                l.add(i);
                if (c == 2) {
                    int a = l.get(0);
                    int b = l.get(1);
                    char temp = s.charAt(a);
                    s.setCharAt(a, s.charAt(b));
                    s.setCharAt(b, temp);
                }
            }
        }
        System.out.println(s);
        String d=s.toString();
        if (d.equals(s2)) {
            return true;
        }
        return false;
    }
}