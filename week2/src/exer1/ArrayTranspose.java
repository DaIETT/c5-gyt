package exer1;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-01-31-19:50
 */
public class ArrayTranspose {
    /*
    1. 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
     */
    @Test
    public void exer1() {
        Scanner in = new Scanner(System.in);
        System.out.println("请先输入数组行列n:");
        int n = in.nextInt();
        int temp;
        int[][] matrix = new int[n][n];

        System.out.println("请再输入数组各个元素:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < (n-1)/2; i++) {
            for (int j = 0; j < n-1-i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }

        System.out.println("转置后的数组");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
