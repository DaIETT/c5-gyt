package exer4;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-01-31-20:31
 */
public class Game {
    int v = 100;

    @Test
    public void guess() {
        Scanner scanner = new Scanner(System.in);
        int num = 999999;
        System.out.println("开始猜数数字:");
        while (true) {
            num = scanner.nextInt();
            if (num < v)
                System.out.println("猜小了");
            else if (num > v)
                System.out.println("猜大了");
            else {
                System.out.println("猜对了！\n游戏结束");
                break;
            }
        }

    }
}