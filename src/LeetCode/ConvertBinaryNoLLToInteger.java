package LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ConvertBinaryNoLLToInteger {
//        Method 1
//    public int getDecimalValue(ListNode head) {
//        ListNode current = head;
//        int binary = 0;
//        while(current != null){
//            if(current == head) {
//                binary = current.val;
//            }else {
//                if(current.val == 0 )
//                    binary = binary << 1;
//                else
//                    binary = (binary << 1) | 1;
//            }
//            current = current.next;
//        }
//        return binary;
//        Method 2
//    public int getDecimalValue(ListNode head) {
//        int binary = 0;
//        while(head != null){
//            binary = (binary << 1) | head.val;
//            // System.out.print("   "+ binary);
//            head = head.next;
//        }
//        return binary;
//    }
//    }
}
