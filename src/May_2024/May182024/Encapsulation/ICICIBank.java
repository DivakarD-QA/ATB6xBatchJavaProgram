package May_2024.May182024.Encapsulation;

public class ICICIBank {
    // Private
    // Use Setter and Getter with Condition to secure your data members by methods
    // hide the data members - ecap


    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if(bal > 0) {
            this.bal = bal;
        }else {
            System.out.println("Not Allowed");
        }
    }
}
