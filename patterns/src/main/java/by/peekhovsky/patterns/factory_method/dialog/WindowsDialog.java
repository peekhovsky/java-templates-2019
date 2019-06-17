package by.peekhovsky.patterns.factory_method.dialog;


import by.peekhovsky.patterns.factory_method.button.Button;
import by.peekhovsky.patterns.factory_method.button.WindowsButton;


public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}