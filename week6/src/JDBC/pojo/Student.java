package JDBC.pojo;

/**
 * @author Gyt
 * @create 2021-03-17-8:44
 */
public class Student {
    private String SNO;
    private String Name;
    private String college;
    private int age;

    public Student() {
    }

    public Student(String SNO, String name, String college, int age) {
        this.SNO = SNO;
        Name = name;
        this.college = college;
        this.age = age;
    }

    public String getSNO() {
        return SNO;
    }

    public void setSNO(String SNO) {
        this.SNO = SNO;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return (SNO+","+Name+","+age+","+college);
    }
}
