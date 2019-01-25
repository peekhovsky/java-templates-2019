package by.peekhovsky.aspectj;

public aspect BusinessLogic {

    pointcut callSayHello(): call(* BusinessLogicDemo.sayHello());

    before(): callSayHello() {
        System.out.println("Before call sayHello");
    }

    after(): callSayHello()  {
        System.out.println("After call sayHello");
    }
}
