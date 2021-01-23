package week1.exercise7;

/**
 * @author Gyt
 * @create 2021-01-23-11:06
 */
public class Complex {

    private double x; //实部
    private double y; //虚部

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Complex add(Complex B) {
        return new Complex(x + B.x, y + B.y);
    }

    public Complex reduce(Complex B) {

        return new Complex(x - B.x, y - B.y);
    }

    public Complex multiply(Complex B) {

        return new Complex(x * B.x - y * B.y, x * B.y + y * B.x);
    }

    @Override
    public String toString() {
        return "complex{" +
                "实部=" + x +
                ", 虚部=" + y +
                '}';
    }

    public static void main(String[] args) {
        Complex complex = new Complex(2, 3);
        Complex complex1 = new Complex(1, 2);

        System.out.printf("相加后的结果：%.2f+%.2fi\n",complex.add(complex1).getX(),complex.add(complex1).getY());

        System.out.printf("相减后的结果：%.2f+%.2fi\n",complex.reduce(complex1).getX(),complex.reduce(complex1).getY());

        System.out.printf("相乘后的结果：%.2f+%.2fi\n",complex.multiply(complex1).getX(),complex.multiply(complex1).getY());

    }

}
