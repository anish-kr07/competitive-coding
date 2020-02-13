package WAJP.LinkedList;

public class LinkedList {
    Node head;

    class Node {
        int data ;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;

        }
    }
    //stack
    public void push(int d){
        Node node = new Node(d);
        if(head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    //pop
    public void pop(){
        if(head == null)
            System.out.println("Stack underflow");
        else {
            System.out.println("Element popped is " + head.data);
            head = head.next;
        }
    }

    //print
    public void printAll(){
        Node temp = head;
        System.out.println("*****Linke List*****");
        while(temp != null){
            System.out.print("  "+ temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args []){
        LinkedList linkedList = new LinkedList();
        linkedList.pop();
        linkedList.printAll();
        linkedList.push(23);
        linkedList.printAll();
        linkedList.push(45);
        linkedList.push(12);
        linkedList.push(466);
        linkedList.push(457);
        linkedList.printAll();
        linkedList.pop();
        linkedList.printAll();
    }
}
//another approach
//class MyLinkedList {
//
//    class Node {
//        int val;
//        Node next;
//        Node(int x){
//            this.val = x;
//            this.next = null;
//        }
//    }
//
//    Node head ;
//    int size;
//    Node tail;
//    /** Initialize your data structure here. */
//    public MyLinkedList() {
//        head = null;
//        size = 0;
//        tail = null;
//    }
//
//    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
//    public int get(int index) {
//        if(index < 0 || index > size)
//            return -1;
//        Node currentNode = head;
//        for(int i =0;i<=index;i++){
//            currentNode = currentNode.next;
//        }
//        return currentNode.val;
//
//    }
//
//    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
//    public void addAtHead(int val) {
//        Node node = new Node(val);
//        if(head == null){
//            head = node;
//            tail = node;
//        }else   {
//            node.next = head;
//            head = node;
//        }
//        size++;
//
//
//    }
//
//    /** Append a node of value val to the last element of the linked list. */
//    public void addAtTail(int val) {
//        Node node = new Node(val);
//        if(tail == null){
//            head = node;
//            tail = node;
//        }else{
//            tail.next = node;
//            tail = node;
//        }
//        size++;
//    }
//
//    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
//    public void addAtIndex(int index, int val) {
//        Node node = new Node(val);
//        Node currentNode = head;
//        Node nextNode ;
//        if(index < 0 || index > size )
//            return;
//        for(int i = 0;i< index;i++){
//            currentNode = currentNode.next;
//        }
//        node.next = currentNode.next;
//        currentNode.next = node;
//        currentNode = node;
//        size++;
//    }
//
//    /** Delete the index-th node in the linked list, if the index is valid. */
//    public void deleteAtIndex(int index) {
//        if(index <= 0 || index > size )
//            return;
//        Node nextNode,currentNode = head;
//        for(int i = 0;i< index;i++){
//            currentNode = currentNode.next;
//        }
//        nextNode = currentNode.next;
//        currentNode.next = nextNode.next;
//        size--;
//
//    }
//}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */