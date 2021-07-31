package challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class K_aryTree <T> {

    KNode root=null;
    int nodes = 0;
    int K=0;


    public K_aryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        nodes++;
        KNode newNode = new KNode(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<KNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            KNode currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }

    public List<T> breadthFirstSearch(){
        List <T> tree = new ArrayList<>();
        Queue<KNode> queue = new LinkedList<>();
        if(isNotEmpty()){
            queue.add(root);
            while(!queue.isEmpty()){

                KNode currentNode = queue.poll();
                tree.add((T)currentNode.value);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return tree;
    }


    public int getSize(){
        return nodes;
    }
    @Override
    public String toString() {
        return "K-ary tree (K="+this.K+"): {" +
                "\n root=" + root +
                "\nnodes=" + nodes +
                '}';
    }
}
