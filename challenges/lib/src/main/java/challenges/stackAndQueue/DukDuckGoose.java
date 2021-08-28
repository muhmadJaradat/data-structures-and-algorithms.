package challenges.stackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class DukDuckGoose {

    public static void duckDuckGoose(List<String> arr,int k ){
        int index=0;

        while (arr.size()>1){
            index=(index+k-1)%arr.size();
            arr.remove(index);
        }
        System.out.println(arr.get(0));
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
      duckDuckGoose(list,3);

    }
}
