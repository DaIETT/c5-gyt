package exer1;


import org.junit.Test;

import java.util.*;

/**
 * @author Gyt
 * @create 2021-04-17 - 13:24
 */
public class Exer1 {

    /**
     * ①某商场周年庆举办了一次抽奖活动：n 个人参与抽奖，每人抽到一个初始序号
     * a[i]，如果 a[i]是某个数的平方，那么这个人就能够获奖。
     * 现在商场为了吸引人流量，决定发放一些修改劵，修改劵的作用是：能使序号
     * a[i]加一或者减一。问：如果要使至少一半的人获奖，商场最少需要发放多少修
     * 改劵
     * <p>
     * <p>
     * 思路：
     * 用 map数据结构       存放 key：整数   value：需要的修改卷
     * 分别计算每个数字 至少需要的修改卷 并存放到map
     *
     * @param args
     */
    public static void main(String[] args) {
        int flag = 0; //修改卷
        HashMap<Integer, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数组大小");
        int nextInt = scanner.nextInt();
        int[] ints = new int[nextInt];

        //初始化数组
        System.out.println("请输入数组内容");
        for (int i = 0; i < nextInt; i++) {
            ints[i] = scanner.nextInt();
        }

        //存入map  并计算 修改卷
        for (int i = 0; i < nextInt; i++) {
            map.put(ints[i],calculate(ints[i]));
        }


        //找出 总人数一半数量 的 最小修改卷数
        int halfPeo = (int) Math.ceil(nextInt/2.0);
        //对map进行排序
        Map map1 = sortMap(map);

        int i = 0;
        Set<Map.Entry<Integer,Integer>> set = map1.entrySet();
        for(Map.Entry<Integer,Integer> entry : set) {

            //取总人数一半的修改卷
            if(i==halfPeo) {
                break;
            }

            System.out.println(entry.getKey()+" "+entry.getValue());
            flag+=entry.getValue();

            i++;

        }

        System.out.println("一共需要"+flag+"张卷");



    }

    /**
     * 计算当前整数需要的修改卷
     *
     * @return
     */
    public static int calculate(int num) {

        int flag = 0;


        if (isSquareNum(num)) {
            return flag;
        }

        while (true) {
            flag++;

            if (isSquareNum(num - flag) || isSquareNum(num + flag)) {
                break;
            }
        }

        return flag;
    }

    public static boolean isSquareNum(int num) {

        if (Math.pow((int) Math.sqrt(num), 2) == num) {
            return true;
        }

        return false;
    }

    /**
     * map排序
     */
    public static Map sortMap(Map map) {

        //根据 map的value 排序
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(map.entrySet());

        list2.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        Map<Integer, Integer> map2 = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : list2) {
            map2.put(entry.getKey(), entry.getValue());
        }

        return map2;
    }


}
