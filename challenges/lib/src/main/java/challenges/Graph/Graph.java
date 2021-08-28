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



    public  List<Node<T>> depthFirst(Node<T> startValue) {

        Set<Node<T>> graph = this.getGraph();
        List<Node<T>> result = new LinkedList<>();
        Stack<Node<T>> stack = new Stack<>();
        Set<Node<T>> visited = new HashSet<>();

        if(graph.isEmpty()) {
            return result;
        }

                stack.push(startValue);
                visited.add(startValue);


        while(!stack.isEmpty()) {
            Node<T> temp = stack.pop();
            result.add(temp);
            for(Edge<T> e : temp.neighbors) {
                if(!visited.contains(e.neighbor)) {
                    stack.push(e.neighbor);
                    visited.add(e.neighbor);
                }
            }
        }

        // If there are any "island" nodes, then add those to the result list

        return result;
    }
    public Connection getEdge(String[] cities) {

        int price = 0;
        boolean followupFound = false;

        for(int i = 0; i < cities.length - 1; i++) {
            followupFound = false;
            for(Node<T> n : graph) {
                if(n.value.equals(cities[i])) {

                    for(Edge e : n.neighbors) {
                        if(e.neighbor.value.equals(cities[i + 1])) {
                            price += e.weight;
                            followupFound = true;
                        }
                    }
                    if(!followupFound) {
                        return new Connection(false, 0);
                    }
                }
            }
        }
        if(!followupFound) {
            return new Connection(false, 0);
        }
        return new Connection(true, price);
    }

    private boolean hasCity(String city) {
        for(Node<T> n: this.graph) {
            if(n.value.equals(city)) {
                return true;
            }
        }
        return false;
    }




}
