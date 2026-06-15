/*
Cognifyz Java Internship - Level 1 Task=2 
Palindrome Checker 
Name=Vinita Tarayil
Concepts : Strings , Loops , Conditional Statements .
Description :Checks if input word is palindrome by reversing  string  .
 */

package BaddieCodes.Cognifyz_Internship_Vinita;
import java.util.Scanner;

public class Task2_PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word for checking palindrome: ");
        String word = sc.nextLine();
        String original = word.toLowerCase();
        String reverse = "";
        for (int i = original.length() -1; i>=0;i--){
            reverse = reverse+original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println(word + " is a Palindrome ");
        }else{
            System.out.println(word + " is NOT a Palindrome");
        }
        sc.close();

    }
    
}
