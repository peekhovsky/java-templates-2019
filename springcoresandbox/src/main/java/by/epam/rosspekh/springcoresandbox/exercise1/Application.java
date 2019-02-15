package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

public class Application {

    private Client client;

    private DateFormat dateFormat;

    private Map<Event.Type, EventLogger> loggers;

    public Application(Client client, DateFormat dateFormat, Map<Event.Type, EventLogger> loggers) {
        this.client = client;
        this.dateFormat = dateFormat;
        this.loggers = loggers;
    }


    private void logEvent(final String msg, Event.Type type) {
        var logger = loggers.get(type);
        var msgModified = msg.replaceAll(client.getId(), client.getFullName());
        logger.logEvent(new Event(new Date(), dateFormat, msgModified, type));
    }

    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("spring.xml");
        var application = (Application) ctx.getBean("application");

        application.logEvent("ROOOOOK 1", Event.Type.DEFAULT);
        application.logEvent("ROOOOOK 2", Event.Type.DEFAULT);
        application.logEvent("ROOOOOK 4", Event.Type.DEFAULT);
        application.logEvent("ROOOOOK 5", Event.Type.ERROR);
        application.logEvent("ROOOOOK 6", Event.Type.ERROR);
        application.logEvent("ROOOOOK 7", Event.Type.ERROR);
        application.logEvent("ROOOOOK 8", Event.Type.MESSAGE);
        application.logEvent("ROOOOOK 9", Event.Type.ERROR);
    }
}
