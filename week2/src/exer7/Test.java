package exer7;

/**
 * @author Gyt
 * @create 2021-01-31-21:17
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.setAge(2);
        duck.setName("鸭子");
        duck.setSymptom("发烧");
        duck.setIllness("感冒");

        duck.showMsg();
        duck.showSymptom();


    }
}
