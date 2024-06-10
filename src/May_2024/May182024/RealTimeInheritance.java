package May_2024.May182024;

public class RealTimeInheritance {
    public static void main(String[] args) {
    Base b = new Test();  //dynamic dispatch
    b.setBrowser("edge", true);
    b.openBrowser("Edge");
    b.openBrowser();
    b.closeBrowser();
    }
}

class Test extends Base{
    // MethodOverriding
    public void setBrowser(String browser, boolean isAuth){
        super.setBrowser(browser, isAuth);

    }

}

class Base{
    String browser;

    public String getBrowser() {
        return browser;
    }

    //Encapsulation
    public void setBrowser(String browser, boolean isAuth) {

        if(isAuth) {
            this.browser = browser;
            System.out.println("Setting Browser --> " + browser);
        }else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Closing Browser!!");
    }
}