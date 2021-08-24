# Hashtables

### [Code](./Hashtable.java)

### [Test](../../../../test/java/challenges/HashTable/HashtableTest.java)

## Challenge

For this challenge I implemented a Hashtable class, which is represented by an array and nodes. The main advantage to the Hashtable is O(1) lookup and insertion times when there are no collisions.

## Approach & Efficiency

| Function       | Big-O Time | Big-O Space |
|----------------|------------|-------------|
|`add()`         |O(1)        | O(n)        |
|`contains()`    |O(1)        | O(1)        |
|`get()`        |O(1)        | O(1)        |
|`hashCode()`     |O(1)        | O(1)        |
|`size()`        |O(1)        | O(1)        |

## API
* `add()` Takes in a key/value pair and adds it to the Hashtable.
* `contains()` Takes in a key and returns true/false depending on if it's in the Hashtable.
* `get()` Takes in a key, and returns the node containing that key. If not found, it returns null.
* `hashCode()` Takes in a key, returns an int representing an index in the array.
* `size()` Returns the number of Nodes contained in the Hashtable.