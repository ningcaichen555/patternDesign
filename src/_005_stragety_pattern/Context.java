package _005_stragety_pattern;

/**
 * 〈上下文类〉<br>
 * 〈〉
 *
 * @author looks
 * @create 2020/10/13
 * @since 1.0.0
 */
public class Context {
    private BaseStragety baseStragety;

    public void setBaseStragety(BaseStragety baseStragety) {
        this.baseStragety = baseStragety;
    }

    public int calculateKm(int km) {
        return baseStragety.calculate(km);
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setBaseStragety(new SubwayStragety());
        System.out.println(context.calculateKm(100) + "");
    }
}
