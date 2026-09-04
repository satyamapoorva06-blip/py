class Solution(object):
    def intersection(self, nums1, nums2):
        count=[]
        for i in nums1:
            if  i in nums2 and i not in count:
                count.append(i)
                nums2.remove(i)
        return count