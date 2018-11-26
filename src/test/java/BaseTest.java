import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shridhk on 11/25/18.
 */
public class BaseTest {

    @Test
    public void sampleTest(){
        new HomePage().loadURl().genericLogin(new PaymentPage()).navigateToPayment();
        new HomePage().loadURl().genericLogin(new HomePage()).navigateToHomePage();


        HomePage object = (HomePage) new HomePage().loadURl().genericLoginUsingObject(new HomePage());
        object.navigateToHomePage();

        PaymentPage p = (PaymentPage) new HomePage().loadURl().genericLoginUsingObject(new PaymentPage());
        p.navigateToPayment();

        Assert.assertTrue(true);
    }
}
