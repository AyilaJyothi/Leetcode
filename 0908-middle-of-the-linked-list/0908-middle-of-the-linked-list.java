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
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode current=head;
        ListNode list=new ListNode(0);
        ListNode cur=list;
        while(current!=null){
            length++;
            current=current.next;
        }
        int mid=length/2;
        for(int i=0;i<mid;i++){
            head=head.next;
        }
        while(head!=null){
            cur.next=head;
            head=head.next;
            cur=cur.next;
        }
        return list.next;
    }
}