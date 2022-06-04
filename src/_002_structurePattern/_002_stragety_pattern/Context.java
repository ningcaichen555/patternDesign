package _002_structurePattern._002_stragety_pattern;

/**
 * 〈上下文类〉<br>
 * 〈〉
 *
 * @author looks
 * @create 2020/10/13
 * @since 1.0.0
 */
public class Context {
    private BaseStrategy baseStrategy;

    public void setBaseStrategy(BaseStrategy baseStrategy) {
        this.baseStrategy = baseStrategy;
    }

    public int calculateKm(int km) {
        return baseStrategy.calculate(km);
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setBaseStrategy(new SubwayStrategy());
        System.out.println(context.calculateKm(100) + "");
    }
}
