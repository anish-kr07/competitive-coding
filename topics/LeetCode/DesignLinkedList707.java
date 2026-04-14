package LeetCode;

public class DesignLinkedList707 {
    class Node{
        int val;
        Node next;
        Node(int x){
            this.val=x;
            this.next = null;
        }
    }
    Node head;
    int size;
    Node tail;

    DesignLinkedList707(){
        head = null;
        size = 0;
        tail = null;
    }

    public int get(int index) {
        // FIX: validate index and loop correctly
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {  // was index-1
            temp = temp.next;
        }
        System.out.println("Value at index "+ index + " is : "+ temp.val);
        return temp.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null && tail == null)
            head=tail=node;
        else {
            node.next=head;
            head = node;
        }
        size++;
        printAll();
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null){
            tail = head = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
        printAll();
    }

    public void addAtIndex(int index, int val) {
        // FIX: correct bounds check
        if (index < 0 || index > size) return;
        // FIX: handle insertion at head
        if (index == 0) {
            addAtHead(val);
            return;
        }
        // FIX: handle insertion at tail
        if (index == size) {
            addAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
        printAll();
    }

    public void deleteAtIndex(int index) {
        // FIX: validate index
        if (index < 0 || index >= size) return;
        // FIX: handle deletion of head
        if (index == 0) {
            Node tmp2 = head;
            System.out.println("Deleted value at index " + index + " is : "+ tmp2.val);
            head = head.next;
            if (head == null) tail = null;
            size--;
            printAll();
            return;
        }
        Node tmp = head;
        //reach one before the actual deletion node;
        for (int i = 0; i < index - 1; i++) {
            tmp= tmp.next;
        }
        Node tmp2 = tmp;
        tmp2 = tmp2.next;
        System.out.println("Deleted value at index " + index + " is : "+ tmp2.val);
        tmp.next = tmp2.next;
        // FIX: update tail if last node deleted
        if (tmp.next == null) tail = tmp;
        tmp2 = null; // remove the reference and delete the space
        size--;
        printAll();
    }

    public void printAll(){
        Node temp = head;
        System.out.println("****Size**** "+ size);
        while (temp!=null){
            System.out.print(" "+ temp.val + " > ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DesignLinkedList707 obj = new DesignLinkedList707();
        obj.addAtHead(1);
        obj.addAtHead(2);
        obj.addAtHead(3);
        obj.addAtTail(4);
        obj.addAtTail(5);
        obj.addAtIndex(1,6);
        obj.get(1);
         obj.deleteAtIndex(1);
    }
}