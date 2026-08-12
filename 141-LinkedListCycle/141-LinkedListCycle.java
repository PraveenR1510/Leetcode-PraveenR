// Last updated: 8/12/2026, 9:33:05 PM
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)
                 return true;
        }
        return false;
    }
}