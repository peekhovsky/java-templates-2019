package by.peekhovsky.patterns.abstract_factory.checkbox;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        log.info("You've created Mac os checkbox. ");
    }
}
