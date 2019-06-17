package by.peekhovsky.patterns.grasp.low_coupling;


public class App {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setVehicle(new Car());
        traveler.startJourney();
        traveler.setVehicle(new Bike());
        traveler.startJourney();
    }
}
