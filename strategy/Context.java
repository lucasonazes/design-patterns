package strategy;

public class Context {
    private iStrategy strategy;

    public Context(iStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(iStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}
