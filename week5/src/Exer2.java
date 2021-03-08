import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-03-08-22:09
 */
public class Exer2 {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入：");

        int i = scanner.nextInt();

        System.out.println("输出：有"+up(i)+"种方法爬到楼梯");

    }


    // 递归
    public static int up(int n) {
        // 有0种方法
        if (n <= 0)
            return 0;
        //有一种
        if (n == 1)
            return 1;
        //有两种
        if (n == 2)
            return 2;

        return up(n - 1) + up(n - 2);
    }
}
