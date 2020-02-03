package WAJP;

public class LinkedList {
    Node head;

    class Node {
        int data ;
        Node next;

        Node(int d){
            data = d;
            next = null;

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
