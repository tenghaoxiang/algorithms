/**
 * @author tenghaoxiang
 * @date 2019/8/1 下午12:05
 * @Description
 */
public class Test {

    /**
     * 饿汉式
     */
    private static final Test INSTANCE = new Test();

    public Test(){}

    public static Test getInstance() {
        return INSTANCE;
    }

    /**
     * 懒汉式--双重锁检查
     */
    private volatile static Test instance2;

    public static Test getInstance2() {
        if (instance2 == null) {
            synchronized (Test.class) {
                instance2 = new Test();
            }
        }

    }

}
