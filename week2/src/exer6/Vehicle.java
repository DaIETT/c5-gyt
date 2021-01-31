package exer6;

/**
 * @author Gyt
 * @create 2021-01-31-20:43
 */
public abstract class Vehicle {
    int wheels;
    double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }
}
