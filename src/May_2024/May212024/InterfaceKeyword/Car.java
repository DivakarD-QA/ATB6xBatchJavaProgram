package May_2024.May212024.InterfaceKeyword;

public class Car implements Brake,Engine{
    @Override
    public void applyBrake() {
        System.out.println("Applying Brake");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");
    }
}
