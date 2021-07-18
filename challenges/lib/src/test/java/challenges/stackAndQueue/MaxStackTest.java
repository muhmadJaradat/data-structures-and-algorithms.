package challenges.stackAndQueue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxStackTest {
    @Test void maxStack(){
        getMaxClass stack=new getMaxClass();
        stack.push(4);

        assertEquals(4,stack.getMax());
        stack.push(5);
        assertEquals(5,stack.getMax());
        stack.pop();
        assertEquals(4,stack.getMax());
        stack.push(3);
        assertEquals(4,stack.getMax());
        stack.push(200);
        stack.push(100);
assertEquals(200,stack.getMax());
stack.pop();
assertEquals(200,stack.getMax());

    }
}
