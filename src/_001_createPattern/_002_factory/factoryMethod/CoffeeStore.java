package _001_createPattern._002_factory.factoryMethod;


/**
 * 工厂方法生产咖啡
 */
public class CoffeeStore {
    private CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        return coffeeFactory.createCoffee();
    }

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
