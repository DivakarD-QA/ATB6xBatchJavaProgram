package May_2024.May182024.Encapsulation;

public class Lab024 {
    public static void main(String[] args) {
    VWOLogin2 v2 = new VWOLogin2("Admin", "Admin123");
    // since private user cannot access
//        System.out.println(v2.username);
//        System.out.println(v2.password);
        v2.setPassword("1123", true);
        String password = v2.getPassword(true);

        System.out.println(password);



    }

}

class VWOLogin2{
    private String username;
    private String password;

    public VWOLogin2(String username, String password ) {
        this.password = password;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if(isAuth) {
            return password;
        }
        else {
            return "NOt Allowed";
        }
    }

    public void setPassword(String password, boolean isAuth) {
        if (isAuth) {
            this.password = password;
        }else {
            System.out.println("Not Allowed");
        }
    }
}
