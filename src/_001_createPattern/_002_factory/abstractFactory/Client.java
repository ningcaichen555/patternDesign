package _001_createPattern._002_factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();

        Coffee coffee = italyDessertFactory.createCoffee();
        coffee.addMilk();
        System.out.println(coffee.getName());

        Dessert dessert = italyDessertFactory.createDessert();
        dessert.show();
    }
}
