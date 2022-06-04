package _001_createPattern._001_singleton;

/**
 * 内部类实现单例
 * class.forName 类加载时候不会创建内部类
 * 只有调用getInstance时候才会创建内部类
 * 内部类只有在使用的时候才会创建--->JVM类加载保证线程安全
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        public static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }
}
