package challenges.tree;

public class BinarySearchTree<Type> extends BinaryTree<Type>{

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

    public void traverse(Node<Integer> current, int value){
        int currentValue=  current.getKey();
        if (value<currentValue){
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


    public boolean containTraverse(Node<Integer> current, int value){
        int currentValue=  current.getKey();
        if (value==currentValue){
            return true;
        }
        if (value<currentValue){
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
