package challenges.tree;


import java.util.ArrayList;
import java.util.List;

public class KNode<T> {

    T value;
    List<KNode> children = new ArrayList<>();

    public KNode(T value) {
        this.value = value;
    }


    public List<KNode> getChildren() {
        return children;
    }

    public void addChild(KNode child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        StringBuilder result= new StringBuilder("{value= ");
        result.append(value);
        result.append("\nChildren: [");
        for(KNode ch : children) {
            result.append("\n child: ");
            result.append(ch);
        }
        result.append("]");

        return result.toString();
    }
}
