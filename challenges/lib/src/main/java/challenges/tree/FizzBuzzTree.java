package challenges.tree;


import java.util.LinkedList;
import java.util.Queue;

public class FizzBuzzTree {

    public FizzBuzzTree() {

    }

    public static K_aryTree<String> fizzBuzzTree(K_aryTree<Integer> kTree){
        K_aryTree<String> outTree = new K_aryTree(kTree.K);

        Queue<KNode> queue = new LinkedList<>();
        if(kTree.isNotEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                KNode<Integer> currentNode = queue.poll();

                String currentValue;
                if(currentNode.value % 3 == 0 && currentNode.value % 5 ==0 )
                    currentValue = "FizzBuzz";
                else if((int)currentNode.value % 3 == 0)
                    currentValue="Fizz";
                else if((int)currentNode.value % 5 == 0)
                    currentValue="Buzz";
                else
                    currentValue=currentNode.value.toString();

                outTree.add(currentValue);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return outTree;
    }
}









