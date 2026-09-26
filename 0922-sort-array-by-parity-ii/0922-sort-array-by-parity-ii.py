class Solution(object):
    def sortArrayByParityII(self, nums):
        a = [0] * len(nums)
        e = 0  
        o = 1 

        for i in nums:
            if i % 2 == 0:
                a[e] = i
                e += 2
            else:
                a[o] = i
                o += 2

        return a