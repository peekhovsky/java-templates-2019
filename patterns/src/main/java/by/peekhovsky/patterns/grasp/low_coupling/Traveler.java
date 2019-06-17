package by.peekhovsky.patterns.grasp.low_coupling;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Traveler {

    private Vehicle vehicle;


    public void startJourney() {
        vehicle.move();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
