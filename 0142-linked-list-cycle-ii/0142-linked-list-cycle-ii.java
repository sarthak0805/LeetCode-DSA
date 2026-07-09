/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null || head.next.next == null) return null;
        ListNode fast = head.next.next, slow = head;
        while(fast!=slow){
            if(fast == slow) return slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}