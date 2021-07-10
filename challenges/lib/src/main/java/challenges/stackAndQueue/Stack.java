package challenges.stackAndQueue;

public class Stack<T> {
    private Node top;
    int size=0;

    public boolean isEmpty(){
        return size==0?true:false;
    }
    public void push(T value){
        Node node=new Node(value);
        if (!isEmpty()) {
            node.setNext(top);
        }
        top=node;
        size++;
    }

    public T  pop(){
        if (isEmpty()){
           return (T) "Cannot pop from empty stack";
        }
        else {
            Node temp=top;
            top=top.getNext();
            temp.setNext(null);
            size--;
            return (T) temp.getData();
        }

    }
    public T peek(){
if(isEmpty()) return (T) "The stack is empty and the top node is null";
else {
    return (T) this.getTop().getData();
}
    }

    public Node getTop() {
        return top;
    }
}
