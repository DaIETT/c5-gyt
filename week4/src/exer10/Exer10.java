package exer10;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Gyt
 * @create 2021-02-21-21:55
 */
public class Exer10 {
    static int num = 0;

    //定义锁
    static final Object lock = new Object();


    public static void main(String[] args) {
        Thread a = new Thread(new Print(), "线程A打印：");
        Thread b = new Thread(new Print(), "线程B打印：");

        a.start();
        b.start();

    }

    /**
     * 1. 拿到锁就直接打印
     * 2. 打印完, 唤醒另外一个线程后,自己就调用wait进入等待状态
     */
    static class Print implements Runnable {

        @Override
        public void run() {
            while (num <= 10) {
                //拿到锁
                synchronized (lock) {
                    //打印
                    System.out.println(Thread.currentThread().getName() + num++);
                    //打印一次 后唤醒另一个线程 此时另一个线程任然进不来 有锁
                    lock.notify();
                    try {

                        //wait()使当前线程阻塞 会释放当前的锁
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
        }
    }

}

