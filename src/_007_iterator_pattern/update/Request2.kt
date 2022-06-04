package _007_iterator_pattern.update

/**
 * Created by liyan on 2020/10/11.
 */
class Request2(obj: Object) : AbstractRequest(obj) {
    override fun getLeve(): Int {
        return 2;
    }
}