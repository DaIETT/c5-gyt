package exer8;

/**
 * @author Gyt
 * @create 2021-01-31-21:20
 */
public class C extends B {
    int numc = 30;

    public void showA() {
        System.out.println("numa = "+ numa);
    }

    @Override
    public void showB() {
        System.out.println("numb = "+ numb);

    }

    public void showC() {
        System.out.println("numc = "+ numc);
    }
}
