package _002_structurePattern._001_proxy;

public class Client {
    public static void main(String[] args) {
        SellTicket sellTicket = new ProxyPoint();
        sellTicket.sell();
    }
}
