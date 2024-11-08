package strategy;

public class AddStrategy implements iStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
