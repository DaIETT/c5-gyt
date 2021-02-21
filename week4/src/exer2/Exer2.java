package exer2;

import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-02-21-19:08
 */
public class Exer2 {
    /**
     * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入：");
        String next = scanner.next();

        boolean flag = false; // false 表示 没有重复的字符

        for(int i = 0;i<next.length();i++) {
            //反复遍历 跳过自己
            for(int j = 0;j<next.length();j++) {
                //跳过自己
                if (i==j && j+1<next.length()) {
                    j++;
                }

                //如果已经是最后一种情况了了  但是程序之前还没停止  说明 这个也是独一无二的
                if(i==j && j+1>=next.length()) {
                    System.out.println(i);
                    return;
                }

                if(next.charAt(i) == next.charAt(j)) {
                    //找到相同的 继续下一个字母
                    flag = true;
                    break;
                }
            }
            //每一个字符找完 进行一次判断
            if(!flag) {
                System.out.println(i);
                return;
            }
            //判断后还要重置标志
            flag = false;
        }

        System.out.println("-1");
    }


}


