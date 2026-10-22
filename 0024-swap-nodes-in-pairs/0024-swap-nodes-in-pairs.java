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
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode dum = new ListNode(-1);
        dum.next=head;
        ListNode prev=dum;
        ListNode temp = dum.next;
        ListNode first = prev.next;
        ListNode second = prev.next.next;
        while(prev.next!=null&&prev.next.next!=null){
            first=prev.next;
            second=prev.next.next;
            first.next=first.next.next;
            prev.next=second;
            second.next=first;
            prev=first;
        }
        return dum.next;
    }
}