package May_2024.May212024.Abstract.CarEx;

public class Car extends Engine{

    @Override
    void start() {
        System.out.println(" Start Engine");
    }

    @Override
    void stop() {
        System.out.println(" Stop Engine");
    }

    @Override
    void partGear() {
        System.out.println(" Put the Gear");
    }

    @Override
    void openCar() {
        System.out.println("Open the car");
    }
}
