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
    public ListNode oddEvenList(ListNode head) {
        ListNode res = new ListNode(0);
        int count = 0;
        ListNode temp = head;
        ListNode one = res;
        while(temp != null){
            if(count % 2 == 0){
                ListNode t = new ListNode(temp.val);
                one.next = t;
                one = one.next; 
            }
            count++;
            temp = temp.next;
        }
        temp = head;
        count = 0;
        while(temp != null){
            if(count % 2 == 1){
                ListNode t = new ListNode(temp.val);
                one.next = t;
                one = one.next;
            }
            count++;
            temp = temp.next;
        }
        return res.next;
    }
}