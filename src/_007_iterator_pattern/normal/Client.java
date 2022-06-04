package _007_iterator_pattern.normal;


/**
 * Created by liyan on 2020/10/11.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.successor = concreteHandler2;
        concreteHandler2.successor = concreteHandler1;

        Request request = new Request();
        request.name = "ConcreteHandler2";

        concreteHandler1.handleRequest(request);

    }
}
