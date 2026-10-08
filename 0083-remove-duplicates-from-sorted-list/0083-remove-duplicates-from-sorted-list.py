class Solution(object):
    def deleteDuplicates(self, head):
        s = head

        while s and s.next:
            if s.val == s.next.val:
                s.next = s.next.next
            else:
                s = s.next
        return head