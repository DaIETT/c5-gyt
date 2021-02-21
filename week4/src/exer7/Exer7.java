package exer7;

import java.util.*;

/**
 * @author Gyt
 * @create 2021-02-21-20:50
 */
public class Exer7 {
    /**
     * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字
     * 符串。
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出:
     * [
     * ["ate","eat","tea"],
     * ["nat","tan"],
     * ["bat"]
     * ]
     * tips：先对字符串排序，如果是字母异位词，他们会有相同的 key。然后将排序后的字符串
     * 作为 key 存入 map 中
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] strings = new String[6]; //为方便 固定大小

        System.out.println("开始赋值");
        Assignment(strings);
        //1 排序存入到map

        HashSet<String> hashSet = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            //将其转换为char数组，使用Arrays.Sort对其进行排序，并将其转换回字符串
            char[] array = strings[i].toCharArray();
            Arrays.sort(array);
            String sorted = String.valueOf(array);
            //将排序后的字符串存到Set集合 方便后面判断使用
            hashSet.add(sorted);

            map.put(strings[i], sorted);
        }

        Set<String> stringSet = map.keySet();
        Iterator<String> iteratorHash = hashSet.iterator();



        while (iteratorHash.hasNext()) {
            String judge = iteratorHash.next();
            //每组都创建新的list
            ArrayList<String> stringArrayList = new ArrayList<>();

            Iterator<String> iteratorMap = stringSet.iterator();
            while (iteratorMap.hasNext()) {
                String key = iteratorMap.next();
                String value = map.get(key);

                //如果排序后的 等于 现在 的键值对的 值 就将它的key存入到 list
                if(judge.equals(value)) {
                    stringArrayList.add(key);
                }

            }

            System.out.println(stringArrayList);

        }

    }

    /**
     * 赋值
     */
    public static void Assignment(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            String s = scanner.next();
            strings[i] = s;
        }
    }

}
