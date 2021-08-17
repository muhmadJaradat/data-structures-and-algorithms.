package challenges.HashTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {
    @Test
    void AddingTest(){
        Hashtable<String, Integer> map = new Hashtable<>();
        map.add("this", 1);
        map.add("coder", 2);
        assertEquals(2,map.size(),"should return size of 2");
        map.add("this", 4);
        assertEquals(2,map.size(),"should return size of 2 because we added a new value for existing key");
        map.add("hi", 5);
    assertEquals(3,map.size(),"should return size of 3");



    }

    @Test
    void containsTest(){
        Hashtable<String, Integer> map = new Hashtable<>();
        map.add("this", 1);
        map.add("coder", 2);
        assertFalse(map.contains("hi"));
        assertTrue(map.contains("this"));
    }
}
