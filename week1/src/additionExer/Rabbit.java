package additionExer;

/**
 * @author Gyt
 * @create 2021-01-23-11:29
 */
public class Rabbit extends Animal{
    public Rabbit(double hight, double weight) {
        super(hight, weight);
    }

    public void eat() {
        System.out.println("我兔子只吃草，甚至要小心老虎吃我呢！！");
    }

}
