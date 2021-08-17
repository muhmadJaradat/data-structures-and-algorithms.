package challenges.tree;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class TreeIntersection {
@Test
   public void intersectionTest(){
    BinarySearchTree bst= new BinarySearchTree();
    bst.add(150);
    bst.add(100);
    bst.add(250);
    bst.add(75);
    bst.add(160);
    bst.add(200);
    bst.add(350);
    bst.add(300);
    bst.add(500);
    bst.add(125);
    bst.add(175);

    BinarySearchTree bst2 =new BinarySearchTree();
    bst2.add(42);
    bst2.add(100);
    bst2.add(600);
    bst2.add(15);
    bst2.add(160);
    bst2.add(200);
    bst2.add(350);
    bst2.add(4);
    bst2.add(500);
    bst2.add(125);
    bst2.add(175);

    BinaryTree.intersection(bst,bst2);
    Set set=new HashSet();
    set.add(100);
    set.add(160);
    set.add(125);
    set.add(175);
    set.add(200);
    set.add(350);
    set.add(500);

assertEquals(set,BinaryTree.intersection(bst,bst2));
}
}
