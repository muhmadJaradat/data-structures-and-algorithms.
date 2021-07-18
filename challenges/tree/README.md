# Trees

[Code](../lib/src/main/java/challenges/tree)

[Test](../lib/src/test/java/challenges/tree/TreeTest.java)



## Challenge

This challenge was aiming to introduce a new type of non-linear data structures: Trees, specually the Binary Tree and Binary Search Tree. A Binary Tree is used for the three methods used to do traversals, which the Binary Search Tree can actually insert values into the tree in a proper order.
## Approach & Efficiency

The BigO for Binary Tree will be always be O(n) where for Binary Search Tree O(logn)

## API

| Method           | Description                                                                            
|------------------|----------------------------------------------------------------
| ```inOrder()```  | Returns an ArrayList of the Node values or an in order traversal. (left, root, right)  
| ```preOrder()``` | Returns an ArrayList of the Node values or a pre-order traversal. (root, left, right)  
| ```postOrder()```| Returns an ArrayList of the Node values or a post-order traversal. (left, right, root) 