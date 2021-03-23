import javafx.geometry.Pos;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Gyt
 * @create 2021-03-22 - 22:32
 */
public class Exer1 {

    /**
     * 1.给你两个没有重复元素的数组 ints21和 ints22 ，其中ints21 是 ints22 的子集。
     * 请你找出 ints21 中每个元素在 ints22 中的下一个比其大的值。
     * 注意：
     * ints21 中数字 x 的下一个更大元素是指 x 在 ints22 中对应位置的右边的第一个
     * 比 x 大的元素。如果不存在，对应位置输出 -1 。
     * 解题方法只能使用单调栈解法
     * <p>
     * 单调栈：
     * <p>
     * 单调栈中存放的数据应该是有序的，所以单调栈也分为单调递增栈和单调递减栈
     * 单调递增栈：单调递增栈就是从栈底到栈顶数据是从大到小
     * 单调递减栈：单调递减栈就是从栈底到栈顶数据是从小到大
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints1 = {4, 1, 2};
        int[] ints2 = {1, 3, 4, 2};

        for (int i : findGreater(ints1, ints2)) {
            System.out.println(i);
        }
    }

    public static int[] findGreater(int[] ints1, int[] ints2) {
        //单调栈
        Stack<Integer> stack = new Stack<>();

        //map key用来存放ints2中所有  value存放右边第一个大于的结果
        HashMap<Integer, Integer> map = new HashMap<>();

        //结果集
        int[] res = new int[ints1.length];

        for (int i = 0; i < ints2.length; i++) {
            //若栈有元素并且小于右边的元素   peek查看一下栈顶
            while (!stack.empty() && ints2[i] > stack.peek()) {
                //存放到map 并且要弹出元素 从而实现单调栈  从大到小
                map.put(stack.pop(), ints2[i]);
            }
            
            
            //刚开始栈是空的 先放入 第一个  
            stack.push(ints2[i]);
        }

        while (!stack.empty())
            map.put(stack.pop(), -1);
        
        //这里才考虑ints1  只需要ints1中的即可
        for (int i = 0; i < ints1.length; i++) {
            res[i] = map.get(ints1[i]);
        }
        return res;
    }
}
