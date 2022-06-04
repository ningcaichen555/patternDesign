package _002_structurePattern._007_iterator_pattern.normal


/**
 * Created by liyan on 2020/10/11.
 */
class ConcreteHandler2 : Handler() {
    override fun handleRequest(request: AbstractRequest) {
        if (request.name == "ConcreteHandler2") {
            System.out.print("ConcreteHandler2 handle")
        } else {
            successor.handleRequest(request)
        }
    }
}