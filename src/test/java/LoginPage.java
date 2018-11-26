

/**
 * Created by shridhk on 11/25/18.
 */
public class LoginPage {
//    public PaymentPage login(){
//        //Login
//        System.out.println("In LoginPage");
//        return new PaymentPage();
//    }
//
//    public HomePage login1(){
//        //Login
//
//        System.out.println("In LoginPage");
//        return new HomePage();
//    }

    public <T> T genericLogin(T home){
        System.out.println("In LoginPage");
        return home;
    }

    public Object genericLoginUsingObject(Object object ) {
        //Login
        System.out.println("in generic file");
        return object;
    }


}
