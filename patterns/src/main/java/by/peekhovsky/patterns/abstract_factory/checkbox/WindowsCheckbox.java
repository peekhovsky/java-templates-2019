package by.peekhovsky.patterns.abstract_factory.checkbox;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        log.info("You've created Windows checkbox. ");
    }
}
