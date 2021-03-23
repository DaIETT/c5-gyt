/**
 * @author Gyt
 * @create 2021-03-23 - 20:42
 */
public class Exer5 {

    /**
     * 给定一个二进制数组，计算其中最大连续 1 的个数。
     * <p>
     * //感觉这样会增加时间复杂度 最小n就可以完成
     * 注意：解题方法只能使用滑动窗口
     *
     * @param args
     */
    public static void main(String[] args) {

        //最长为6
        int[] ints = {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1};

        //1的个数
        int count = 0;

        //k 为滑动窗口的长度
        for (int k = 1; k < ints.length; k++) {
            //i 为查找的起点
            for (int i = 0; i < ints.length - k + 1; i++) {
                int[] nums = Exer4.getNums(ints, k, i);

                //窗口全是1
                if (findMin(nums) == 1) {
                    //count只会增加
                    count = k;
                }
            }
        }

        System.out.println(count);
    }

    //这里我用滑动窗口中 最小数来判断
    public static int findMin(int[] ints) {
        int min = ints[0];

        for (int i = 1; i < ints.length; i++) {
            if (min > ints[i]) {
                min = ints[i];
            }
        }
        return min;
    }
}
