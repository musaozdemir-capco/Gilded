package testBase;


import pages.LoginPageElements;
import pages.DashboardPageElements;


public class PageInitializer extends BaseClass {

    public static LoginPageElements login;
    public static DashboardPageElements dash;



    public static void initializePageObjects(){
        login = new LoginPageElements();
        dash = new DashboardPageElements();

    }

}
