package exer3;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-02-17-21:06
 */
public class exer3 {
    /**
     * 现获取到用户输入的一段字符串（可从键盘录入），例如：aaaabbbcccccdd。请编写程序
     * 获取其中无重复的字符组成一个新的字符串，即：abcd。请不要改变字符的输入顺序。
     * 提示：可以利用 set 集合的去重
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入：");
        String s = scanner.next();

        HashSet<Character> hashSet = new HashSet<>();

        for(int i=0;i<s.length();i++) {
            hashSet.add(s.charAt(i));
        }

        for(char a : hashSet) {
            System.out.print(a);
        }
    }
}
