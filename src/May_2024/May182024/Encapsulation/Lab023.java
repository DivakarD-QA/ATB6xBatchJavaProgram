package May_2024.May182024.Encapsulation;

public class Lab023 {
    public static void main(String[] args) {
        VwoLogin v = new VwoLogin("admin", "admin123");
        System.out.println(v.username);
        v.username= "DOn";
        System.out.println(v.username);
        System.out.println(v.password);

        // here there is no encapsulation so anyone can get the username/ password
    }

}

 class VwoLogin{
    public String username;
    public String password;

    public VwoLogin(String username, String password ) {
        this.password = password;
        this.username = username;
    }


}
