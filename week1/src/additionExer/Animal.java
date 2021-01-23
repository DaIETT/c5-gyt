package additionExer;

/**
 * @author Gyt
 * @create 2021-01-23-11:25
 */
public abstract class Animal {

    private double hight;
    private double weight;

    public void eat() {

    }

    public void sleep() {
        System.out.println("事实上我们睡觉都是一样的");
    }

    public Animal(double hight, double weight) {
        this.hight = hight;
        this.weight = weight;
    }


}
