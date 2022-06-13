package _002_structurePattern._001_proxy;

/**
 * 作为中介类，访问真实对象
 */
public class ProxyPoint implements SellTicket {
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        trainStation.sell();
    }
}
