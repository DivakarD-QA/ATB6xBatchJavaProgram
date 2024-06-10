package May_2024.May182024.Encapsulation;

public class Lab025 {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank("Divakar", 5646122);
        i.setBal(-100);
        System.out.println(i.getBal());

    }
}
