package exercise1to4;

import org.junit.Test;

import java.util.Scanner;

/** week1 作业
 * @author Gyt
 * @create 2021-01-22-17:13
 */
public class work1 {

@Test
/**
 * 请用 if ... else 编写一个程序，用于计算体质指数 BMI，并打印结果。
 * BMI = 体重(kg)除以身高(m)的平方
 */
public void exer1(){
        Scanner in = new Scanner(System.in);

        System.out.println("输入体重(kg):");
        double x = in.nextDouble();
        System.out.println("输入身高(m):");
        double y = in.nextDouble();
        double n = x/(y*y);

        if(n<18.5){
            System.out.println("过轻");
        }
        else if(n<25 && n>=18.5){
            System.out.println("正常");
        }
        else if (n>=25 && n<28){
            System.out.println("过重");
        }
        else if(n>= 28&&n<32) {
            System.out.println("肥胖");
        }
        else if(n>=32){
            System.out.println("非常肥胖");
        }
    }

    @Test
    /**
     *  计算 1000 以内的水仙花数有多少个。所谓的“水仙花数”是指一个三位数其各位数字的
     * 立方和等于该数本身，例如 153 是“水仙花数”，因为：153 =1
     */
    public void exer2(){
        for(int i=100;i<1000;i++){
            if(i == Math.pow(i%10,3)+Math.pow(i/10%10,3)+Math.pow(i/100,3)){
                System.out.println(i+" 是水仙花数");
            }
        }
    }

    @Test
    /**
     *  编写一个函数，其作用是将输入的字符串反转过来。
     */
    public void exer3(){
        Scanner in = new Scanner(System.in);
        System.out.println("输入你想逆转的字符串：");
        String s = in.nextLine();

        String s1 = new StringBuilder(s).reverse().toString();
        System.out.println("转换过后：\n"+s1);

    }
    @Test
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的
     * 相对顺序。
     * 采用逆向思维 从后开始
     */
    public void exer4(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int flag = 0;//用于记录0的个数

        System.out.println("先初始化数组（长度为5）：");
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        //优化 先从后面开始 找到第一个非0
        int temp = arr.length;
        int flag2 = 0;//用于判断全0
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i] != 0){
                temp = i;
                break;
            }
            //用于判断全0
            if(arr[0] == 0){
                System.out.println("变换后:");
                for(int n:arr){
                    System.out.print(n+" ");
                }
                return;
            }
        }

        for(int i = temp;i>=0;i--){

            if(arr[i] == 0) {

                //数组向前移动
                    flag++;
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }

                    //将末尾置0
                    arr[arr.length - flag] = 0;

                    //这是为了防止有连续的0
                    i++;

            }
        }

        System.out.println("变换后:");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }

}
