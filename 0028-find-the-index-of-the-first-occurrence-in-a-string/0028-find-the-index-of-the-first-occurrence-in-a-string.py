class Solution(object):
    def strStr(self, haystack, needle):
        for i in range(len(haystack)):
            count = 0

            for j in range(len(needle)):
                if i + j < len(haystack) and haystack[i + j] == needle[j]:
                    count += 1
                else:
                    break

            if count == len(needle):
                return i

        return -1