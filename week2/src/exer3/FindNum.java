package exer3;

import org.junit.Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Gyt
 * @create 2021-01-31-22:05
 */
public class FindNum {
    @Test
    public void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = scanner.next();

        //采用正则表达式：
        String patt="[^0-9]";
        Pattern p = Pattern.compile(patt);
        Matcher m = p.matcher(str);

        System.out.println("字符串中的数字有：");
        System.out.println("["+m.replaceAll(" ").trim()+"]");

    }
}
