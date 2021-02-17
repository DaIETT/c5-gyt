package exer4;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Gyt
 * @create 2021-02-17-21:18
 */
public class Exer4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入：");
        String s = scanner.next();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), 0);
        }

//        System.out.println(hashMap);

        for (int i = 0; i < s.length(); i++) {

            hashMap.replace(s.charAt(i),hashMap.get(s.charAt(i)),hashMap.get(s.charAt(i)).intValue()+1);
        }

        System.out.println(hashMap);


    }
}
