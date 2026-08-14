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
    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> elements = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            elements.add(temp.val);
            temp=temp.next;
        }
        Collections.rotate(elements,k);
        System.out.println(elements);
        ListNode head2 = null;
        temp = head2;
        for(int i=0;i<elements.size();i++){
            ListNode newnode = new ListNode(elements.get(i));
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