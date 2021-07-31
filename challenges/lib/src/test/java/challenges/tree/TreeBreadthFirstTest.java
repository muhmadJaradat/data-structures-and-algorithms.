package challenges.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeBreadthFirstTest {

    @Test
    void binaryTreeTest(){
        //Check empty tree
        BinaryTree bt=new BinaryTree();
assertEquals(null,bt.breadthFirst(bt));

        // instantiate a tree with a single root node
        bt.setRoot(new Node(1));

        //add a left child and right child to a single root node
        bt.getRoot().setLeft(new Node(3));
        bt.getRoot().setRight(new Node(4));

        bt.getRoot().getLeft().setLeft(new Node(5));
        bt.getRoot().getLeft().setRight(new Node(6));
        bt.getRoot().getRight().setLeft(new Node(7));
        bt.getRoot().getRight().setRight(new Node(8));
        assertEquals("[1, 3, 4, 5, 6, 7, 8]",bt.breadthFirst(bt));

}}
