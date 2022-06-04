package _004_visitor_pattern


/**
 * Created by liyan on 2021/5/7.
 */
interface Visitor {
    fun visit(manager: Manager)
    fun visit(engineer: Engineer)
}