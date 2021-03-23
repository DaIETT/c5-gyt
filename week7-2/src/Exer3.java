import java.util.HashMap;

/**
 * @author Gyt
 * @create 2021-03-23 - 20:17
 */
public class Exer3 {

    /**
     * 3. 给你一个整数数组nums 。数组中唯一元素是那些只出现恰好一次的元素。请你返回
     * nums中唯一元素的和。
     * 注意：借助hash表来实现
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 2};
        int[] ints2 = {1, 1, 1, 1, 1};
        int[] ints3 = {1, 2, 3, 4, 5};

        System.out.println(isUnique(ints));
        System.out.println(isUnique(ints2));
        System.out.println(isUnique(ints3));

    }

    public static int isUnique(int[] ints) {

        //key 是元素值 value是次数
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        //先填充
        for (int i = 0; i < ints.length; i++) {
            map.put(ints[i], 0);
        }

        //再置数
        for (int i = 0; i < ints.length; i++) {
            map.put(ints[i], map.get(ints[i]) + 1);
        }

        //再取数
        for (int i = 0; i < ints.length; i++) {
            if (map.get(ints[i]) == 1) {
                sum += ints[i];
            }
        }

        return sum;
    }

}
