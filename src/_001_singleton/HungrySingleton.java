package _001_singleton;

/**
 * 饿汉模式
 * 类加载到内存后，静态变量进行初始化。
 * 类加载机制保证线程安全
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
