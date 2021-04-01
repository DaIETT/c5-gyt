package exer2;

/**
 * @author Gyt
 * @create 2021-04-01 - 20:28
 */

/**
 * 验证回文字符串
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 */
public class Exer2 {

    public static void main(String[] args) {

        System.out.println(isHuiWen("AADSAwA"));

    }


    public static boolean isHuiWen(String s) {
        return isHuiWen(s, 0, s.length() - 1, 0);
    }


    /**
     * @param s
     * @param i
     * @param j
     * @param flag 用于记录不满足的个数
     * @return
     */
    public static boolean isHuiWen(String s, int i, int j, int flag) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                flag++;
                if (flag > 1) {
                    return false;
                }

                //进行 左 右 递归（减少一个字符判断）
                return isHuiWen(s, i + 1, j, flag) || isHuiWen(s, i, j - 1, flag);
            }
        }

        return true;
    }

}
