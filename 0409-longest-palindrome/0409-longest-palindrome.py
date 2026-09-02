class Solution(object):
    def longestPalindrome(self, s):
        d = {}

        for i in s:
            if i in d:
                d[i] += 1
            else:
                d[i] = 1

        ans = 0
        odd = False

        for i in d.values():
            if i % 2 != 0:
                ans += i - 1
                odd = True
            else:
                ans += i

        if odd:
            ans += 1

        return ans