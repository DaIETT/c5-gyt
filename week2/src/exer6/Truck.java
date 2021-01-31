package exer6;

/**
 * @author Gyt
 * @create 2021-01-31-20:44
 */
public class Truck extends Vehicle {
    private int loader;
    private int payload;

    public Truck(int wheels, double weight, int loader, int payload) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }

    public void load(int Trueload,int Ttuepayload){
        if(Trueload > loader)
            System.out.println("这是一辆卡车 能载"+loader+"人 实载"+Trueload+"人 超员了！！");
        else
            System.out.println("这是一辆卡车 能载"+loader+"人 实载"+Trueload+"人");
        if(Ttuepayload > payload)
            System.out.println("这是一辆卡车 核载"+payload+"kg 实载"+Ttuepayload+"kg 超载了！！");
        else
            System.out.println("这是一辆卡车 核载"+payload+"kg 实载"+Ttuepayload+"kg");


    }

    @Override
    public String toString() {
        return "车轮数是："+getWheels()+"  车重："+ weight;
    }
}
