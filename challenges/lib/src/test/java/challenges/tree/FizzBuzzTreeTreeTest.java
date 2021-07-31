package challenges.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTreeTreeTest<Type> {
    @Test
    public void testCreateAnEmptyInstanceOfFizzBuzzTree(){
        FizzBuzzTree fz = new FizzBuzzTree();
        assertNotNull(fz);
    }

    @Test
    public void testCreateAnEmptyK_aryTree(){
        K_aryTree<Integer> kTree = new K_aryTree<>(4);
        assertNotNull(kTree);
    }

    @Test
    public void testCreateAnEmptyFizzBuzzTree(){
        K_aryTree<Integer> kTree = new K_aryTree<>(4);
        K_aryTree<String> fizzBuzzTree = FizzBuzzTree.fizzBuzzTree(kTree);
        assertEquals(0,fizzBuzzTree.getSize());
    }

    @Test
    public void testCreateAFizzBuzzTree(){
        K_aryTree<Integer> ktree = new K_aryTree<>(4);
        ktree.add(2);
        ktree.add(3);
        ktree.add(4);
        ktree.add(5);
        ktree.add(6);
        ktree.add(7);
        ktree.add(9);
        ktree.add(15);
        ktree.add(20);
        ktree.add(25);
        ktree.add(30);
        K_aryTree<String> fizzBuzzTree = FizzBuzzTree.fizzBuzzTree(ktree);
        List<String> actual = fizzBuzzTree.breadthFirstSearch();
        System.out.println(fizzBuzzTree.breadthFirstSearch());
        assertArrayEquals(Arrays.asList("2", "Fizz", "4", "Buzz", "Fizz", "7", "Fizz", "FizzBuzz", "Buzz", "Buzz", "FizzBuzz").toArray(),actual.toArray());
    }

}
