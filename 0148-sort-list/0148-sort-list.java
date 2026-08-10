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
    public ListNode sortList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            result.add(temp.val);
            temp=temp.next;
        }

        Collections.sort(result);

        int t = result.size();
        ListNode head2=null;
        temp = head2;
        for(int i=0;i<t;i++){
            ListNode newnode = new ListNode(result.get(i));
            if(head2==null){
                newnode.next = head2;
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