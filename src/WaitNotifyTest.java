/**
 * @author tenghaoxiang
 * @date 2019/8/11 上午12:08
 * @Description 通过此实验验证了在线程调用wait()方法后，被notifyAll()唤醒，但没有获得锁的情况下会变成Blocked状态。
 */
public class WaitNotifyTest {

    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(()->{
            synchronized (lock) {
                try {
                    Thread.sleep(20000);
                    lock.wait();
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "thread1").start();

        new Thread(()->{
            try {
                Thread.sleep(30000);
                synchronized (lock) {
                    Thread.sleep(20000);
                    lock.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "thread2").start();

        new Thread(() -> {
            try {
                Thread.sleep(10000);
                synchronized (lock) {
                    Thread.sleep(20000);
                    lock.wait();
                    Thread.sleep(30000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread3").start();

    }

}
