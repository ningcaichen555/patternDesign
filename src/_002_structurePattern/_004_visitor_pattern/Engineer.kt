package _002_structurePattern._004_visitor_pattern

import java.util.*

/**
 * Created by liyan on 2021/5/7.
 */
class Engineer(val eName: String) : Staff(eName) {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    fun getCodeLines(): Int {
        return Random().nextInt()
    }
}