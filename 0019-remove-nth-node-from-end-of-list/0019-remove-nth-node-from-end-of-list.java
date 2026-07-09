class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count == n) {
            return head.next;
        }

        int position = count - n;
        temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}