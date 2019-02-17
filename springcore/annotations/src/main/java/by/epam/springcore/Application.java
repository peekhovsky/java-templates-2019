package by.epam.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("spring.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();

    }
}
