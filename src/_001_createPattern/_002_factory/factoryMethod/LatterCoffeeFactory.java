package _001_createPattern._002_factory.factoryMethod;

/**
 * 生产拉铁工厂
 */
public class LatterCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }
}
