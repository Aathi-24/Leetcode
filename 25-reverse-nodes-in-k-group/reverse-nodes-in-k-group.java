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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        int count = 0;
        ListNode start = head;
        ListNode end = head;
        while(end != null){
            count++;
            if(count % k == 0){
                end = end.next;
                ListNode cur = start;
                ListNode prev = null;
                while(cur != end){
                    ListNode next = cur.next;
                    cur.next = prev;
                    prev = cur;
                    cur = next;
                }
                t.next = prev;
                while(t.next != null){
                    t = t.next;
                }
                start = end;
            }
            else end = end.next;
        }
        if(start != end) t.next = start;
        return dummy.next;
    }
}