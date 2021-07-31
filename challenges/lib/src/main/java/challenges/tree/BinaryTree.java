package challenges.tree;

import challenges.stackAndQueue.Queue;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<Type> {
    private Node root;

    public List preOrder(Node node,List list){
        if (node!=null) {
            list.add(node.getKey());
            preOrder(node.getLeft(),list);
            preOrder(node.getRight(),list);
        }
        return list;
    }

    public List postOrder(Node node, List list){
        if (node!=null) {
            postOrder(node.getLeft(),list);
            postOrder(node.getRight(),list);
            list.add(node.getKey());

        }
        return list;
    }

    public List inOrder(Node node,List list){
        if (node!=null) {
            inOrder(node.getLeft(),list);
         list.add(node.getKey());
            inOrder(node.getRight(),list);
        }
        return list;
    }

    public String breadthFirst(BinaryTree tree){
        if (tree.getRoot()==null)return null;
        List<Type> list =new ArrayList<Type>();
        Queue queue=new Queue<>();
        Node<Type> node=tree.getRoot();
        queue.enqueue(node);
        while (queue.getFront()!=null) {
            node = (Node) queue.dequeue();
            list.add(node.getKey());
            if (node.getLeft() != null) queue.enqueue(node.getLeft());
            if (node.getRight() != null) queue.enqueue(node.getRight());
        }
return list.toString();
        }



    public  int findMaxValue() throws IllegalStateException {
        if(this.root == null) {
            throw new IllegalStateException();
        }
        return findMaxHelper(this.root);
    }

    private  int findMaxHelper(Node<Integer> root) {
        int max = root.getKey();
        if(root.getLeft() != null) {
            max = max(max, findMaxHelper(root.getLeft()));
        }
        if(root.getRight() != null) {
            max = max(max, findMaxHelper(root.getRight()));
        }
        return max;
    }

    public boolean compareTwoDirectories(BinaryTree tree1,BinaryTree tree2){
        return tree1.compareHelper() == tree2.compareHelper();
    }
    public int compareHelper(){
        int num=0;
        if (this.getRoot()==null)return 0;
        Queue queue=new Queue<>();
        Node<Type> node=this.getRoot();
        queue.enqueue(node);
        while (queue.getFront()!=null) {
            node = (Node) queue.dequeue();
            if (node.getLeft()==null&&node.getRight()==null)num++;
            if (node.getLeft() != null) queue.enqueue(node.getLeft());
            if (node.getRight() != null) queue.enqueue(node.getRight());
        }
return num;
    }


    private static int max(int a, int b) {
        return Math.max(a, b);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
