package by.peekhovsky.patterns.factory_method.dialog;


import by.peekhovsky.patterns.factory_method.button.Button;
import by.peekhovsky.patterns.factory_method.button.HtmlButton;


public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}