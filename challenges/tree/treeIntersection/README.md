# Tree InterSection

### [Code](../../lib/src/main/java/challenges/tree/BinaryTree.java)

### [Test](../../lib/src/test/java/challenges/tree/TreeMaxTest.java)

## Challenge Summary

In this challenge, the inputs are two BinaryTrees. The method is required to return a Set of values that appear in both trees.



## Whiteboard Process

![](./tree%20intersection.JPG)

## Approach & Efficiency

My approach was by traversing through the two binary trees and save each result in different list.
Then looping thorough the first list and at each loop check if the current value is existed in the second list,
if that was the case add the value to an empty set.

Time complexity: BigO(n);

Space Complexity : BigO(n);
