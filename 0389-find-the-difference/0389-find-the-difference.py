class Solution(object):
    def findTheDifference(self, s, t):
        count = 0

        for i in s:
            count += ord(i)

        for j in t:
            count -= ord(j)

        return chr(-count)