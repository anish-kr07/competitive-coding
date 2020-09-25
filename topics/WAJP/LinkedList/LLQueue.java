package WAJP.LinkedList;

class QNode{
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue{
    QNode front , rear ;
    int size;

    Queue(){
        this.front =this.rear=null;
        this.size =0;
    }

    public  void  enQueue(int x){
        QNode qNode = new QNode(x);
        if(this.rear == null){
            this.front = this.rear = qNode;
        } else {
            this.rear.next = qNode;
            this.rear = qNode;
        }
        size++;
    }
    public void deQueue(){
        if(this.front == null){
            System.out.println("No elements in Queue");
        }

        System.out.println("Element deleted " + this.front.data);
        this.front = this.front.next;
        if(this.front == null)
            this.front = this.rear = null;

    }

    public void  printAll(){
        for (QNode i = front ; i != null ; i=i.next){
            System.out.print(i.data+" ");
        }
        System.out.println();
    }

}
class LLQueue{
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(23);
        queue.enQueue(25);
        queue.enQueue(10);
        queue.enQueue(100);
        queue.printAll();
        queue.deQueue();
        queue.printAll();
        queue.enQueue(97);
        queue.printAll();
    }
}