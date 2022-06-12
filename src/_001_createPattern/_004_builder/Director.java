package _001_createPattern._004_builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike contractBike() {
        builder.builderFrame();
        builder.builderSeat();
        return builder.createBike();
    }

    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.contractBike();
        System.out.println(bike.getFrame());
    }
}
