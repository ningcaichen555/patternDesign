package _001_createPattern._001_singleton;

/**
 * double check lock单例模式
 * volatile语义
 */
public class DCLSingleton {
    private DCLSingleton() {
    }

    private volatile static DCLSingleton singleton;

    public static DCLSingleton getInstance() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
