package exer11;

/**
 * @author Gyt
 * @create 2021-02-22-10:57
 */
public class Exer11 {
    public static void main(String[] args) {
        //info可以理解成仓库  并且只能 存一次
        Info info = new Info();
        //创建线程对象
        Thread threadPro = new Thread(new Producer(info));
        Thread threadCus = new Thread(new Customer(info));

        threadPro.start();
        threadCus.start();
    }


}

class Info {
    private String title;
    private String content;

    private boolean flag = true; // true 表示可以生产 不能取走 反之

    public Info() {
    }

    public synchronized void set(String title, String content) {

        if (flag == false) {
            //需要等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title = title;
        //模拟 生产时间
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;

        //生产完成后 修改标记
        flag = false;
        //唤醒消费线程
        this.notify();

    }

    public synchronized void get() {

       if (flag == true) {
           // 不能取货
           try {
               this.wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我今天要买的手机是" + this.title + ": " + this.content);

        flag=true;
        this.notify();

    }
}


/**
 * 生产者
 */
class Producer implements Runnable {
    private Info info;


    public Producer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 0) {
                info.set("Iphone12 mini", "全球最小5G手机");

            } else {
                info.set("Samsung Galaxy fold 2", "目前最完善折叠屏手机");

            }
        }
    }
}

/**
 * 消费者
 */
class Customer implements Runnable {

    private Info info;

    public Customer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            this.info.get();
        }
    }
}
