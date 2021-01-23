package week1.exercise6;

/**
 * @author Gyt
 * @create 2021-01-23-0:05
 */
public class BankAccount {
    String name;
    double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void query(){
        System.out.println("该账户余额为："+balance);
    }

    public static void main(String[] args){
        BankAccount a = new BankAccount("A", 1000);
        BankAccount b = new BankAccount("B", 230);
        BankAccount c = new BankAccount("C", 450);

        a.query();
    }
}
