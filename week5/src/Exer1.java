import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Gyt
 * @create 2021-03-08-21:45
 */
public class Exer1 {

    /**
     * 整数反转
     * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

//        Stack<Integer> stack = new Stack<>();
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入：x = ");
        int i = scanner.nextInt();
        boolean flag = true;

        //处理 0 或 负数
        if (i < 0) {
            flag = false;
            i = i * -1;
        }
        if (i == 0) {
            System.out.println("输出：" + i);
            return;
        }

        while (true) {
            //当所有位数都入队列 则停止
            if (i == 0) {
                break;
            }

            int temp = i % 10;
//            take()：首选。当队列为空时阻塞
            queue.put(temp);
            i /= 10;
        }

        StringBuilder sb = new StringBuilder();

        while (true) {
            if (queue.isEmpty())
                break;
            sb.append(queue.take());
        }
        int i1 = Integer.parseInt(sb.toString());

        if (!flag) {
            i1 = i1 * -1;
        }

        System.out.println("输出：" + i1);
    }

}
