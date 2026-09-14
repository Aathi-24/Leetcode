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
    public ListNode removeNodes(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        int max = Integer.MIN_VALUE;
        cur = prev;
        ListNode dummy = new ListNode(0);
        ListNode m = dummy;
        while(cur != null){
            if(cur.val >= max){
                max = cur.val;
                m.next = cur;
                m = m.next;
            }
            cur = cur.next;
        }
        m.next = null;
        cur = dummy.next;
        prev = null;
        while(cur != null){
            ListNode t = cur.next;
            cur.next = prev;
            prev = cur;
            cur = t;
        }
        return prev;
    }
}