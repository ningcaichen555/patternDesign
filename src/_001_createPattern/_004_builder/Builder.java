package _001_createPattern._004_builder;

public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void builderFrame();

    public abstract void builderSeat();

    public abstract Bike createBike();
}
