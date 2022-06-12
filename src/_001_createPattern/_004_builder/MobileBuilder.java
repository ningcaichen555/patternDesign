package _001_createPattern._004_builder;

public class MobileBuilder extends Builder {
    @Override
    public void builderFrame() {
        bike.setFrame("碳纤维");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("真皮");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
