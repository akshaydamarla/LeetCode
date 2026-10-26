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
    public ListNode partition(ListNode head, int x) {
        List<Integer> before = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                before.add(temp.val);
            }else{
                after.add(temp.val);
            }
            temp=temp.next;
        }
        ListNode head2 = null;
        temp = head2;
        for(int i=0;i<before.size();i++){
            ListNode newnode = new ListNode(before.get(i));
            if(head2==null){
                head2=newnode;
                temp=newnode;
            }else{
                temp.next=newnode;
                temp=newnode;
            }
        }
        for(int i=0;i<after.size();i++){
            ListNode newnode = new ListNode(after.get(i));
            if(head2==null){
                head2=newnode;
                temp=newnode;
            }else{
                temp.next=newnode;
                temp=newnode;
            }
        }
        return head2;
    }
}