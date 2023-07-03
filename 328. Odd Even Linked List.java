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
        ListNode Oddh=null,Oddt=null,Evenh=null,Event=null;
        if(head== null){
            return head;
        }
        int count =1;
        while(head!=null){
            if(count%2==0){
                if(Evenh==null){
                    Evenh=head;
                    Event=head;
                }
                else{
                    Event.next=head;
                    Event=Event.next;

                }
            }
            else{
                if(Oddh==null){
                    Oddh=head;
                    Oddt=head;
                }
                else{
                    Oddt.next=head;
                    Oddt=Oddt.next;
                }

            }
            count++;
            head=head.next;
        }

        if(Evenh==null){
            return Oddh;
        }
        if(Oddh==null){
            return Evenh;
        }
        Event.next=null;
        Oddt.next=Evenh;
        return Oddh;
    }
}
