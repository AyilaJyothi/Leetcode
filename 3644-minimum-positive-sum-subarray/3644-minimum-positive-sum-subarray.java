class Solution {
    public static int subarray(int a, List<Integer> arr) {
        int sum = 0;
        int minPositive = Integer.MAX_VALUE;
        for (int j = 0; j < a; j++) {
            sum = sum + arr.get(j);
        }
        if (sum > 0) minPositive = sum;
        int win_sum = sum;
        for (int k = a; k < arr.size(); k++) {
            sum += arr.get(k) - arr.get(k - a);
            if (sum > 0) {
                minPositive  = Math.min(minPositive , sum);
            }
        }
        return minPositive ;
    }

    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int mini = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (i <= nums.size()) {
                int current = subarray(i, nums);
                if (current > 0) {
                    mini = Math.min(mini, current);
                }
            }
        }
        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
}
