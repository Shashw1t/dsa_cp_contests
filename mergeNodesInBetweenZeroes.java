import java.util.List;

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
    public List mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode newNode = dummy;
        head = head.next;
        int sum = 0;

        while(head != null){
            if(head.val != 0){
                sum += head.val;
            } else {
                newNode.next = new ListNode(sum);
                newNode = newNode.next;
                sum = 0;
            }
            head = head.next;
        }
        return dummy.next;
    }
}