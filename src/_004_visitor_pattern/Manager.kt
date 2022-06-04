package _004_visitor_pattern

import java.util.*

/**
 * Created by liyan on 2021/5/7.
 */
class Manager(val mName: String) : Staff(mName) {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    fun getProducts(): Int {
        return Random().nextInt()
    }
}