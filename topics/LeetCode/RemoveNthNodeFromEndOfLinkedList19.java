package LeetCode;

public class RemoveNthNodeFromEndOfLinkedList19 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev;
        while(temp != null ){
            prev = temp.next;
            //loop to remove all the duplicates (inlcuding continous duplicates)
            while(prev != null && prev.val == temp.val){
                prev = prev.next;
            }
            temp.next = prev;
            temp = temp.next;
        }
        return head;
    }
}
