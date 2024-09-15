class Solution(object):
    def commonChars(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        result=list(words[0])
        for word in words[1:]:
            temp=[]
            for char in word:
                if char in result:
                    temp.append(char)
                    result.remove(char)
            result =temp
        return result        