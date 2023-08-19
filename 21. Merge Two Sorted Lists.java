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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0); //to create a dummy lsit in which we will store our answer
        ListNode current=dummy; //another listnode to iterate over our dummy list

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        if(l1==null){   //if one of the lists has reached null then we only have to assign one node of the 
                        //non-empty lists and not the rest as all the other nodes will stay linked to that node.
            current.next=l2;
        }
        else{
            current.next=l1;
        }
        return dummy.next; //we return only the head of dummy list as required.
    }
}
