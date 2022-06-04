package _007_iterator_pattern.normal;


/**
 * Created by liyan on 2020/10/11.
 * 抽象处理者，声明一个处理请求的方法，同时保持一个对下一个处理节点handler的引用
 */
public abstract class Handler {
    public Handler successor;
    public abstract void handleRequest(AbstractRequest request);
}
