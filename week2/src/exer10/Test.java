package exer10;

/**
 * @author Gyt
 * @create 2021-01-31-21:37
 */
public class Test {
    public static void main(String[] args) {
        PC pc = new PC();
        pc.add(new Mouse());
        pc.add(new Keyboard());
        pc.add(new Microphone());
        pc.powerOn();
        System.out.println();
        pc.powerOff();
    }
}
