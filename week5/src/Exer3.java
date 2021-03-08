import java.util.ArrayList;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-03-08-22:17
 */
public class Exer3 {

    /**
     * 参考了资料  太难了
     *
     * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 思路:
         * 利用递归回溯的方法:
         * 当子集的长度大于start起始位置时,退出递归
         * 否则将该子集加入到list集合中
         * 并进行递归调用
         * 在每一次递归回溯时,将子集中的最后一个元素剔除
         * */
        int[] nums = {1, 2, 3};
        Exer3 subset = new Exer3();
        List<List<Integer>> subsets = subset.subsets(nums);
        for (List<Integer> list : subsets) {
            System.out.println(list);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        //创建一个list集合保存最终的子集集合
        List<List<Integer>> list = new ArrayList<>();
        //定义一个集合,保存每一种子集
        List<Integer> numList = new ArrayList<>();
        //求出数组的长度
        int len = nums.length;
        //从数组的第一个位置开始进行子集的求解
        findSubset(0, len, nums, numList, list);
        return list;
    }

    private void findSubset(int start, int len, int[] nums, List<Integer> numList, List<List<Integer>> list) {
        //如果当前子集集合的长度大于所起始的位置,则返回
        if (numList.size() > start) {
            return;
        }
        //否则,将此子集加入list中
        list.add(new ArrayList<>(numList));
        //for循环进行子集的添加
        for (int i = start; i < len; i++) {
            numList.add(nums[i]);
            //递归
            findSubset(i + 1, len, nums, numList, list);
            //当返回时,去掉当前子集集合的最后一个元素
            numList.remove(numList.size() - 1);
        }
    }
}


