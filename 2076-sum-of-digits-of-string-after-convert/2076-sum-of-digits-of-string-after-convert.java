class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
        for (char c : s.toCharArray()) {
            int n = c - 'a' + 1;
            ans += n / 10 + n % 10;
        }
        while (k > 1) {
            int n = 0;
            while (ans > 0) {
                n += ans % 10;
                ans /= 10;
            }
            ans = n;
            k--;
        }
        return ans;
    }
}