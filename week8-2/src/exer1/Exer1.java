package exer1;

/**
 * @author Gyt
 * @create 2021-04-01 - 20:13
 * <p>
 * 1.二进制转字符串
 * 给定一个介于0和1之间的实数（如0.72），类型为double，打印它的二进制表达式。如果该
 * 数字无法精确地用32位以内的二进制表示，则打印“ERROR”。
 */

/**
 * 理由：
 * 十进制小数部分 转二进制是通过 乘2 取整数 并且下次乘2 忽略 整数部分
 */
public class Exer1 {

    public static void main(String[] args) {
        double x = 0.5;
        System.out.println(toBinary(x));
    }


    //将数字乘以2以后，与1比较。
    public static String toBinary(double x) {

        StringBuffer buffer = new StringBuffer();
        buffer.append("0.");

        while (x > 0) {
            if (buffer.length() >= 32)
                return "ERROR";
            double temp = x * 2;
            if (temp >= 1) {
                buffer.append("1");
                x = temp - 1;
            } else {
                buffer.append("0");
                x = temp;
            }
        }
        return buffer.toString();
    }

}
