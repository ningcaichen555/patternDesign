package _002_structurePattern._006_Observer_pattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈观察者模式Cilent类〉
 *
 * @author looks
 * @create 2020/10/18
 * @since 1.0.0
 */
public class Cilent {
    public static void main(String[] args) {
        CustomObservable customObservable = new CustomObservable();

        CustomObserver customObserver  =new CustomObserver();

        customObservable.addObserver(customObserver);

        customObservable.setChange();
        customObservable.notifyObservers("");
    }
}
