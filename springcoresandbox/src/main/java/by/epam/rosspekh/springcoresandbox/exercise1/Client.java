package by.epam.rosspekh.springcoresandbox.exercise1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@Slf4j
public class Client {
    private String id;
    private String fullName;
}
