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
    public int numComponents(ListNode head, int[] nums) {
        
        Set<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        ListNode p=null;
        ListNode cur=head;
        int ans=0;
        while(cur!=null){
            if(p==null){
                if(h.contains(cur.val)){
                  ans++;
                }
            }
            else{
                if(!h.contains(p.val) && h.contains(cur.val)){
                    ans++;
                }
            }
            p=cur;
            cur=cur.next;
            }
            return ans;

        }
}