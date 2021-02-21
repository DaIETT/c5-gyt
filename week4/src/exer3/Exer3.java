package exer3;

import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-02-21-19:45
 */
public class Exer3 {
    /**第三题：小数转分数
     编写一个程序，实现将小数转为分数的功能
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入小数");
        double v = scanner.nextDouble();

        //1 把小数化成整数 乘小数位
        int count = DecimalCount(v);
        int x = (int) Math.round(v*Math.pow(10,count)); //x 作为分子
//        System.out.println("wdwdawdads"+x);
        int y = (int) Math.pow(10,count);  //y作为分母
        //2 取最大公约数
        int c = gcd(x,y);

        //3 分子 分母同除c

        System.out.println("该小数化成分数："+x/c+"/"+y/c);

    }

    //欧几里得 求最大公约数
    public static int gcd(int m,int n) {
        if(m<n) {
            int k=m;
            m=n;
            n=k;
        }
        return m%n == 0?n:gcd(n,m%n);
    }

    //求小数位个数
    public static int DecimalCount(double number) {
        if (number == (long)number) {
            return 0;
        }
        int i = 0;
        while (true){
            i++;
            if (number * Math.pow(10, i) % 1 == 0) {
                return i;
            }
        }
    }
}
