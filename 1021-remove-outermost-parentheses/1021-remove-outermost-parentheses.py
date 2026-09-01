class Solution(object):
    def removeOuterParentheses(self, s):
        count = 0
        ans = ""

        for i in s:
            if i == "(":
                count += 1
                if count > 1:
                    ans += i
            else:
                if count > 1:
                    ans += i
                count -= 1

        return ans