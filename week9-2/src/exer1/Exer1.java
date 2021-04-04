package exer1;

/**
 * @author Gyt
 * @create 2021-04-04 - 15:15
 */


import java.util.*;

/**
 * 1. 给定一个集合，里面有 1000 个整数，请找出重复次数最多的那 10 个数。
 * Tips：可以借助 hashmap 来实现，也可以借助预排序实现
 */
public class Exer1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        TreeSet<Integer> list = new TreeSet<>();

        int temp;
        for (int i = 0; i < 1000; i++) {
            temp = (int) Math.round(Math.random() * 100);
//            System.out.println(temp);
            list.add(temp);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer integer : list) {
            map.put(integer, 0);
        }

        for (Integer integer : list) {
            map.put(integer, map.get(integer) + 1);
        }

        System.out.println(map);


        //根据 map的value 排序
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map.entrySet());

        list2.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });

        Map<Integer, Integer> map2 = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : list2) {
            map2.put(entry.getKey(), entry.getValue());
        }

        int i = 0;
        Set<Map.Entry<Integer, Integer>> entries = map2.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            //只要10个
            if(i==10) {
                break;
            }
            System.out.println((entry.getKey() +":"+ entry.getValue()));
            i++;
        }


    }


}
