package _006_Observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * 〈这是自定义的观察者〉<br>
 * 〈〉
 *
 * @author looks
 * @create 2020/10/18
 * @since 1.0.0
 */
public class CustomObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我更新了");
    }
}
