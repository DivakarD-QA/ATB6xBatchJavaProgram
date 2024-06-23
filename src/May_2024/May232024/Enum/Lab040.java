package May_2024.May232024.Enum;

public class Lab040 {

    public static void main(String[] args) {
        System.out.println("P1 --> " + PriorityBug.HIGH);
        System.out.println("P2 --> " + PriorityBug.MEDIUM);
        System.out.println("P3 --> " + PriorityBug.LOW);


        PriorityBug myVar = PriorityBug.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        for (PriorityBug myVar2 : PriorityBug.values()) {
            System.out.println(myVar2);
        }
    }
}
