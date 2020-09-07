package WAJP.LinkedList;
/**
 * Definition for singly-linked list.
 *  */
class ListNode {
    int val;
    ListNode next;
       ListNode(int x) {
            val = x;
            next = null;
       }
}
public class LLWithCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fastPointer = head;
        while(head != null && fastPointer != null
                && fastPointer.next != null
                && fastPointer.next.next != null){
            head = head.next;
            fastPointer = fastPointer.next.next;
            if(head.val == fastPointer.val) return true;
        }
        return false;

    }
}
