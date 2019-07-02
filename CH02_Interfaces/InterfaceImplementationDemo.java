package CH02_Interfaces;

public class InterfaceImplementationDemo implements InterfaceDemo {

    public static void main(String[] args) {

        // create instance of class
        InterfaceDemo myCheese = new InterfaceImplementationDemo();

        // print decorative header
        System.out.println("\nCheesy Information");

        // call methods
        myCheese.sayCheese();
    }
}
