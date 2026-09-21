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
        Set<ListNode> set = new HashSet<>();
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            if(set.add(temp)){
                temp = temp.next;
                count++;
            }
            else{
                return temp;
            }
        }
        return null;
    }
}