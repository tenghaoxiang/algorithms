/**
 * @author tenghaoxiang
 * @date 2019/7/31 下午4:04
 * @Description
 */
public class Singleton {

    /**
     * 基于类的初始化的解决方案
     */
    static class SingletonHolder1 {
        static Singleton instance = new Singleton();
    }

    public static Singleton getInstance1() {
        return SingletonHolder1.instance;
    }

    /**
     * 基于双重锁检查的解决方案
     */
    private volatile static Singleton instance;

    public static Singleton getInstance2() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    /**
     * 饿汉式
     */
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance3() {
        return INSTANCE;
    }

}
