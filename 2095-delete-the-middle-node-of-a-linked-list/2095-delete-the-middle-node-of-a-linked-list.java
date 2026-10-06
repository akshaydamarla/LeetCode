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
        int cnt = 0;
        if(head.next==null){
            return null;
        }
        ListNode temp = head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        cnt/=2;
        temp=head;
        ListNode prev = temp;
        while(cnt>0){
            prev=temp;
            cnt--;
            temp=temp.next;
        }
        prev.next=temp.next;
        return head;
        
    }
}