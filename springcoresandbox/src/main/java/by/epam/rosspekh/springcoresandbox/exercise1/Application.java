package by.epam.rosspekh.springcoresandbox.exercise1;

public class Application {

    private Client client;

    private ConsoleEventLogger eventLogger = new ConsoleEventLogger();

    public void logEvent(final String msg) {
        String msgModified = msg.replaceAll(
                client.getId(), client.getFullName());
        eventLogger.logEvent(msgModified);

    }

    public static void main(String[] args) {
        Application application = new Application();
        application.client = new Client("1", "Rock Roll");
        application.logEvent("Event user 1");

    }
}
