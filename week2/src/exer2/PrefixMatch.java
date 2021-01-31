package exer2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-01-31-20:12
 */
public class PrefixMatch {
    String[] strs = new String[3];

    @Test
    public void test() {
        System.out.println("请分别输入三个连续的字符串：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            strs[i] = scanner.next();
        }

//        开始匹配
        //1 获取最短字符串的长度
        int minLen = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            minLen = Math.min(strs[i].length(), strs[i + 1].length());
        }

        //2 进行逐字匹配
        if (strs[0].charAt(0) != strs[1].charAt(0) || strs[1].charAt(0) != strs[2].charAt(0)) {

            System.out.println("不存在公共域");
        } else {
            for (int i = 0; i < minLen; i++) {
                if (strs[0].charAt(i) == strs[1].charAt(i) && strs[1].charAt(i) == strs[2].charAt(i)) {
                    System.out.print(strs[0].charAt(i));
                } else
                    break;
            }

        }
    }
}
