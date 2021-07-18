package challenges.tree;

public class BinarySearchTree extends BinaryTree{

    public  void add(int value) {
        if (this.getRoot()==null){
            this.setRoot(new Node(value));
        }
        else {
            Node current=this.getRoot();
            traverse(current,value);

        }
    }

    public boolean contain(int value){
        if (this.getRoot()==null){
            return false;
        }
        return containTraverse(this.getRoot(),value);
    }

    public void traverse(Node current, int value){
        if (value<current.getKey()){
            if (current.getLeft()==null){
                current.setLeft(new Node(value));
                return;
            }
            current=current.getLeft();
        }
        else {
            if (current.getRight()==null){
                current.setRight(new Node(value));
                return;
            }
            current=current.getRight();
        }
        traverse(current,value);
    }


    public boolean containTraverse(Node current, int value){
        if (value==current.getKey()){
            return true;
        }
        if (value<current.getKey()){
            if (current.getLeft()==null){
                return false;
            }
            current=current.getLeft();
        }
        else {
            if (current.getRight()==null){
                return false;
            }
            current=current.getRight();
        }

       return containTraverse(current,value);

    }
}
