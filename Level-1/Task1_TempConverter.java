/*
Cognifyz Java Internship - Level 1 Task=1
Temperature Converter .
Name=Vinita Tarayil
Concepts : User Input, Conditional Statements, Arithmetic Operations  .
Description : Converts temperature between Celsius and Fahrenheit  .
 */
package BaddieCodes.Cognifyz_Internship_Vinita;
import java.util.Scanner;

public class Task1_TempConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println(" Putting C for Celsius to Fahrenheit , F for Fahrenheit to Celsius");
        char choice= sc.next().charAt(0);
        System.out.println("Temperature value = ");
        double temp= sc.nextDouble();
        if(choice == 'C'|| choice == 'c'){
            double result = (temp*9.0/5.0)+32;
            System.out.printf("%.2f°C= %.2f°F\n", temp , result);
        }        
        else if (choice == 'F'|| choice == 'f'){
            double result = ( temp - 32) * 5.0/9.0;
            System.out.printf("%.2f°F= %.2f°C\n", temp , result);   
        }
        else{
            System.out.println("Invalid Input ! Only put C or F. ");
        }
        sc.close();

    }
    
}
