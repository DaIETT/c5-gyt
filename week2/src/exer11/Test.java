package exer11;

/**
 * @author Gyt
 * @create 2021-01-31-21:43
 */
public class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.addCat(new Cat("猫猫1",2));
        shop.addCat(new Cat("猫猫2",1));
        shop.addCat(new Cat("猫猫3",5));
        shop.addCat(new Cat("猫猫4",3));

        shop.addDog(new Dog("GAGA",2));
        shop.addDog(new Dog("QQ",1));

        shop.showLeft();

        shop.sellCat();
        shop.sellCat();
        shop.sellDog();

        shop.showLeft();
    }
}
