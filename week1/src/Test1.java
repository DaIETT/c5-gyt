import org.junit.Test;

import java.util.*;

/**
 * @author Dale
 * @create 2021-01-21-21:44
 */
public class Test1 {

    @Test
    public void Test(){

        System.out.println("Hello");

    }

@Test
    public void Test2(){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Dale",1000);
        map.put("Shally",20);
        map.put("Tom",5);
        map.put("GGG",9999);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

            String name = next.getKey();
            Integer score = next.getValue();

            System.out.println(name+"*****"+score);

        }

    System.out.println(map.get("Dale"));
    }

@Test
    public void Test3(){
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student(1000,"Dale"));
        treeSet.add(new Student(49,"Shally"));
        treeSet.add(new Student(100,"HHH"));
        treeSet.add(new Student(30,"A"));
        treeSet.add(new Student(90,"HUAWEI"));
        treeSet.add(new Student(10000,"GG"));

        Iterator<Student> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();

            System.out.println(student);
        }

    }
}

class Student implements Comparable<Student>{

    private String name;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student() {
    }

    public Student(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Student student) {
        if (this.score>=student.score)
            return 1;
        else
            return -1;
    }
}