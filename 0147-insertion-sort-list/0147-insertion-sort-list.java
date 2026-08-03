/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        while(head!=null){
            pq.offer(head.val);
            head = head.next;
        }
        while(!pq.isEmpty()){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return ans.next;
    }
}