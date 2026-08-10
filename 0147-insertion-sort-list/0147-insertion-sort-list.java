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
    public ListNode insertionSortList(ListNode head) {
        List<Integer> result = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            result.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(result);
        ListNode resHead = null;
        temp = resHead;
        int t = result.size();
        for(int i=0;i<t;i++){
            ListNode newnode = new ListNode(result.get(i));
            if(resHead==null){
                newnode.next=resHead;
                resHead=newnode;
                temp=newnode;
            }else{
               temp.next=newnode;
               temp=newnode;
            }


        }
        return resHead;
        
    }
}