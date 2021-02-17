package exer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gyt
 * @create 2021-02-17-20:58
 */
public class Exer2Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();

        userList.add(new User(1,"Joe",70000,3));
        userList.add(new User(2,"Henry",80000,4));
        userList.add(new User(3,"Sam",60000,null));
        userList.add(new User(4,"Max",90000,null));

        for(User user : userList) {
            System.out.println(user);
        }

    }
}
