class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] hash=new int[1001];
        for(int i=0;i<nums1.length;i++){
            hash[nums1[i]]++;
        }
        int count=0;
        for(int i=0;i<nums2.length;i++){
            if(hash[nums2[i]]>0){
                count++;
                hash[nums2[i]]--;
            }
        }
        int[] ans=new int[count];
        for (int i = 0; i < nums1.length; i++) {
            hash[nums1[i]]++;
        }

        int k = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (hash[nums2[i]] > 0) {
                ans[k++] = nums2[i];
                hash[nums2[i]]--;
            }
        }

        return ans;
    }
}