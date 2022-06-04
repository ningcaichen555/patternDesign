package _002_structurePattern._007_iterator_pattern.update;


/**
 * Created by liyan on 2020/10/11.
 */
public abstract class AbstractRequest {

    public AbstractRequest(Object object) {
        this.object = object;
    }

    protected abstract int getLeve();

    private Object object;

    public Object getContent() {
        return object;
    }
}
