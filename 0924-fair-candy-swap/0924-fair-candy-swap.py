class Solution(object):
    def fairCandySwap(self, aliceSizes, bobSizes):
        """
        :type aliceSizes: List[int]
        :type bobSizes: List[int]
        :rtype: List[int]
        """
        sum1=sum(aliceSizes)
        sum2=sum(bobSizes)
        c=(sum1-sum2)//2
        d=set(bobSizes)
        for e in aliceSizes:
            if e-c in d:
                return[e,e-c]