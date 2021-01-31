package exer10;

/**
 * @author Gyt
 * @create 2021-01-31-21:32
 */
public class Microphone implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
