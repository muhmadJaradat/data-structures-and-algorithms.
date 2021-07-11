package challenges.stackAndQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PseudoQueueTest {

    @Test void enqueueTest(){
PseudoQueue pQueue=new PseudoQueue();

// check when queue is empty
assertEquals(0,pQueue.Size,"Size should be '0'");

//add some values
        pQueue.enqueue(1);
        pQueue.enqueue(2);
        assertEquals(2,pQueue.Size,"Size should be '2'");

    }

    @Test void dequeueTest(){
        PseudoQueue pQueue=new PseudoQueue();

        //check the dequeue when queue is empty
        assertEquals(null,pQueue.dequeue(),"this should return 'null'");

        //check after adding one value
        pQueue.enqueue(1);
        assertEquals(1,pQueue.Size,"this should return '1'");
        assertEquals(1,pQueue.dequeue(),"this should return '1' after popping it ");
        assertEquals(0,pQueue.Size,"this should return '0'");

        //check after adding multiple values
        pQueue.enqueue(1);
        pQueue.enqueue(2);
        pQueue.enqueue(3);
        assertEquals(3,pQueue.Size,"this should return 3");
        assertEquals(1,pQueue.dequeue(),"this should return '1'");
        assertEquals(2,pQueue.dequeue(),"this should return '2'");
        assertEquals(3,pQueue.dequeue(),"this should return '3'");
        assertEquals(null,pQueue.dequeue(),"this should return 'null'");
        assertEquals(0,pQueue.Size,"this should return '0'");



    }
}
