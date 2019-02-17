package by.epam.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        var context = new ClassPathXmlApplicationContext("spring.xml");
        while (true) {
            TimeUnit.SECONDS.sleep(1);
            context.getBean(Quoter.class).sayQuote();
        }
    }
}
