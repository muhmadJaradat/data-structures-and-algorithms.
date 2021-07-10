package challenges.stackAndQueue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StackTest {
    @DisplayName("push method testing")
    @Test void StackPush(){
        Stack stack=new Stack();
        stack.push(4);
        assertTrue(stack.size==1,"the stack size is correct");
        stack.push(5);
        assertTrue(stack.size==2,"the stack size is correct");

        assertEquals(5, stack.getTop().getData(),"the top value is correct");

    }
    @DisplayName("pop method testing")
    @Test void StackPop(){
        Stack stack=new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        assertTrue(stack.size==2,"the stack size is correct");
        assertEquals(5, stack.getTop().getData(),"the top value is correct");
        assertEquals(5,stack.pop(),"should return the top value after popping it off");
        stack.pop();
        assertEquals("Cannot pop from empty stack",stack.pop(),"should return the exception message because stack is empty");


    }
    @DisplayName("peek method testing")
    @Test void StackPeek(){
        Stack stack=new Stack();
        //first check when stack is empty
        assertEquals("The stack is empty and the top node is null",stack.peek());
        //check after pushing a value
        stack.push(4);
        assertEquals(4,stack.peek());
        stack.push(6);
        assertEquals(6,stack.peek());
    }
}
