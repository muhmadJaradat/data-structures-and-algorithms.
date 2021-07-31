package challenges.tree;

public class Node<Type> {
    private  Type key;
    private Node left;
    private Node right;

    public Node(Type key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Type getKey() {
        return key;
    }
    public void setKey(Type key) {
        this.key = key;
    }


}
