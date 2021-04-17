package exer2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Gyt
 * @create 2021-04-17 - 14:14
 */
public class Exer2 {

    /**
     * 一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成的
     * 串。例如，字符串 aaab 有非空子串 a, b, aa, ab, aaa, aab, aaab，一共 7 个。
     * （注意在计算时，只算本质不同的串的个数） 请问，字符串 0100110001010001
     * 有多少个不同的非空子串？
     *
     * @param args 思路：
     *             数据结构  set 不可重复元素
     *             用循环 以 字符串长度 进行 查找 子串
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String next = scanner.next();

        for (int i = 0; i < next.length(); i++) {
//            System.out.println(next.substring(i,i+1));
            set.add(next.substring(i,i+1));
        }

        for (int i = 1; i <= next.length(); i++) {
            for (int j = 0; j < next.length() - i; j++) {
//                System.out.println(next.substring(j, j+i+1));
                set.add(next.substring(j,j+i+1));
            }
        }

        System.out.println(set.size());

    }


}
