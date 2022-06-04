package _002_structurePattern._007_iterator_pattern.update

/**
 * Created by liyan on 2020/10/11.
 */
class Handler3 : AbstractHandler(){
    override fun handle(abstractRequest: AbstractRequest) {
        System.out.print("Handler3 handle")
    }

    override fun getHandleLeve(): Int {
        return 3
    }

}