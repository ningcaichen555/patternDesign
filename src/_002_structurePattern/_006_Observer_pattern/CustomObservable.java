package _002_structurePattern._006_Observer_pattern;

import java.util.Observable;

/**
 * 〈这是自定义的被观察者〉<br>
 * 〈〉
 *
 * @author looks
 * @create 2020/10/18
 * @since 1.0.0
 */
public class CustomObservable extends Observable {
    public void setChange(){
        setChanged();
    }
}
