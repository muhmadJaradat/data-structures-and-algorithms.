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

    public int findMaxVal (){
        int max = Integer.MIN_VALUE;
        return findMaxValUtil(root,max);
    }

    private int findMaxValUtil (Node current,int max){
        // base case -> if node is empty return current max val
        if(current == null) return max;

        if (current.getKey() > max)
            max = current.getKey();

        return current.getKey() > max
                ? findMaxValUtil(current.getLeft(),max)
                : findMaxValUtil(current.getRight(),max);

    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
