package exer4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-02-21-20:03
 */
public class Exer4 {

    /**
     * 找出第 K 小的数
     * 给定一个整数数组，找出该数组中第 k 小的数
     *
     * @param args
     */
    public static void main(String[] args) {
        //为方便 这里固定数组大小   以及 代码的严谨性等等（异常）没有考虑
        int[] ints = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始赋值");
        Assignment(ints);

        //直接排序 哈哈哈
        Arrays.sort(ints);

        System.out.println("输入你想要的第 k 小的数的k：");
        int i = scanner.nextInt();

        System.out.println("这个数是"+ints[i-1]);
    }

    /**
     * 赋值
     */
    public static void Assignment(int[] ints) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int i1 = scanner.nextInt();
            ints[i] = i1;
        }
    }
}
