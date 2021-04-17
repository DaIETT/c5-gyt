package exer3;

/**
 * @author Gyt
 * @create 2021-04-01 - 20:39
 */

import java.util.*;

/**
 * 给定一组单词words，编写一个程序，找出其中的最长单词，且该单词由这组单词中的
 * 其他单词组合而成。若有多个长度相同的结果，返回其中字典序最小的一项，若没有符
 * 合要求的单词则返回空字符串。
 * tnl~~~
 */
public class Exer3 {

    public static void main(String[] args) {

        String[] strings = {"cat","banana","dog","nana","walk","walker","dogwalker"};

        String s = longestWord(strings);

        System.out.println(s);
    }


    public static String longestWord(String[] words) {
        //按长度排序
        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length())
                return o1.compareTo(o2);
            else {
                return Integer.compare(o2.length(), o1.length());
            }
        });

        //set无重复
        Set<String> set = new HashSet<>(Arrays.asList(words));

        System.out.println(set);

        for (String word : words) {

            set.remove(word);

            //如果找到了 "当前最长 word 有所有子串" 就直接返回
            if (find(set, word))
                return word;
        }
        return "";
    }

    /**
     *  找到word是否有所有子串
     * @param set
     * @param word
     * @return
     */
    public static boolean find(Set<String> set, String word) {
        if (word.length() == 0)
            return true;
        for (int i = 0; i < word.length(); i++) {

            //递归的find
            // 这里的  i 是连续地找
            if (set.contains(word.substring(0, i + 1)) && find(set, word.substring(i + 1)))
                return true;
        }
        return false;
    }


}
