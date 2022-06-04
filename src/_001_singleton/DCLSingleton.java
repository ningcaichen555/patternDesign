package _001_singleton;

/**
 * double check lock单例模式
 */
public class DCLSingleton {
    private DCLSingleton() {
    }

    private static DCLSingleton singleton;

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
