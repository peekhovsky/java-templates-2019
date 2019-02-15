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

    public Application(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void logEvent(final String msg) {
        String msgModified = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(new Event(new Date(), dateFormat, msgModified));
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        Application application  = (Application) ctx.getBean("application");

        application.logEvent("ROOOOOK 1");
        application.logEvent("ROOOOOK 2");
    }
}
