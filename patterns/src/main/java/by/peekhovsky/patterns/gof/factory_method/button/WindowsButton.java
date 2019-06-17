package by.peekhovsky.patterns.gof.factory_method.button;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class WindowsButton implements Button {

    @Override
    public void render() {
        log.info("Test windows button.");
    }

    @Override
    public void onClick() {
        log.info("Click windows button!");
    }
}
