class Solution {
    public int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (j < nums.length && nums[i] == 0) {
                if (nums[j] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                }
                j++;
            }
        }
        return nums;
    }
}