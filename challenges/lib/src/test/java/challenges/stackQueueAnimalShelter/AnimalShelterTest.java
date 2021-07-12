package challenges.stackQueueAnimalShelter;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTest {
    @Test public void enqueueTest(){
        AnimalShelter animalShelter=new AnimalShelter();
        Animal bob=new Dog("bob");
        Animal sam=new Cat("sam");

        //check the dogs and cats queues size
        assertEquals(0,animalShelter.cats.getSize(),"this should return '0'");
        assertEquals(0,animalShelter.dogs.getSize(),"this should return '0'");

        //check after enqueue some animals
        animalShelter.enqueue(bob);
        assertEquals(0,animalShelter.cats.getSize(),"this should return '0'");
        assertEquals(1,animalShelter.dogs.getSize(),"this should return '1'");

        animalShelter.enqueue(sam);
        assertEquals(1,animalShelter.cats.getSize(),"this should return '1'");
        assertEquals(1,animalShelter.dogs.getSize(),"this should return '1'");

        //check after adding another cat
        Animal siri=new Cat("siri");
        animalShelter.enqueue(siri);

        assertEquals(2,animalShelter.cats.getSize(),"this should return '2");
        assertEquals(1,animalShelter.dogs.getSize(),"this should return '1'");

    }

    @Test public void dequeue(){
        AnimalShelter animalShelter=new AnimalShelter();
        Animal bob=new Dog("bob");
        Animal sam=new Cat("sam");

        //check the dequeue when the shelter is empty
        assertEquals(null, animalShelter.dequeue("dog"));

        //check the dequeue when not providing cat or dog
        assertEquals(null,animalShelter.dequeue("monkey"));

        //check after adding dogs and cats
        animalShelter.enqueue(bob);
        assertEquals(null, animalShelter.dequeue("cat"));
        assertEquals("bob", animalShelter.dequeue("dog"));

        animalShelter.enqueue(sam);
        assertEquals("sam", animalShelter.dequeue("cat"));
        assertEquals(null,animalShelter.dequeue("dog"));




    }
}
