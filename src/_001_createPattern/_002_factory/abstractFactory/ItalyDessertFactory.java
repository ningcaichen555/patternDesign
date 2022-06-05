package _001_createPattern._002_factory.abstractFactory;

/**
 * 意大利风味的工厂
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatterCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new TiramisuDessert();
    }
}
