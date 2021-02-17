package exer5;

/**
 * @author Gyt
 * @create 2021-02-17-21:33
 */
public class Test {
    public static void main(String[] args) throws MyException {
        new Person().setAge(-1);
    }
}

class Person {
    private int age;

    public void setAge(int age) throws MyException {

        if (age < 0) {
            throw new MyException();
        }
        this.age = age;
    }


}
