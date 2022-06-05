package _001_createPattern._002_factory.factory_before;

/**
 * 生产咖啡
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latter".equals(type)) {
            coffee = new LatterCoffee();
        } else {
            throw new RuntimeException("no coffee");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latter");
        System.out.println(coffee.getName());
    }
}
