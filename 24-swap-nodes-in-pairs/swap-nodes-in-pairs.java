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
    public ListNode swapPairs(ListNode head) {

        // Dummy node handles swapping at the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            // Identify the two nodes to swap
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            // Perform swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev to the end of the swapped pair
            prev = first;
        }

        return dummy.next;
    }
}