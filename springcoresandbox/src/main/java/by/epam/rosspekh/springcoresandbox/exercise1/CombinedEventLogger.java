package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
public class CombinedEventLogger implements EventLogger {

    private List<EventLogger> loggers;

    public CombinedEventLogger(List<EventLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        loggers.forEach(eventLogger -> eventLogger.logEvent(event));
    }
}
