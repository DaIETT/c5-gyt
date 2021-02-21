package exer6;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Gyt
 * @create 2021-02-21-20:31
 */
public class Exer6 {
    /**
     * tips:利用栈来解决
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * 示例一：
     * 输入：s = "()"
     * 输出：true
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String next = scanner.next();
        System.out.println(isValid(next));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
