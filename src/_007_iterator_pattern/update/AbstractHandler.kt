package _007_iterator_pattern.update

/**
 * Created by liyan on 2020/10/11.
 */
abstract class AbstractHandler {
    protected var nextHandler: AbstractHandler? = null
    protected abstract fun handle(abstractRequest: AbstractRequest)
    protected abstract fun getHandleLeve(): Int
    final fun handleRequest(request: AbstractRequest) {
        if (request.leve == getHandleLeve()) {
            handle(request)
        } else {
            nextHandler?.handleRequest(request)
        }
    }
}