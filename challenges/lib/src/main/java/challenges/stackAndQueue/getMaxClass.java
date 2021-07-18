package challenges.stackAndQueue;

import java.util.Stack;

public class getMaxClass {
    Stack<Integer> maxStack = new Stack<Integer>();
    private Node top;

    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (maxStack.size() == 0) maxStack.push(value);
        else {
            if (value >= maxStack.peek()) {
                maxStack.push(value);

            }


            if (!isEmpty()) {
                node.setNext(top);
            }
            top = node;
            size++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.parseInt(("Cannot pop from empty stack"));
        } else {

            Node temp = top;
            top = top.getNext();
            temp.setNext(null);
            size--;
            if (temp.getData() == maxStack.peek()) {
                maxStack.pop();
            }
            return (int) temp.getData();
        }

    }

    public int peek() {
        if (isEmpty()) return Integer.parseInt("The stack is empty and the top node is null");
        else {
            return (int) this.getTop().getData();
        }
    }

    public int getMax() {
        return maxStack.peek();
    }

    public Node getTop() {
        return top;
    }

}
