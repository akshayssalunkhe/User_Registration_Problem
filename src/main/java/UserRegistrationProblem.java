import java.util.regex.Pattern;

public class UserRegistrationProblem {
    //PATTERN OF FIRST NAME
    public String firstNamePattern ="^[A-Z]{1}[a-z]{2,}$";

    //MAIN METHOD
    public static void main(String[] args) {
        //WELCOME MESSAGE
        System.out.println("Welcome To User Registration Problem");
    }
    //METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstname) {
        return (Pattern.matches(firstNamePattern,firstname));
    }
}
