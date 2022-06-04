package _001_singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton singleton;

    public synchronized static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
