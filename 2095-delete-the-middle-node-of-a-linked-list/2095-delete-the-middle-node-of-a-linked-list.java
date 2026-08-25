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
    // public ListNode findMiddle(ListNode head){
    //     ListNode hare = head;
    //     ListNode turtle = head;

    //     while(hare != null && hare.next != null){
    //         hare = hare.next.next;
    //         turtle = turtle.next;
    //     }
    //     return turtle;
    // }
    public ListNode deleteMiddle(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head = head.next;
        }
        ListNode hare = head;
        ListNode turtle = head;
        ListNode prev = null;
        while(hare != null && hare.next != null){
            prev = turtle;
            hare = hare.next.next;
            turtle = turtle.next;
        }

        prev.next = turtle.next;
        return head;
        
    }
}