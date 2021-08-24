package challenges.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Node<T> {

    protected T value;
    protected List<Edge<T>> neighbors;

    public Node() {
        this.neighbors = new LinkedList<>();
    }

    public Node(T value) {
        this.value = value;
        this.neighbors = new LinkedList<>();
    }

    protected void addEdge(Node<T> neighbor, Integer weight) {
        Edge<T> edge = new Edge<>(neighbor, weight);
         neighbors.add(edge);
    }

    public boolean hasNeighbor(Node<T> checkNode) {
        for(Edge<T> edge : neighbors) {
            if(edge.neighbor == checkNode) {
                return true;
            }
        }
        return false;
    }

    public T getValue() {
        return this.value;
    }

    @Override
    public String toString() {

        return (String)this.value;
    }
}
