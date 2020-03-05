import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationProblemTest {

    //STRING ARRAY OF VALID EMAIL IDS
    String [] validEmailIds={"abc@yahoo.com",
                            "abc-100@yahoo.com",
                            "abc.100@yahoo.com",
                            "abc111@abc.com",
                            "abc-100@abc.net",
                            "abc.100@abc.com.au",
                            "abc@1.com",
                            "abc@gmail.com.com",
                            "abc+100@gmail.com"};

    //STRING ARRAY OF INVALID EMAIL IDS
    String [] invalidEmailIds={"abc",
                               "abc@.com.my",
                               "abc123@gmail.a",
                               "abc123@.com",
                               "abc123@.com.com",
                               ".abc@abc.com",
                               "abc()*@gmail.com",
                               "abc@%*.com",
                               "abc..2002@gmail.com",
                               "abc.@gmail.com",
                               "abc@abc@gmail.com",
                               "abc@gmail.com.1a",
                               "abc@gmail.com.aa.au"};

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
    //TEST CASE FOR VALID EMAIL ID
    @Test
    public void giveEmailId_WhenValid_ThenReturn () {
        for ( int index=0 ;index<validEmailIds.length; index++ )
        {
            boolean emailId = userRegistrationProblem.validateEmailId(validEmailIds[index]);
            Assert.assertTrue(emailId);
        }
    }

    //TEST CASE FOR INVALID EMAIL IDS
    @Test
    public void giveEmailId_WhenInvalid_ThenReturn () {
        for ( int index=0 ;index<invalidEmailIds.length; index++ )
        {
            boolean invalidEmailId = userRegistrationProblem.validateEmailId(invalidEmailIds[index]);
            Assert.assertFalse(invalidEmailId);
            Assert.assertFalse(invalidEmailId);
        }
    }

}