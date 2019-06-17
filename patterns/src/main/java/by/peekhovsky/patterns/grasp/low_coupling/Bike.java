package by.peekhovsky.patterns.grasp.low_coupling;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Bike implements Vehicle {

    @Override
    public void move() {
        log.info("Bike is moving");
    }
}
