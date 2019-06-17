package by.peekhovsky.patterns.gof.abstract_factory.button;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MacOSButton implements Button {

    @Override
    public void paint() {
        log.info("You've created Mac os button. ");
    }
}
