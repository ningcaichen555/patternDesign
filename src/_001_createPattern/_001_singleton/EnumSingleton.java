package _001_createPattern._001_singleton;

/**
 * 枚举创建单例，防止反序列化
 * 枚举类没有构造方法--所以不会被反序列化
 */
public enum EnumSingleton {
    INSTANCE;
}
