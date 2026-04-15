package LeetCode;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null  &&  fast.next != null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;

/*        Set<ListNode> visited = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if(visited.contains(current))
                return true;
            visited.add(current);
            current = current.next;
        }
        return false;
*/

    }
}
