class Solution(object):
    def merge(self, nums1, m, nums2, n):
        l = []
        for i in range(m):
            l.append(nums1[i])
        for j in range(n):
            l.append(nums2[j])
        l.sort()
        for i in range(m + n):
            nums1[i] = l[i]
