class Solution(object):
    def reverseWords(self, s):
        t=s.split()
        ans=[]

        for i in t:
            ans.append(i[::-1])

        return " ".join(ans)

        