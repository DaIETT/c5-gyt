package additionExer;

/**
 * @author Gyt
 * @create 2021-01-23-11:30
 */
public class animalTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(100, 299);
        Rabbit rabbit = new Rabbit(20, 40);

        tiger.sleep();
        rabbit.sleep();
        tiger.eat();
        rabbit.eat();

    }
}
