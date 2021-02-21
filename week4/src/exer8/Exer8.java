package exer8;

import org.junit.Test;

import java.io.*;

/**
 * @author Gyt
 * @create 2021-02-21-21:29
 */
public class Exer8 {

    /**
     * 在电脑 c 盘的 csatest 目录下，创建一个名称为 demo.txt 的文件。然后将下列内容：
     * "csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa20
     * 21csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2
     * 021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021"添
     * 加到 demo.txt 中，接着利用 java 程序读取该文件中的内容，计算出总共有多少个 2021,并输
     * 出到控制台。
     */

    public static void main(String[] args) throws Exception {
        String s = fileRead();

        countChildStr(s,"2021");

    }

    public static String fileRead() throws Exception {
        //初始化BufferedReader
        FileReader reader = new FileReader(new File("C:\\csatest\\demo.txt"));

        //将文件内容读取到缓存
        BufferedReader bReader = new BufferedReader(reader);

        //将字符串存放缓存中
        StringBuilder sb = new StringBuilder();//
        String s = "";
        while ((s = bReader.readLine()) != null) {//逐行读取文件内容
            sb.append(s + "\n");
            System.out.println(s);
        }
        //记得关流
        bReader.close();
        String str = sb.toString();
//        System.out.println(str);
        return str;
    }

    /**
     * 计算子串个数
     * @param string1
     * @param string2
     */
    public static void countChildStr(String string1, String string2) {

        int i = string1.length() - string1.replace(string2, "").length();
        System.out.println("字串个数为:"+i / string2.length());
    }
}
