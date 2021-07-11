package challenges.stackAndQueue;

public class PseudoQueue<T> {
     Stack<T> enQueueStack;
     Stack<T> deQueueStack;
     int Size;

    public PseudoQueue() {
       enQueueStack=new Stack<T>();
       deQueueStack=new Stack<T>();
       Size=0;
    }

    public void enqueue(T value){
        while (!deQueueStack.isEmpty()){
            enQueueStack.push(deQueueStack.pop());
        }
        enQueueStack.push(value);
        Size++;
    }

    public T dequeue(){
        if (enQueueStack.isEmpty()&& deQueueStack.isEmpty()){
            return null;
        }
        else {
            while (!enQueueStack.isEmpty()){
                deQueueStack.push(enQueueStack.pop());
            }
            Size--;
            return (T) deQueueStack.pop();
        }
    }

}
