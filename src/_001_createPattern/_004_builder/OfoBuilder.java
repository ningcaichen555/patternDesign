package _001_createPattern._004_builder;

public class OfoBuilder extends Builder {
    @Override
    public void builderFrame() {
        bike.setFrame("ofo框架");
    }

    @Override
    public void builderSeat() {
        bike.setSeat("ofo座椅");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
