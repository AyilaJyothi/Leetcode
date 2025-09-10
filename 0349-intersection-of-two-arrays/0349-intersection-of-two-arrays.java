class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> newSet1 = new HashSet<>();
        for (int i : nums1) {
            newSet1.add(i);
        }
        
        Set<Integer> l1 = new HashSet<>();
        for (int i : nums2) {
            if (newSet1.contains(i)) {
                l1.add(i);
            }
        }

        int[] arr = new int[l1.size()];
        int idx = 0;
        for (int i : l1) {
            arr[idx++] = i;
        }
        return arr;
    }
}
