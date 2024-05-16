package May_2024.May142024;

public class BankAccount {
    String bankname;
    String country = "INDIA";
    int balance;
    String code;


    public BankAccount(String bankname, String code) {
        System.out.println( "*******Parameterized Constructor with 2 parameter");
        this.bankname = bankname;
        this.code = code;
    }


    //DC
    BankAccount(){
        System.out.println( "------- Default Constructor ");
        this.code = "SBI001";
        this.balance = 50000;
        this.bankname = "SBI";

    }

    public BankAccount(String bankname, int balance, String code) {
        System.out.println( "*******Parameterized Constructor with ALL parameter");
        this.bankname = bankname;
        this.balance = balance;
        this.code = code;
    }

    public void printDetails(){
        System.out.println(" Bank Name -> " + bankname);
        System.out.println(" Country -> " + country);
        System.out.println(" Bank Balance -> " + balance);
        System.out.println(" Bank Code -> " + code);

    }



}
