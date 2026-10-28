class Solution{
    public ListNode addTwoNumbers(ListNode a,ListNode b){
        ListNode dummy =new ListNode(0);
        ListNode temp =dummy;
        int carry=0;

        while (a !=null || b !=null || carry !=0) {
            int sum=carry;

            if (a !=null){
                sum += a.val;
                a = a.next;
            }

            if (b !=null) {
                sum +=b.val;
                b = b.next;
            }

            carry =sum /10;
            temp.next =new ListNode(sum %10);
            temp = temp.next;
        }

        return dummy.next;
    }
}