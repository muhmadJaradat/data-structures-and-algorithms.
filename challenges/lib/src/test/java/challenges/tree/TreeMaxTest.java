package challenges.tree;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class TreeMaxTest {
    @Test
    public void initTree(){
        BinaryTree tree = new BinaryTree();
        assertNull(tree.getRoot());
    }

    @Test
    public void findMaxTest() {
        BinaryTree bt = new BinaryTree();
        bt.setRoot(new Node(1));
        assertEquals(1, bt.getRoot().getKey());

        //add a left child and right child to a single root node
        bt.getRoot().setLeft(new Node(3));
        bt.getRoot().setRight(new Node(4));
        bt.getRoot().getRight().setLeft(new Node(200) );
        assertEquals(200, bt.findMaxValue());
    }}


