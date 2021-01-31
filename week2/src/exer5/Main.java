package exer5;

/**
 * @author Gyt
 * @create 2021-01-31-20:38
 */
public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey("猴子");
        People people = new People("人");

        monkey.speak();
        people.speak();
        people.think();
    }
}
