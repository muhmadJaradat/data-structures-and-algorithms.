package challenges.Graph;



import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Graph<T> {
    protected Set<Node<T>> graph;

    public Graph() {

        this.graph = new HashSet<>();
    }

    public boolean addNode(Node<T> node) {

        return graph.add(node);
    }

    public void addEdge(Node<T> node1, Node<T> node2, Integer weight) {
        if(!graph.contains(node1) || !graph.contains(node2)) {
            throw new IllegalArgumentException("Entry not in graph.");
        }
        node1.addEdge(node2, weight);
        node2.addEdge(node1, weight);
    }

    /**
     *
     * @return the graph, represented by a Set of Nodes
     */
    public Set<Node<T>> getNodes() {
        return this.graph;
    }



    public List<Edge<T>> getNeighbors(Node<T> input) {
        if(graph.contains(input)) {
            return input.neighbors;
        }
        return null;
    }

    public int size() {
        return graph.size();
    }

    public List<Node<T>> breadthFirst(Node<T> start) {
        List<Node<T>> result = new LinkedList<>();

        List<Node<T>> haveVisited = new LinkedList<>();
        List<Edge<T>> firstNeighbors = start.neighbors;

        if(firstNeighbors.isEmpty()) {
            return result;
        }

        Queue<Node<T>> neighbors = new LinkedList<>();

        // Put all the first neighbors in the queue and haveVisited
        for(Edge<T> e : firstNeighbors) {
            neighbors.add(e.neighbor);
            haveVisited.add(e.neighbor);
        }

        // Enter loop until the Queue is empty
        while(!neighbors.isEmpty()) {

            // Peek at the Queue, enqueue all of it's neighbors
            List<Edge<T>> temp = neighbors.peek().neighbors;
            for(Edge<T> e : temp) {
                if(e.neighbor != start && !haveVisited.contains(e.neighbor)) {
                    neighbors.add(e.neighbor);
                    haveVisited.add(e.neighbor);
                }
            }
            // Dequeue and add Entry to results
            result.add(neighbors.remove());

        }
        return result;
    }


    public Set<Node<T>> getGraph() {
        return graph;
    }








}
