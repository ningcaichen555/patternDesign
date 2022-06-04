package _001_singleton;

/**
 * 懒汉模式
 * 保证线程安全--->需要增加synchronized对类进行加---造成效率降低
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
