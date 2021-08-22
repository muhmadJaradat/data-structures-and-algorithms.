package challenges.Graph;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

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




    public Set<Node<T>> getGraph() {
        return graph;
    }








}
