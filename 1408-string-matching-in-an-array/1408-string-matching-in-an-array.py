class Solution(object):
    def stringMatching(self, words):
        s=[]
        for i in words:
            for j in words:
                if i !=j and i in j:
                    if i not in s:
                        s.append(i)

        return s
                    
                