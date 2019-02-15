package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Application {

    private Client client;

    private EventLogger eventLogger;

    private DateFormat dateFormat;

    public void logEvent(final String msg) {
        var msgModified = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(new Event(new Date(), dateFormat, msgModified));
    }

    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("spring.xml");
        var application  = (Application) ctx.getBean("application");

        application.logEvent("ROOOOOK 1");
        application.logEvent("ROOOOOK 2");
        application.logEvent("ROOOOOK 4");
        application.logEvent("ROOOOOK 5");
        application.logEvent("ROOOOOK 6");
        application.logEvent("ROOOOOK 7");
        application.logEvent("ROOOOOK 8");
        application.logEvent("ROOOOOK 9");
    }
}
