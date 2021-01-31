package exer11;

/**
 * @author Gyt
 * @create 2021-01-31-21:42
 */

import exer8.C;

import java.util.ArrayList;
import java.util.List;

/**
 * 商店用于存储 动物
 * 实现进货动物
 * 卖动物
 */
public class Shop {
    //用到了集合 用于存放动物(用泛型来限制)
    private List<Cat> listCat = new ArrayList<Cat>();
    private List<Dog> listDog = new ArrayList<Dog>();


    //实现进货
    public void addCat(Cat cat) {
        listCat.add(cat);
        System.out.println("(猫猫)动物进库");
    }

    public void addDog(Dog dog) {
        listDog.add(dog);
        System.out.println("(狗狗)动物进库");
    }

    //卖动物
    public void sellCat() {
        listCat.remove(listCat.size() - 1);
        System.out.println("卖出去 一只猫");
    }

    public void sellDog() {
        listDog.remove(listDog.size() - 1);
    }

    public void showLeft() {
        System.out.println("查看库存：");
        System.out.println("还有" + listCat.size() + "只猫");
        for (int i = 0; i < listCat.size(); i++) {
            System.out.println("name = " + listCat.get(i).getName()+" age = "+listCat.get(i).getAge());
        }
        System.out.println();
        System.out.println("还有" + listDog.size() + "只狗");
        for (int i = 0; i < listDog.size(); i++) {
            System.out.println("name = " + listDog.get(i).getName()+" age = "+listDog.get(i).getAge());
        }
        System.out.println();
    }
}
