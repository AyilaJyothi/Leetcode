class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: List[str]
        """
        s=s1.split(" ")
        t=s2.split(" ")
        l=[]
        for word in s+t:
            if (s+t).count(word)==1:
                l.append(word)
        return l
        