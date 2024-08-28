class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list1.add(nums2[i]);
        }
        Collections.sort(list1);
        int l=list1.size();
        for(int j=0;j<l;j++){
            if(l%2!=0){
                int m=l/2;
                return list1.get(m);
            }
            else{
                int m=l/2;
                return (list1.get(m)+list1.get(m-1))/2.0;
            }
        }
        return 1;
    }
}