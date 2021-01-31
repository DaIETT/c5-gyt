package exer10;

/**
 * @author Gyt
 * @create 2021-01-31-21:32
 */
public class Keyboard implements USB {
    @Override
    public void turnOn() {
        System.out.println("键盘启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了");
    }
}
