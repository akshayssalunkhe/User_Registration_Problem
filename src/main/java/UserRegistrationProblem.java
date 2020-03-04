import java.util.regex.Pattern;

public class UserRegistrationProblem {
    //PATTERN OF FIRST NAME
    public String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    //PATTERN OF LAST NAME
    public String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";

    //MAIN METHOD
    public static void main(String[] args) {
        //WELCOME MESSAGE
        System.out.println("Welcome To User Registration Problem");
    }

    //METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern, firstName));
    }

    //METHOD TO VALIDATE LAST NAME
    public boolean validateLastName(String lastName) {
        return (Pattern.matches(lastNamePattern, lastName));
    }
}