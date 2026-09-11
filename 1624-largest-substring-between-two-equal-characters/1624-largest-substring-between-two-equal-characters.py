class Solution(object):
    def maxLengthBetweenEqualCharacters(self, s):
        k=-1
        for i in range(len(s)):
            for j in range(i+1,len(s)):
                if s[i]==s[j]:
                    k=max(k,j-i-1)
        return k