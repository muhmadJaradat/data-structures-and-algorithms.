package challenges.stackAndQueue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void testConstructor() {
        //checking empty queue
        Queue queue = new Queue();
        assertTrue(queue.isEmpty(),"Confirm Queue is empty after being instantiated.");
        assertEquals( 0, queue.size,"Confirm empty Queue is size '0'.");

        //checking after enqueue some values
        queue.enqueue(1);
        assertEquals(1, queue.size,"Queue should be size '1' after enqueueing one value." );
        assertEquals( 1, queue.peek(),"Front of the Queue should be '1'.");
        queue.enqueue(2);
        assertEquals(2, queue.size,"Queue should be size '2' after enqueueing two values." );
        assertEquals( 1, queue.peek(),"Front of the Queue should be still '1'.");

        //checking the rear value
        assertEquals(2,queue.getRear().getData(),"Rear of the queue should be '2'");

    }

    @Test
    public void testIsEmpty() {
        Queue queue = new Queue();
        assertTrue( queue.isEmpty(),"Queue should be empty upon instantiation.");
        queue.enqueue(1);
        assertFalse( queue.isEmpty(),"Should return 'false' if there is an item in the queue.");
        queue.dequeue();
        assertTrue( queue.isEmpty(),"After one enqueue and one dequeue, the Queue should be empty again.");
    }



    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        queue.enqueue("1");
        assertEquals( "1", queue.peek(),"Front of the Queue should contain the value '1'.");
        assertEquals( "1", queue.getRear().getData(),"The rear should have the same value as the front with one Entry in the Queue.");
        assertEquals( 1, queue.size,"Size of the queue should be '1'.");
        queue.enqueue("2");
        assertEquals( "1", queue.peek(),"Front of the Queue should still contain the value '1'.");
        assertEquals( "2", queue.getRear().getData(),"The rear should now contain the last value that was enqueued.");
        assertEquals( 2, queue.size,"Size of the queue should be '2'.");
        queue.enqueue("3");
        assertEquals( "1", queue.peek(),"Front of the Queue should still contain the value '1'.");
        assertEquals( "3", queue.getRear().getData(),"The rear should now contain the last value that was enqueued.");
        assertEquals( 3, queue.size,"Size of the queue should be '3'.");
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue();
        assertEquals( null, queue.dequeue(),"When dequeue is called on an empty Queue, it should return 'null'.");
        queue.enqueue("1");
        assertEquals( "1", queue.dequeue(),"Should return the value of the only item in the queue which is '1'.");
        assertTrue( queue.isEmpty(),"Confirm queue is now empty, should return 'true'.");
        assertEquals( 0, queue.size,"Confirm the size of the queue is '0'.");
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        assertEquals("1", queue.dequeue(),"Should return '1', the front value of the queue.");
        assertEquals( "2", queue.dequeue(),"Should return '2', the front value of the queue.");
        assertEquals( "3", queue.dequeue(),"Should return '3', the front value of the queue.");
        assertTrue( queue.isEmpty(),"Queue should be empty after dequeueing all items.");
    }

    @Test
    public void testPeek() {
        Queue queue = new Queue();
        assertEquals( "The queue is empty", queue.peek(),"Should return 'The queue is empty' when peek is called on an empty Queue.");
        queue.enqueue(1);
        assertEquals( 1, queue.peek(),"Should return '1', the value of the first item in the list.");

    }
}
