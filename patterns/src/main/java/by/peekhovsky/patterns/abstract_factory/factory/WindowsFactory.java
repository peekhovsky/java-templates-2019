package by.peekhovsky.patterns.abstract_factory.factory;

import by.peekhovsky.patterns.abstract_factory.button.Button;
import by.peekhovsky.patterns.abstract_factory.button.MacOSButton;
import by.peekhovsky.patterns.abstract_factory.button.WindowsButton;
import by.peekhovsky.patterns.abstract_factory.checkbox.Checkbox;
import by.peekhovsky.patterns.abstract_factory.checkbox.MacOSCheckbox;
import by.peekhovsky.patterns.abstract_factory.checkbox.WindowsCheckbox;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class WindowsFactory implements Factory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
