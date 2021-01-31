package exer7;

/**
 * @author Gyt
 * @create 2021-01-31-21:14
 */
public class Duck extends Poultry {
    @Override
    public void showSymptom() {
        System.out.println("入院原因："+getIllness());
        System.out.println("症状："+getSymptom());
    }
}
