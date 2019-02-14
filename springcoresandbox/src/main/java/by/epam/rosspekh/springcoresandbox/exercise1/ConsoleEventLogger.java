package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConsoleEventLogger {
    public void logEvent(final String msg) {
        log.debug(msg);
    }
}
