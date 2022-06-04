package _007_iterator_pattern.update;


/**
 * Created by liyan on 2020/10/11.
 */
public class Client {
    public static void main(String[] args) {
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);
        handler3.setNextHandler(handler1);

        Request1 request1 = new Request1("request1");
        Request2 request2 = new Request2("request2");
        Request3 request3 = new Request3("request3");

        handler1.handleRequest(request2);
    }
}
