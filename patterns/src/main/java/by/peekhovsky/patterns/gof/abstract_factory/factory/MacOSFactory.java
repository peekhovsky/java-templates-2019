package by.peekhovsky.patterns.gof.abstract_factory.factory;

import by.peekhovsky.patterns.gof.abstract_factory.button.Button;
import by.peekhovsky.patterns.gof.abstract_factory.button.MacOSButton;
import by.peekhovsky.patterns.gof.abstract_factory.checkbox.Checkbox;
import by.peekhovsky.patterns.gof.abstract_factory.checkbox.MacOSCheckbox;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MacOSFactory implements Factory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
