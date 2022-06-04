package _002_structurePattern._004_visitor_pattern

/**
 * Created by liyan on 2021/5/7.
 */
class CeoVisitor : Visitor {
    override fun visit(manager: Manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
    }

    override fun visit(engineer: Engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
    }

}