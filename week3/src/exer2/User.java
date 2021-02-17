package exer2;

/**
 * @author Gyt
 * @create 2021-02-17-20:59
 */
public class User {
    private Integer id;
    private String name;
    private Integer salary;
    private Integer ManagerId;

    public User() {
    }

    public User(Integer id, String name, Integer salary, Integer managerId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        ManagerId = managerId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", ManagerId=" + ManagerId +
                '}';
    }
}
