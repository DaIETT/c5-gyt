import java.util.Arrays;

/**
 * @author Gyt
 * @create 2021-03-23 - 20:25
 */
public class Exer4 {

    /**
     * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = {1, 2, 4, 6, 7, 2, 14, 8};

        //滑动的长度
        int k = 3;

        if (k > ints.length || k < 1) {
            System.out.println("参数错误");
            return;
        }


        //i 为查找的起点
        for (int i = 0; i < ints.length - k + 1; i++) {
            int[] nums = getNums(ints, k, i);
            System.out.print(findMax(nums) + " ");
//            System.out.println(Arrays.toString(nums));
        }

    }

    /**
     * 获得窗口数组
     *
     * @param ints 原数组
     * @param k    窗口长度
     * @param q    查找起点
     * @return
     */
    public static int[] getNums(int[] ints, int k, int q) {


        //类似获得子串
        int[] ints1 = new int[k];

        for (int i = 0; i < k; i++) {
            if (q + i < ints.length)
                ints1[i] = ints[q + i];
        }

        return ints1;
    }


    public static int findMax(int[] ints) {
        int max = ints[0];

        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        return max;
    }

}
