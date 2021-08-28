package challenges.GraphTest;
import static org.junit.jupiter.api.Assertions.*;

import challenges.Graph.Connection;
import challenges.Graph.Graph;
import challenges.Graph.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testBreadthFirst() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("A");
        Node<String> node2 = new Node<>("B");
        Node<String> node3 = new Node<>("C");
        Node<String> node4 = new Node<>("D");
        Node<String> node5 = new Node<>("E");
        Node<String> node6 = new Node<>("F");
        Node<String> node7 = new Node<>("G");
        Node<String> node8 = new Node<>("H");
        Node<String> node9 = new Node<>("I");

        testGraph.addNode(node1);
        testGraph.addNode(node2);
        testGraph.addNode(node3);
        testGraph.addNode(node4);
        testGraph.addNode(node5);
        testGraph.addNode(node6);
        testGraph.addNode(node7);
        testGraph.addNode(node8);
        testGraph.addNode(node9);

        testGraph.addEdge(node1, node2, 10); // A - B
        testGraph.addEdge(node1, node3, 10); // A - C
        testGraph.addEdge(node1, node4, 10); // A - D
        testGraph.addEdge(node1, node5, 10); // A - E
        testGraph.addEdge(node1, node7, 10); // A - G
        testGraph.addEdge(node3, node4, 10); // C - D
        testGraph.addEdge(node6, node7, 10); // F - G
        testGraph.addEdge(node7, node3, 10); // G - C
        testGraph.addEdge(node7, node8, 10); // G - H
        testGraph.addEdge(node8, node9, 10); // H - I



        List<Node<String>> testResults = testGraph.breadthFirst(node1);
        assertEquals( 8, testResults.size());
        assertEquals( "B",testResults.get(0).getValue());
        assertEquals("C",testResults.get(1).getValue());
        assertEquals("D",testResults.get(2).getValue());
        assertEquals( "E",testResults.get(3).getValue());
        assertEquals( "G",testResults.get(4).getValue());
        assertEquals( "F",testResults.get(5).getValue());
        assertEquals("H",testResults.get(6).getValue());
        assertEquals( "I",testResults.get(7).getValue());
    }

    @Test
    public void testDepthFirst() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("A");
        Node<String> node2 = new Node<>("B");
        Node<String> node3 = new Node<>("C");
        Node<String> node4 = new Node<>("D");
        Node<String> node5 = new Node<>("E");
        Node<String> node6 = new Node<>("F");
        Node<String> node7 = new Node<>("G");
        Node<String> node8 = new Node<>("H");
        Node<String> node9 = new Node<>("I");

        testGraph.addNode(node1);
        testGraph.addNode(node2);
        testGraph.addNode(node3);
        testGraph.addNode(node4);
        testGraph.addNode(node5);
        testGraph.addNode(node6);
        testGraph.addNode(node7);
        testGraph.addNode(node8);
        testGraph.addNode(node9);

        testGraph.addEdge(node1, node2, 10); // A - B
        testGraph.addEdge(node1, node3, 10); // A - C
        testGraph.addEdge(node1, node4, 10); // A - D
        testGraph.addEdge(node1, node5, 10); // A - E
        testGraph.addEdge(node1, node7, 10); // A - G
        testGraph.addEdge(node3, node4, 10); // C - D
        testGraph.addEdge(node6, node7, 10); // F - G
        testGraph.addEdge(node7, node3, 10); // G - C
        testGraph.addEdge(node7, node8, 10); // G - H
        testGraph.addEdge(node8, node9, 10); // H - I



        List<Node> result = new ArrayList<>(testGraph.depthFirst( node1));

        assertEquals( "A", result.get(0).getValue());
        assertEquals("G", result.get(1).getValue());
        assertEquals("H", result.get(2).getValue());
        assertEquals("I", result.get(3).getValue());
        assertEquals("F", result.get(4).getValue());
        assertEquals("E", result.get(5).getValue());
        assertEquals("D", result.get(6).getValue());
        assertEquals("C", result.get(7).getValue());
        assertEquals("B", result.get(8).getValue());
        assertEquals(9, result.size());

        Graph<String> testGraph2 = new Graph<>();
        assertTrue( testGraph2.depthFirst( node1).isEmpty());



    }
    @Test
    public void testGetEdge() {
        Graph<String> testGraph = new Graph<>();
        Node<String> node1 = new Node<>("A");
        Node<String> node2 = new Node<>("B");
        Node<String> node3 = new Node<>("C");
        Node<String> node4 = new Node<>("D");
        Node<String> node5 = new Node<>("E");
        Node<String> node6 = new Node<>("F");
        Node<String> node7 = new Node<>("G");
        Node<String> node8 = new Node<>("H");
        Node<String> node9 = new Node<>("I");

        testGraph.addNode(node1);
        testGraph.addNode(node2);
        testGraph.addNode(node3);
        testGraph.addNode(node4);
        testGraph.addNode(node5);
        testGraph.addNode(node6);
        testGraph.addNode(node7);
        testGraph.addNode(node8);
        testGraph.addNode(node9);

        testGraph.addEdge(node1, node2, 10); // A - B
        testGraph.addEdge(node1, node3, 10); // A - C
        testGraph.addEdge(node1, node4, 10); // A - D
        testGraph.addEdge(node1, node5, 10); // A - E
        testGraph.addEdge(node1, node7, 10); // A - G
        testGraph.addEdge(node3, node4, 10); // C - D
        testGraph.addEdge(node6, node7, 10); // F - G
        testGraph.addEdge(node7, node3, 10); // G - C
        testGraph.addEdge(node7, node8, 10); // G - H
        testGraph.addEdge(node8, node9, 10); // H - I




        String[] testCities1 = {"A", "B"};
        assertEquals( new Connection(true, 10), testGraph.getEdge(testCities1));

        String[] testCities2 = {"E", "D"};
        assertEquals(new Connection(false, 0), testGraph.getEdge(testCities2));

        String[] testCities3 = {"G", "H", "I"};
        assertEquals( new Connection(true, 20), testGraph.getEdge(testCities3));

        String[] testCities4 = {"D", "A", "G", "H", "I"};
        assertEquals( new Connection(true, 40), testGraph.getEdge(testCities4));

        String[] testCities5 = {"D", "A", "B", "H", "I"};
        assertEquals( new Connection(false, 0), testGraph.getEdge(testCities5));

        String[] testCities6 = {"Z", "A", "B", "H", "I"};
        assertEquals(new Connection(false, 0), testGraph.getEdge(testCities6));

        String[] testCities7 = {"I"};
        assertEquals( new Connection(false, 0), testGraph.getEdge(testCities7));
    }

}

