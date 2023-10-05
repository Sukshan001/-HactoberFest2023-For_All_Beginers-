/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // Floyd's  CFA  --> slow - fast approach

     ListNode slow = head;
     ListNode fast = head;

     boolean isCycle = false;

     while(fast != null && fast.next != null){
         slow = slow.next;     // +1
         fast = fast.next.next;  // +2

         if(slow == fast){
             isCycle = true;
             return isCycle;
         }
     }


        return false;
        
    }
}
