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
        List<Integer> ele = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp!=null){
            ele.add(temp.val);
            temp=temp.next;
        }
        ListNode resHead = null;
        temp = resHead;

        for(int i=0;i<ele.size();i+=2){
            ListNode newnode = new ListNode(ele.get(i));
            if(resHead==null){
                resHead=newnode;
                temp=newnode;
            }
            else{
                temp.next=newnode;
                temp=temp.next;
            }
        }

        for(int i=1;i<ele.size();i+=2){
            ListNode newnode = new ListNode(ele.get(i));
            if(resHead==null){
                resHead=newnode;
                temp=newnode;
            }
            else{
                temp.next=newnode;
                temp=temp.next;
            }
        }
        
        return resHead;

    }
}