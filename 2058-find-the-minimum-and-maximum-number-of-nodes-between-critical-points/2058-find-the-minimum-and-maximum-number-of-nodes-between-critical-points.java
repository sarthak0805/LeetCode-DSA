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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return new int[]{-1,-1};
        int ans[] = new int[2];
        List<Integer> l = new ArrayList<>();
        ListNode prev = head;
        ListNode temp = head.next;
        ListNode next = head.next.next;
        int cnt = 1;
        while(next!=null){
            //local maxima
            if(temp.val>prev.val && temp.val>next.val){
                l.add(cnt);
            }
            //local minima
            if(temp.val<prev.val && temp.val<next.val){
                l.add(cnt);
            }
            cnt++;
            prev = prev.next;
            temp = temp.next;
            next = next.next;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i : l){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        if(l.size() < 2) return new int[]{-1,-1};
        ans[1] = max - min;
        int a = Integer.MAX_VALUE;
        for(int i = 1; i < l.size();i++){
            if(l.get(i) == min) continue;
            else a = Math.min(a,l.get(i) - l.get(i-1));
        }
        ans[0] = a;
        return ans;
    }
}