import org.junit.Test;

import java.util.*;

/**
 * @author Dale
 * @create 2021-01-21-21:44
 */
public class Test1 {

    @Test
    public void Test(){

        System.out.println("Hello");

    }

@Test
    public void Test2(){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Dale",1000);
        map.put("Shally",20);
        map.put("Tom",5);
        map.put("GGG",9999);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

            String name = next.getKey();
            Integer score = next.getValue();

            System.out.println(name+"*****"+score);

        }

    System.out.println(map.get("Dale"));
    }
}
