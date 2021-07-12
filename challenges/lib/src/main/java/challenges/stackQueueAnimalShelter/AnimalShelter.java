package challenges.stackQueueAnimalShelter;

import challenges.stackAndQueue.Queue;

public class AnimalShelter {
    Queue dogs;
    Queue cats;

    public AnimalShelter() {
       dogs=new Queue();
       cats=new Queue();
    }

    public void enqueue(Animal animal){
        if(animal instanceof Cat){
            cats.enqueue(animal);
        }
        else if (animal instanceof Dog){
            dogs.enqueue(animal);
        }
    }

    public String dequeue(String animal){
        if (animal=="dog"&& !dogs.isEmpty()){
            Animal dog= (Animal) dogs.dequeue();
            return dog.getName();
        }
        else if (animal=="cat"&& !cats.isEmpty()){
            Animal cat= (Animal) cats.dequeue();
            return cat.getName();
        }
        else {
return null;
        }
    }
}
