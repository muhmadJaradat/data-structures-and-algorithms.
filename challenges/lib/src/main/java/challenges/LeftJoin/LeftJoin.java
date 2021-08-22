package challenges.LeftJoin;

import java.util.*;

public class LeftJoin {


    public static Map<String,List<String>> leftJoin(Map<String,String> map1, Map<String,String> map2){
        Map<String,List<String>> resultMap=new HashMap<>();

     map1.forEach((k,v)->{
         resultMap.put(k, Arrays.asList(v, map2.getOrDefault(k, "null")));
     });
     return resultMap;

}

}

