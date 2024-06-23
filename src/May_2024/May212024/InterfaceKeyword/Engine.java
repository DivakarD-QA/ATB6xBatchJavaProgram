package May_2024.May212024.InterfaceKeyword;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart(){
        System.out.println("Halt the Engine and Start");
    }
    default void haltingEngineJustStop(){
        System.out.println("Halt the Engine then Stop");
    }
    static void M1(){
        System.out.println("M1");
    }
}
