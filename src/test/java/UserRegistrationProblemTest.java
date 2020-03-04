import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {

    //TEST CASE FOR VALID FIRST NAME PATTERN
    @Test
    public void giveFirstName_WhenValid_ThenReturn() {
        UserRegistrationProblem userRegistrationProblem=new UserRegistrationProblem();
        boolean firstName = userRegistrationProblem.validateFirstName("Akshay");
        Assert.assertTrue(firstName);
    }

    //TEST CASE FOR INVALID FIRST NAME PATTERN
    @Test
    public void givenFirstName_WhenValid_ThenReturn() {
        UserRegistrationProblem userRegistrationProblem=new UserRegistrationProblem();
        boolean firstName = userRegistrationProblem.validateFirstName("akshay");
        Assert.assertFalse(firstName);
    }
}
