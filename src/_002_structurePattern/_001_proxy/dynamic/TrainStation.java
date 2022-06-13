package _002_structurePattern._001_proxy.dynamic;

import _002_structurePattern._001_proxy.SellTicket;

public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
