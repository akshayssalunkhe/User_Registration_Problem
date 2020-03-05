import java.util.regex.Pattern;

public class UserRegistrationProblem {
    //PATTERN OF FIRST NAME
    public String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    //PATTERN OF LAST NAME
    public String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    //PATTERN OF EMAIL ID
    public String emailIdPattern = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    //PATTERN OF MOBILE NUMBER
    public String mobileNumberPattern= "^[0-9]{2}[ ][0-9]{10}$";
    //PATTERN OF PASSWORD AS PER RULE ONE
    public String passwordRuleOnePattern = "^[a-zA-Z0-9]{8,}";
    //PATTERN OF PASSWORD AS PER RULE TWO
    public String passwordRuleTwoPattern = "^(?=.*[A-Z])[A-Za-z]*.{8,}$";
    //PATTERN OF PASSWORD AS PER RULE THREE
    public String passwordRuleThreePattern = "((?=.*[A-Z])(?=.*[0-9])[A-z0-9]*.{8,})$";
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
    //METHOD TO VALIDATE EMAIL IDS
    public boolean validateEmailId(String email) {
        return (Pattern.matches(emailIdPattern,email));
    }

    // METHOD TO VALIDATE MOBILE NUMBER
    public boolean validateMobileNumber(String mobileNumber) {
        return (Pattern.matches(mobileNumberPattern,mobileNumber));
    }

    //METHOD TO VALIDATE PASSWORD AS PER RULE ONE
    public boolean validatePasswordRuleOne(String passwordRuleOne) {
        return (Pattern.matches(passwordRuleOnePattern,passwordRuleOne));
    }

    //METHOD TO VALIDATE PASSWORD AS PER RULE TWO
    public boolean validatePasswordRuleTwo(String passwordRuleTwo) {
        return (Pattern.matches(passwordRuleTwoPattern,passwordRuleTwo));
    }
    //METHOD TO VALIDATE PASSWORD AS PER RULE THREE
    public boolean validatePasswordRuleThree(String passwordRuleThree) {
        return (Pattern.matches(passwordRuleThreePattern,passwordRuleThree));
    }
}