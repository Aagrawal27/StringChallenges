

/***
 * Problem: You are creating a password validation system.
 * A valid password must meet the following requirements:
 * It must contain at least one uppercase letter,
 * It must contain at least one number,
 * It must not contain the word "password" (case insensitive).
 * Write a function that checks if a password is valid and prints "Valid password"
 * or "Invalid password" based on the rules.
 * Expected output: Valid password: false
 */

public class D_PasswordValidator {
public boolean a = false;
public boolean b = false;
public boolean c = false;

    public static void main(String[] args) {
        D_PasswordValidator d = new D_PasswordValidator();
    }

    public D_PasswordValidator() {
        String password = "MyPassw0rd";
        System.out.println("Valid password: " + isValidPassword(password));  // Output: Invalid password (false)
    }

    public boolean isValidPassword(String password) {
        for(int i=0;i<password.length();i++){
            char n = password.charAt(i);
            if(Character.isUpperCase(n)==true){
                a=true;
            }
            if(Character.isDigit(n)==true){
                b=true;
            }

        }
        if(password.contains("password")==false && password.contains("Password")==false){
            c=true;
        }
        if(a&&b&&c){
            return true;
        }else{
            return false;
        }

        // this is a temporary return to avoid errors
    }

}
