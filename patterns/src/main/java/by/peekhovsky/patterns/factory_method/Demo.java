package by.peekhovsky.patterns.factory_method;


import by.peekhovsky.patterns.factory_method.dialog.Dialog;
import by.peekhovsky.patterns.factory_method.dialog.HtmlDialog;
import by.peekhovsky.patterns.factory_method.dialog.WindowsDialog;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runLogic() {
        dialog.renderWindow();
    }
}
