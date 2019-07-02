package CH02_Interfaces;

public interface InterfaceDemo {

    private void sayCheese1() {
        System.out.println("Mascarpone cheese is often used in Italian deserts.");
    }

    private void sayCheese2() {
        System.out.println("Ricotta cheese is great in lasagna.");
    }

    private void sayCheese3() {
        System.out.println("Italian Mozzarella is said to be America's most popular cheese.");
    }

    default void sayCheese() {
        sayCheese1();
        sayCheese2();
        sayCheese3();
    }
}
