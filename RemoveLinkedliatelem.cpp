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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dum =new ListNode(-1);
        dum.next=head;
        ListNode ptr=dum;
        while(ptr!=null && ptr.next!=null){
            if(ptr.next.val==val){
                  ListNode tem=ptr.next;
                  ptr.next=tem.next;

            }
            else{
                ptr=ptr.next;
            }
           
        }
         return dum.next;
    }
}
