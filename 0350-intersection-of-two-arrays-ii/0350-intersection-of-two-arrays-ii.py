class Solution(object):
    def intersect(self, nums1, nums2):
        count=[]
        for i in nums1:
            if i in nums2:
                count.append(i)
                nums2.remove(i)

        return count