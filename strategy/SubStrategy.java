package strategy;

public class SubStrategy implements iStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
