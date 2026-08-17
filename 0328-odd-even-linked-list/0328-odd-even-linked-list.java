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
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        ListNode temp = head;
        int k=1;
        while(temp!=null){
            if(k%2==0){
                even.add(temp.val);
            }else{
                odd.add(temp.val);
            }
            k++;
            temp=temp.next;
        }
        ListNode newhead = null;
        temp = newhead;
        for(int i=0;i<odd.size();i++){
            ListNode newnode = new ListNode(odd.get(i));
            if(newhead==null){
                newhead = newnode;
                temp=newnode;
            }else{
                temp.next=newnode;
                temp=newnode;
            }
        }
        for(int i=0;i<even.size();i++){
            ListNode newnode = new ListNode(even.get(i));
            if(newhead==null){
                newhead = newnode;
                temp=newnode;
            }else{
                temp.next=newnode;
                temp=newnode;
            }
        }
        return newhead;

        
    }
}