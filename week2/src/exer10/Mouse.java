package exer10;

/**
 * @author Gyt
 * @create 2021-01-31-21:31
 */
public class Mouse implements USB {
    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
