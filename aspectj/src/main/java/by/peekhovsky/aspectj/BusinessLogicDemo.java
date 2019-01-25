package by.peekhovsky.aspectj;


@SuppressWarnings("WeakerAccess")
public class BusinessLogicDemo {

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void greeting()  {
        String name = "John";

        sayHello();

        System.out.print(name);
    }


    public static void main(String[] args) {

        sayHello();

        System.out.println("--------");

        sayHello();

        System.out.println("--------");

        greeting();


    }

}
