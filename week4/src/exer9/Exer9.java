package exer9;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Gyt
 * @create 2021-02-21-21:49
 */
public class Exer9 {
    /**
     * 将之前 c/csatest/demo.txt 中的内容复制到 c/csatest2/demo2.txt 文件中
     * @param args
     */
    public static void main(String[] args) throws Exception{
        FileWriter fileWriter = new FileWriter("c://csatest2//demo2.txt");
        FileReader fileReader = new FileReader("c://csatest//demo.txt");

        //定义字符缓冲区
        char[] buf = new char[1024];

        int len = 0;
        while ((len=fileReader.read(buf))!=-1) {
            fileWriter.write(buf,0,len);
        }

        fileReader.close();
        fileWriter.close();

    }
}
