package by.peekhovsky.patterns.gof.abstract_factory.factory;

import by.peekhovsky.patterns.gof.abstract_factory.button.Button;
import by.peekhovsky.patterns.gof.abstract_factory.checkbox.Checkbox;


public interface Factory {
    Button createButton();
    Checkbox createCheckbox();
}
