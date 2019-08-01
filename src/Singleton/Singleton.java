package Singleton;

/**
 * @author tenghaoxiang
 * @date 2019/8/1 下午7:00
 * @Description
 */
public class Singleton {

    static class SingletonHolder {
        static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

}
