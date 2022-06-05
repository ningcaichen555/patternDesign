package _001_createPattern._002_factory.sampleFactory;

/**
 * 简单工厂
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latter".equals(type)) {
            coffee = new LatterCoffee();
        } else {
            throw new RuntimeException("no coffee");
        }
        return coffee;
    }
}
