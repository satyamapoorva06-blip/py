class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a = null;
        ListNode b = head;

        while (b != null) {
            ListNode next = b.next;
            b.next = a;
            a = b;
            b = next;
        }

        return a;
    }
}