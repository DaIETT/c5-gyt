import java.util.Stack;

/**
 * @author Gyt
 * @create 2021-03-23 - 12:09
 */
public class Exer2 {
    /**
     * 给定 pushed 和 popped 两个序列，每个序列中的 值都不重复，只有当它们可能是
     * 在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回 true；否则，返
     * 回 false 。
     * 注意：借助栈来实现
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {4, 5, 3, 2, 1};

        System.out.println(isOk(ints1, ints2));

    }

    public static Boolean isOk(int[] ints1, int[] ints2) {
        int length = ints1.length;
        //辅助栈
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < ints1.length; i++) {
            stack.push(i);

            //每次压数字的时候就比较一次
            while (!stack.isEmpty() && index < length && stack.peek() == ints2[index]) {
                stack.pop();
                index++;
            }
            //不满足继续压栈
        }
        return index == length;

    }
}
