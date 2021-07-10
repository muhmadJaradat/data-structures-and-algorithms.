package challenges.stackAndQueue;

public class Queue<T> {
    private Node front;
    private Node rear;
    int size=0;
    public boolean isEmpty(){
        return size==0?true:false;
    }
    public void enqueue(T value){
        Node node=new Node(value);
        if(isEmpty()){
            this.front=node;
        }
        else {
           this.rear.setNext(node);
        }
        this.rear=node;
        size++;
    }
    public T dequeue(){
        if (isEmpty()) return (T) null;
        else {
            Node temp=this.front;
            this.front=front.getNext();
            temp.setNext(null);
            size--;
            return (T) temp.getData();
        }
    }

    public T peek(){
        if(isEmpty()) return (T) "The queue is empty";
        else {
            return (T) this.getFront().getData();
        }
    }

    public Node getFront() {
        return front;
    }

    public Node getRear() {
        return rear;
    }
}
