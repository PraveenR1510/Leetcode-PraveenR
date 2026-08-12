// Last updated: 8/12/2026, 9:29:32 PM
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int gcd = gcd(curr.val, curr.next.val);

            ListNode node = new ListNode(gcd);
            node.next = curr.next;
            curr.next = node;

            curr = node.next; // move to original next node
        }

        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}