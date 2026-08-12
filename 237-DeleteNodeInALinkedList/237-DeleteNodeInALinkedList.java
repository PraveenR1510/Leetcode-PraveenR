// Last updated: 8/12/2026, 9:32:23 PM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}