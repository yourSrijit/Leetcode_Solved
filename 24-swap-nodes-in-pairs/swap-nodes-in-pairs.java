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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode dummy =new ListNode(0,head);
        ListNode prev=dummy;
        ListNode c =head;
        while(c!=null && c.next !=null){
            prev.next=c.next;
            c.next=c.next.next;
            prev.next.next=c;
            c=c.next;
            prev=prev.next.next;
        }
        return dummy.next;
    }
}