package exer9;

/**
 * @author Gyt
 * @create 2021-01-31-21:26
 */
public class Sun extends Star implements Universe {
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
    }
    public void shine() {
        System.out.println("sun:光照八分钟，到达地球");
    }

}
