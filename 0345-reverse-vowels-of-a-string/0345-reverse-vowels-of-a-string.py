class Solution:
    def reverseVowels(self, s):
        vowels = "aeiouAEIOU"
        s = list(s)
        v = []
        for x in s:
            if x in vowels:
                v.append(x)
        v.reverse()
        j = 0
        for i in range(len(s)):
            if s[i] in vowels:
                s[i] = v[j]
                j += 1
        return "".join(s)