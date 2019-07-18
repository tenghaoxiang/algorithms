import java.util.HashMap;

public class HashMapTest {

    static volatile  HashMap<Integer,Integer> map = new HashMap<>();


    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 13; i++) {
                map.put(i,i);
            }
        });
        Thread thread2 = new Thread(()->{
            try {
                Thread.sleep(1000*60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(map.get(9));
        });

        thread2.start();
        Thread.sleep(1000);
        thread1.start();
        Thread.sleep(1000*60);

    }

}
