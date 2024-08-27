import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;

        StringBuilder str = new StringBuilder();
        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                // Append the current range to the list
                if (start == end) {
                    str.append(start);
                } else {
                    str.append(start).append("->").append(end);
                }
                list.add(str.toString());
                str.setLength(0);  // Reset StringBuilder

                // Start a new range
                start = nums[i];
                end = nums[i];
            }
        }

        // Append the last range
        if (start == end) {
            str.append(start);
        } else {
            str.append(start).append("->").append(end);
        }
        list.add(str.toString());

        return list;
    }
}
