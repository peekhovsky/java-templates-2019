package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(final Event event) {
        log.debug(event.toString());
    }
}
