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
        if(head==null || head.next==null) return head;
        ListNode tail=head;
        int i=1;
        for(i=1;tail.next!=null;i++){
            tail=tail.next;
        }
        tail.next=head;
        ListNode newTail=head;
        for(int j=0;j<i - k % i - 1;j++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}
