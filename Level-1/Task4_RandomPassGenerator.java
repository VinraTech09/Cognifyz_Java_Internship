/*
Cognifyz Java Internship - Level 1 Task=4
Random Password Generator
Name=Vinita Tarayil
Concepts :  Random Class, Strings , Loops , User Input .
Description : Generates random password of user - defined length 
 */

package BaddieCodes.Cognifyz_Internship_Vinita;
import java.util.Scanner;
import java.util.Random;
public class Task4_RandomPassGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();
        System.out.println("Length: ");
        int n = sc.nextInt();
        String s = "Girrafei@1017";
        String pass= "";
        for (int i=0; i< n; i++)pass +=s.charAt(rand.nextInt(s.length()));
        System.out.println("Password: " + pass );
        
    }
    
}
