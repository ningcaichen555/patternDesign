package _001_singleton;

/**
 * 饿汉模式
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return singleton;
    }
}
