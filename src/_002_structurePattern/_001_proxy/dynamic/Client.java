package _002_structurePattern._001_proxy.dynamic;

import _002_structurePattern._001_proxy.SellTicket;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket sellTicket = proxyFactory.create();
        sellTicket.sell();
    }
}
