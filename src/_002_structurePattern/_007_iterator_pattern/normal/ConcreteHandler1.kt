package _002_structurePattern._007_iterator_pattern.normal



/**
 * Created by liyan on 2020/10/11.
 * 具体的处理者角色，对请求进行处理，如果不能处理则传递给下个处理者
 */
class ConcreteHandler1 : Handler() {
    override fun handleRequest(request: AbstractRequest) {
        if (request.name == "ConcreteHandler1") {
            print("ConcreteHandler1 handle")
        } else {
            successor.handleRequest(request)
        }
    }

}