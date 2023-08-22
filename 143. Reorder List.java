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
    public static ListNode reverse(ListNode head){
        ListNode temp2=null;
        ListNode temp1=null;
        while(head!=null){
            temp2=head.next;
            head.next=temp1;
            temp1=head;
            head=temp2;
        }
        head=temp1;
        return head;
    }
   public void reorderList(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) {
        return;
    }
    
    // Find the middle of the list
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    
    // Reverse the second half of the list
    ListNode secondHalf = reverse(slow.next);
    slow.next = null; // Cut off the first half
    
    // Merge the two halves
    ListNode firstHalf = head;
    while (secondHalf != null) {
        ListNode temp1 = firstHalf.next;
        ListNode temp2 = secondHalf.next;
        
        firstHalf.next = secondHalf;
        secondHalf.next = temp1;
        
        firstHalf = temp1;
        secondHalf = temp2;
    }
}

}
