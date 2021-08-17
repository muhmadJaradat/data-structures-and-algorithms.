package challenges.LeftJoinTest;


import challenges.LeftJoin.LeftJoin;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class LeftJoinTest {
    @Test
    void LeftJoinTestFun(){
        Map<String,String> map1=new HashMap<>();
        Map<String,String> map2=new HashMap<>();

        map1.put("fond","enamored");
        map1.put("wrath","anger");
        map1.put("diligent","employed");
        map1.put("outfit","garb");
        map1.put("guide","usher");

        map2.put("fond","averse");
        map2.put("wrath","delight");
        map2.put("diligent","idle");
        map2.put("guide","follow");
        map2.put("flow","jam");

        Map<String, List<String>> result=new HashMap<>();
        result.put("fond", Arrays.asList("enamored","averse"));
        result.put("wrath", Arrays.asList("anger","delight"));
        result.put("diligent", Arrays.asList("employed","idle"));
        result.put("outfit", Arrays.asList("garb","null"));
        result.put("guide", Arrays.asList("usher","follow"));

        assertEquals(result,LeftJoin.LeftJoin(map1,map2));
    }
}
