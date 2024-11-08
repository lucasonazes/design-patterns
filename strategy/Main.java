package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new SubStrategy());
        System.out.println(context.executeStrategy(10, 8));
        context.setStrategy(new AddStrategy());
        System.out.println(context.executeStrategy(10, 8));
    }
}
