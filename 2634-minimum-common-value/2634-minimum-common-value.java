import java.util.*;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Long> set = new HashSet<>();
        Map<Long, Long> m = new TreeMap<>();

        for (int num : nums1) {
            set.add((long) num);
        }
        for (int num : nums2) {
            if (set.contains((long) num)) {
                m.put((long) num, 2L);
            } else {
                m.put((long) num, 1L);
            }
        }
        for (Map.Entry<Long, Long> ele : m.entrySet()) {
            if (ele.getValue() == 2) {
                return ele.getKey().intValue();
            }
        }
        return -1;
    }
}
