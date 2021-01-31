package exer11;

/**
 * @author Gyt
 * @create 2021-01-31-21:42
 */
public class Cat implements pet {
    private int age;
    private String name;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
