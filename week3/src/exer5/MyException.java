package exer5;

/**
 * @author Gyt
 * @create 2021-02-17-21:29
 */
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "MyException{哈哈哈哈啊 人的年龄为负数了}";
    }
}
