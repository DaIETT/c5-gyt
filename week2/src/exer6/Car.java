package exer6;

/**
 * @author Gyt
 * @create 2021-01-31-20:43
 */
public class Car extends Vehicle{
    private int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public void load(int Trueload){
        if(Trueload > loader)
            System.out.println("这是一辆小车 能载"+loader+"人 实载"+Trueload+"人 超员了！！");
        else
            System.out.println("这是一辆小车 能载"+loader+"人 实载"+Trueload+"人");
    }


    @Override
    public String toString() {
        return "车轮数是："+getWheels()+"  车重："+ weight;
    }
}
