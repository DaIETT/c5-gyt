package exer1;

import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-02-21-19:01
 */
public class Exer1 {
    public static void main(String[] args) {
        System.out.println("请输入源字符串：");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        System.out.println("输入字串：");
        String pattern = scanner.next();

        System.out.println(string.indexOf(pattern));

    }
}
