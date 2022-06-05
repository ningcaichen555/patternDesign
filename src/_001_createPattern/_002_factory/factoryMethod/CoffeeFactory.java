package _001_createPattern._002_factory.factoryMethod;

/**
 * 抽象工厂角色
 */
public interface CoffeeFactory {
    /**
     * 创建咖啡的方法
     *
     * @return
     */
    Coffee createCoffee();
}
