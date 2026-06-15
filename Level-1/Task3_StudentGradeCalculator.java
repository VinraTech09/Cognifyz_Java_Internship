/*
Cognifyz Java Internship - Level 1 Task=3
Student Grade Calculator
Name=Vinita Tarayil
Concepts :  Loops , Type Casting , Arithmetic Operations , User Input  .
Description :  Calculates total marks average of n subjects.
 */

package BaddieCodes.Cognifyz_Internship_Vinita;
import java.util.Scanner;

public class Task3_StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int n= sc.nextInt();
        int total = 0;
        for(int i = 0;i<n; i++){
            System.out.println("Marks" +(i+1)+":");
            total += sc.nextInt();

        }
        System.out.println("Total: " + total);
        System.out.println("Average : " + (double ) total/n);
        sc.close();
    }
}
