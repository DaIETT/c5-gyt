package exer2;

/**
 * @author Gyt
 * @create 2021-04-04 - 15:46
 */

/**
 * 约瑟夫环问题：圆圈中最后剩下的数字
 * 0,1,···,n-1 这 n 个数字排成一个圆圈，从数字 0 开始，每次从这个圆圈里删除第 m 个数字（删
 * 除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 * 例如，0、1、2、3、4 这 5 个数字组成一个圆圈，从数字 0 开始每次删除第 3 个数字
 */
public class Exer2 {

    public static void main(String[] args) {
        System.out.println(OK(5, 3));
    }

    public static int OK(int n, int m) {

        int last = 0;

        for (int i = 2; i <= n; i++)
            last = (last + m) % i;

        return last;
    }

}

