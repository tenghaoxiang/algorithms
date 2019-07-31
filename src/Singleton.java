/**
 * @author tenghaoxiang
 * @date 2019/7/31 下午4:04
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
