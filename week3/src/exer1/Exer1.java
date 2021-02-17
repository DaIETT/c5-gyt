package exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-02-17-20:52
 */
public class Exer1 {

    /**.三数之和：给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，
     b，c ，使得 a + b + c =target。请你找出所有满足条件且不重复的三元组。

     * 参考了答案
     * 采用双指针 该算法时间复杂度尽可能很低
     */
    @Test
    public void threeSum() {

        int[] nums = {-1,0,1,2,-1,-4};
        List list = new ArrayList<>();
        int len = nums.length;

        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            //大于0提前结束
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    //数字一样跳过 防止重复
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                }

                else if (sum < 0) left++;

                else if (sum > 0) right--;
            }
        }

        System.out.println(list.toString());
    }
}
