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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode dummy =new ListNode(0,head);
        ListNode prev =dummy;
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            prev=prev.next;
            fast=fast.next.next;
            slow =slow.next;
        }
        prev.next=slow.next;
        return dummy.next;
    }
}
