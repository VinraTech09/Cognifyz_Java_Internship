/*
Cognifyz Java Internship - Level 2 Task=2
Password Strength Checker
Name=Vinita Tarayil
Concepts :  Regular Expressions , Ternary Operator, String Methods.
Description : Checks password strength based on length , uppercase , lowercase , digits and special characters .
 */
package BaddieCodes.Cognifyz_Internship_Vinita;
import java.util.Scanner;

public class Task6_PasswordStrengthChecker {
    public static void main(String[] args) {
        System.out.println("Enter the password: ");
        String p= new Scanner (System.in).nextLine();

        boolean up = p.matches(".*[A-Z].*") , low = p.matches(".*[a-z].*");
        boolean dig = p.matches (".*[0-9].*") , sp= p.matches(".*[@#$%^&*!].*");
        int s= (p.length()>=8?1:0) + (up?1:0)+ (low?1:0)+(dig?1:0) +(sp?1:0);
        System.out.println(s==5 ?"STRONG ": s>=3 ? "MEDIUM " :"WEAK");   
    }
    
}
