import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {

    //CREATING COMMON OBJECT FOR ALL TEST CASES
    UserRegistrationProblem userRegistrationProblem = new UserRegistrationProblem();

    //TEST CASE FOR VALID FIRST NAME PATTERN
    @Test
    public void giveFirstName_WhenValid_ThenReturn() {
        boolean firstName = userRegistrationProblem.validateFirstName("Akshay");
        Assert.assertTrue(firstName);
    }

    //TEST CASE FOR INVALID FIRST NAME PATTERN
    @Test
    public void givenFirstName_WhenInvalid_ThenReturn() {
        boolean firstName = userRegistrationProblem.validateFirstName("akshay");
        Assert.assertFalse(firstName);
    }

    //TEST CASE FOR VALID LAST NAME PATTERN
    @Test
    public void giveLastName_WhenValid_ThenReturn() {
        boolean lastName = userRegistrationProblem.validateLastName("Salunkhe");
        Assert.assertTrue(lastName);
    }

    //TEST CASE FOR INVALID LAST NAME PATTERN
    @Test
    public void giveLastName_WhenInvalid_ThenReturn() {
        boolean lastName = userRegistrationProblem.validateLastName("salunkhe");
        Assert.assertFalse(lastName);
    }
}