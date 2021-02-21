package exer5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Gyt
 * @create 2021-02-21-20:12
 */
public class Exer5 {

    /**
     * 数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没
     * 有，返回-1
     *
     * @param args
     */
    public static void main(String[] args) {
        //1 定义数组
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数组的大小");
        x = scanner.nextInt();
        int[] ints = new int[x];
        System.out.println("开始赋值");
        Assignment(ints);

        //2 将数组存入到Map中 key 位数字  value为个数
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ints.length; i++) {
            map.put(ints[i], 0);
        }
        System.out.println(map.toString());
        for (int i = 0; i < ints.length; i++) {
            map.put(ints[i], map.get(ints[i]) + 1);
        }

        System.out.println(map.toString());
        //3 找到 value 大于 length的 key
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            Integer value = map.get(key);
            if (value > ints.length/2) {
                System.out.println("这个主要数字是" + key);
                return;
            }
        }
        System.out.println("-1");


    }

    /**
     * 赋值
     */
    public static void Assignment(int[] ints) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++) {
            int i1 = scanner.nextInt();
            ints[i] = i1;
        }
    }
}
