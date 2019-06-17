package by.peekhovsky.patterns.gof.factory_method.dialog;


import by.peekhovsky.patterns.gof.factory_method.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
