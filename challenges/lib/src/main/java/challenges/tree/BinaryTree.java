package challenges.tree;

import java.util.List;

public class BinaryTree {
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

    public  int findMaxValue() throws IllegalStateException {
        if(this.root == null) {
            throw new IllegalStateException();
        }
        return findMaxHelper(this.root);
    }

    private  int findMaxHelper(Node root) {
        int max = root.getKey();
        if(root.getLeft() != null) {
            max = max(max, findMaxHelper(root.getLeft()));
        }
        if(root.getRight() != null) {
            max = max(max, findMaxHelper(root.getRight()));
        }
        return max;
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
