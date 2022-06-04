package _002_structurePattern._002_stragety_pattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author looks
 * @create 2020/10/13
 * @since 1.0.0
 */
public class SubwayStrategy implements BaseStrategy {
    @Override
    public int calculate(int km) {
        return 20;
    }
}
