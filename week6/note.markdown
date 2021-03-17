```java
package JavaExercises;

import java.util.Arrays;

/**
 * @author Gyt
 * @create 2021-03-17-9:22
 */
public class test1 {
    /**
     * ①给你一个 m 行 n 列的矩阵 matrix ，
     * 请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
     *
     * @param args
     */
    public static void main(String[] args) {
        //定义数组
        int m = 3;
        int n = 4;
        int[][] ints = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        show(ints, m, n);
        /*
        1  2  3  4
        5  6  7  8
        9  10 11 12
         */

        int[] clockwise = clockwise(ints);
        System.out.println(Arrays.toString(clockwise));
        //[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]

    }


    public static void show(int[][] ints, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-3d", ints[i][j]);
            }
            System.out.println();
        }
    }



    public static int[] clockwise(int[][] arr) {
        if(arr.length == 0)
            return new int[] {};
        //变量top,bottom,left,right分别为上下左右的边界
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        //move为位置数组，move[0]代表行的位移量，move[1]代表列的位移量
        int[] move = new int[]{0,1};
        //index指示结果数组result
        int index = 0;
        //count为数组arr的总元素用于控制循环
        int count = arr.length*arr[0].length;
        //保存结果的数组
        int[] result = new int[arr.length*arr[0].length];
        //arr数组的行列坐标分别用row和column表示
        int row = 0;
        int column = 0;
        while(count > 0) {
            result[index++] = arr[row][column];
            count--;
            if(row == top && column == right && move[1] == 1) { //第三个条件是区别是开始，还是结束的时候
                move[0] = 1;                    //遇到右上角向下转
                move[1] = 0;
                top++;
            } else if(row == bottom && column == right && move[0] == 1) { //遇到右下角向左转
                move[0] = 0;
                move[1] = -1;
                right--;
            } else if(row == bottom && column == left && move[1] == -1) { //遇到左下角向上转
                move[0] = -1;
                move[1] = 0;
                bottom--;
            } else if(row == top && column == left && move[0] == -1) { //遇到左上角向右转
                move[0] = 0;
                move[1] = 1;
                left++;
            }
            //数组arr按规则移动
            row += move[0];
            column += move[1];
        }
        //返回保存好的数组
        return result;
    }


}

```