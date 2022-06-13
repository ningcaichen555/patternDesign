package _002_structurePattern._001_proxy.dynamic;

import _002_structurePattern._001_proxy.SellTicket;
import _002_structurePattern._001_proxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 */
public class ProxyFactory {
    /**
     * 目标对象
     */
    private TrainStation trainStation = new TrainStation();

    public SellTicket create() {
        SellTicket sellTicket = (SellTicket) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("代理方法增强执行");
                return method.invoke(trainStation, objects);
            }
        });
        return sellTicket;
    }
}
