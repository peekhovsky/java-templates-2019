package by.epam.rosspekh.springcoresandbox.exercise1;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.util.Date;

@AllArgsConstructor
@Slf4j
public class Event {

    private Date date;

    private DateFormat dateFormat;

    private String message;

    private Type type = Type.DEFAULT;

    @Override
    public String toString() {
       return "Date: " + dateFormat.format(date) + ", msg: " + message;
    }

    public enum Type {
        ERROR,
        MESSAGE,
        DEFAULT
    }
}
