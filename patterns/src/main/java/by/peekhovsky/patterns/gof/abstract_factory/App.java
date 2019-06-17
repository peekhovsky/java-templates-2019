package by.peekhovsky.patterns.gof.abstract_factory;

import by.peekhovsky.patterns.gof.abstract_factory.button.Button;
import by.peekhovsky.patterns.gof.abstract_factory.checkbox.Checkbox;
import by.peekhovsky.patterns.gof.abstract_factory.factory.Factory;
import by.peekhovsky.patterns.gof.abstract_factory.factory.MacOSFactory;
import by.peekhovsky.patterns.gof.abstract_factory.factory.WindowsFactory;
import lombok.extern.slf4j.Slf4j;


/**
 * Abstract Factory is a creational design pattern, which solves
 * the problem of creating entire product
 * families without specifying their concrete classes.
 *
 */
@Slf4j
@SuppressWarnings("WeakerAccess")
public class App {

    private Button button;

    private Checkbox checkbox;


    public App(Factory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    private static App configureApplication() {
        App app;
        Factory factory;
        String osName = System.getProperty("os.name");
        if (osName.contains("Mac OS X")) {
            factory = new MacOSFactory();
            app = new App(factory);
        } else {
            factory = new WindowsFactory();
            app = new App(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
