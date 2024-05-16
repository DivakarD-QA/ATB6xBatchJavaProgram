package May_2024.May142024;

public class Lab002_Bank_Constructor {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        sbi.printDetails();

        BankAccount hdfc = new BankAccount( "HDFC",30000, "HDFC002" );
        hdfc.printDetails();

        BankAccount axis = new BankAccount("AXIS", "AXIS003");
        axis.printDetails();
    }
}
