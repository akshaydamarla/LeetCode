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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> value = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode head = lists[i];
            ListNode temp = head;
            while(temp!=null){
                value.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(value);
        ListNode head = null;
        ListNode temp = head;
        for(int i=0;i<value.size();i++){
            ListNode newnode = new ListNode(value.get(i));
            if(head==null){
                head=newnode;
                temp=newnode;
            }else{
                temp.next=newnode;
                temp=newnode;
            }
        }
        return head;
    }
}