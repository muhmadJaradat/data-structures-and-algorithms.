# Stacks and Queues

[Stack's Code](../lib/src/main/java/challenges/stackAndQueue/Stack.java)

[Queue's Code](../lib/src/main/java/challenges/stackAndQueue/Queue.java)

Create a Node Stack and Queue class to implement a Stack and Queue.

## Challenge

Identify and implement a efficient solution for Queues and Stacks methods creation.

## Approach & Efficiency

all operations have a constant time of O(1) . All operations will take the space of O(1).

## API

### Stack

Stack is constructed with only one field, ```Node top```, which points to the top of the stack or to null if the stack is empty.  The Stack class is made up of Nodes, which contain a value and pointer to the next Node in the sequence.  For example, the top Node in a Stack with many Nodes will point to the next Node.  The bottom Node's next will point to null.


| Method           | Description                                                                    
|------------------|--------------------------------------------------------------------------------
| ```isEmpty()```  | Returns true or false depending on if stack is empty or not empty.             
| ```peek()```     | Returns the value of the top node in the stack and keeps that node on the top. 
| ```pop()```      | Removes the top node of the stack and returns its value.                       
| ```push()```     | Adds a new value to the top of the stack.                                      


## Queue

The Queue class is constructed with the same idea as a normal line.  It contains two pointers, ```Node front``` and ```Node rear```, to help with time efficiency.  When a Node is added to the Queue, it is always added to the back with ```enqueue()```.  When an item is removed from the Queue, it is always removed from the front with ```dequeue()```.

| Method               | Description                                                                     
|----------------------|----------------------------------------------------------------------------------
| ```isEmpty()```      | Returns true or false depending on if queue is empty or not empty.               
| ```peek()```         | Returns the value of the front node in the queue and keeps that node on the top. 
| ```enqueue()```      | Removes the front node of the queue and returns its value.                      
| ```dequeue()```      | Adds a new value to the back of the queue.                                              