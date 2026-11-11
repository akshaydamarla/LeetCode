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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        if(head==null||head.next==null){
            return null;
        }

        if(n==1&&head.next==null){
            return  null;
        }
        int cnt = 0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        cnt -= n;
        if(cnt==0){
            return head.next;
        }
        temp = head;
        ListNode prev = temp;
        for(int i=0;i<cnt;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;

        return head;
        
    }
}