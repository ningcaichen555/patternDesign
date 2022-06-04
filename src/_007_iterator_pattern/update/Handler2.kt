package _007_iterator_pattern.update

/**
 * Created by liyan on 2020/10/11.
 */
class Handler2 : AbstractHandler(){
    override fun handle(abstractRequest: AbstractRequest) {
        System.out.print("Handler2 handle")
    }

    override fun getHandleLeve(): Int {
        return 2
    }

}