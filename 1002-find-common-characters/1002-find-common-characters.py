from collections import Counter

class Solution(object):
    def commonChars(self, words):
        ans = Counter(words[0])

        for word in words[1:]:
            ans &= Counter(word)

        return list(ans.elements())