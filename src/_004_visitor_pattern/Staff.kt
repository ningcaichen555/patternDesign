package _004_visitor_pattern

import java.util.*

/**
 * Created by liyan on 2021/5/7.
 * 员工基类
 */
abstract class Staff(val name: String) {
    val kpi = Random().nextInt()

    abstract fun accept(visitor: Visitor)
}