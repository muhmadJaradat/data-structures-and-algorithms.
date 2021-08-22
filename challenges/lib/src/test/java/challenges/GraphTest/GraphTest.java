package challenges.GraphTest;
import static org.junit.jupiter.api.Assertions.*;

import challenges.Graph.Graph;
import challenges.Graph.Node;
import org.junit.jupiter.api.Test;
public class GraphTest {

    @Test
    public void testAddNode() {

        Graph<String> testGraph = new Graph<>();

        Node<String> node1 = new Node<>("Main St.");
        Node<String> node2 = new Node<>("1st St.");
        Node<String> node3 = new Node<>("2nd St.");
        assertTrue(testGraph.addNode(node1));

        assertTrue(testGraph.addNode(node2));
        assertTrue( testGraph.addNode(node3));
        assertEquals( 3, testGraph.size());

    }
    @Test
    public void testAddEdge() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("Main St.");
        Node<String> node2 = new Node<>("1st St.");
        Node<String> node3 = new Node<>("2nd St.");
        testGraph.addNode(node1);
        testGraph.addNode(node2);
        testGraph.addNode(node3);
        testGraph.addEdge(node1, node2, 10);
        assertTrue( node1.hasNeighbor(node2));
        assertTrue( node2.hasNeighbor(node1));
        testGraph.addEdge(node2, node3, 20);
        assertTrue(node2.hasNeighbor(node3));
        assertTrue(node3.hasNeighbor(node2));
        assertFalse( node1.hasNeighbor(node3));
        assertFalse(node3.hasNeighbor(node1));
    }
    @Test
    public void testGetNodes_emptyGraph() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("Some value");
        assertFalse( testGraph.getNodes().contains(node1));
        assertTrue(testGraph.getNodes().isEmpty());
    }

    @Test
    public void testGetNodes() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("Main St.");
        Node<String> node2 = new Node<>("1st St.");
        Node<String> node3 = new Node<>("2nd St.");
        testGraph.addNode(node1);
        testGraph.addNode(node2);
        testGraph.addNode(node3);
        assertTrue( testGraph.getNodes().contains(node1));
        assertTrue( testGraph.getNodes().contains(node2));
        assertTrue( testGraph.getNodes().contains(node3));
        assertEquals( 3, testGraph.getNodes().size());
    }

    @Test
    public void testGetNeighbors() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("Main St.");
        Node<String> node2 = new Node<>("1st St.");
        Node<String> node3 = new Node<>("2nd St.");
        testGraph.addNode(node1);
        testGraph.addNode(node2);
        testGraph.addNode(node3);
        testGraph.addEdge(node1, node2, 10);
        assertTrue( node1.hasNeighbor(node2));
        assertTrue( node2.hasNeighbor(node1));
        assertFalse( node3.hasNeighbor(node1));
    }

    @Test
    public void testSize() {
        Graph<Integer> testGraph = new Graph<>();
        assertEquals( 0, testGraph.size());
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        testGraph.addNode(node1);
        assertEquals( 1, testGraph.size());
        testGraph.addNode(node1);
        assertEquals( 1, testGraph.size());
        testGraph.addNode(node2);
        assertEquals( 2, testGraph.size());
        testGraph.addNode(node3);
        assertEquals( 3, testGraph.size());
    }
    }

