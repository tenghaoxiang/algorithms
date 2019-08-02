package Singleton;

/**
 * @author tenghaoxiang
 * @date 2019/8/1 下午7:00
 * @Description
 */
public class Singleton {

    /**
     * 基于类初始化
     */
//    static class SingletonHolder{
//        static Singleton instance = new Singleton();
//    }
//
//    public Singleton getInstance() {
//        return SingletonHolder.instance;
//    }

    /**
     * 基于双重锁检查
     */
//    private static volatile Singleton instance;
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * 饿汉式
     */
    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
