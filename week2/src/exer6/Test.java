package exer6;

/**
 * @author Gyt
 * @create 2021-01-31-20:46
 */
public class Test {
    public static void main(String[] args) {

        Car car = new Car(4, 50, 5);
        Truck truck = new Truck(4, 100, 3, 200);

        System.out.println(car.toString());
        car.load(2);
        System.out.println();
        System.out.println(truck.toString());
        truck.load(4,10000);
    }
}
