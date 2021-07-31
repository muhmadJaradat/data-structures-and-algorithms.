package challenges.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {

    @Test void binaryTreeTest(){
        //Initiate an empty tree
        BinaryTree bt=new BinaryTree();
        assertEquals(null,bt.getRoot());

        // Check when only the tree has root
        bt.setRoot(new Node(1));
        assertEquals(1,bt.getRoot().getKey());

        //add a left child and right child to a single root node
        bt.getRoot().setLeft(new Node(3));
        bt.getRoot().setRight(new Node(4));

        assertEquals(3,bt.getRoot().getLeft().getKey());
        assertEquals(4,bt.getRoot().getRight().getKey());
        List list=new ArrayList();
        ArrayList<Integer> expectedList=new ArrayList<>();
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(1);

        //return a collection from a postorder traversal
        assertEquals(expectedList,bt.postOrder(bt.getRoot(),list));

        expectedList.clear();
        list.clear();
        //return a collection from a preorder traversal

        expectedList.add(1);
        expectedList.add(3);
        expectedList.add(4);
        assertEquals(expectedList,bt.preOrder(bt.getRoot(),list));

        expectedList.clear();
        list.clear();
        //return a collection from a inorder traversal
        expectedList.add(3);
        expectedList.add(1);
        expectedList.add(4);

        assertEquals(expectedList,bt.inOrder(bt.getRoot(),list));

    }
}
