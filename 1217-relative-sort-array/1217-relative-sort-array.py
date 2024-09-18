class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        """
        :type arr1: List[int]
        :type arr2: List[int]
        :rtype: List[int]
        """
        l=[]
        for i in range(len(arr2)):
            for j in range(len(arr1)):
                if arr2[i] == arr1[j]:
                    l.append(arr1[j])
        remaining = [x for x in arr1 if x not in arr2]
        l.extend(sorted(remaining))
        return l     