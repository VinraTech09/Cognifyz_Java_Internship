/*
Cognifyz Java Internship - Level 2 Task=3
File Encryption and Decryption .
Name=Vinita Tarayil
Concepts :   File handling , Caesar Cipher , Exception Handling .
Description : Encrypts and Decrypts text files using Caesar Cipher +3/-3 shift . 
 */

package BaddieCodes.Cognifyz_Internship_Vinita;
import java.util.*;
import java.nio.file.*;
// for encrypting = 1 (enter then)  BaddieCodes/Cognifyz_Internship_Vinita/test.txt
// for decrypting = 2 (enter then )  e.txt

public class Task7_FileEncrypDecrypt {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner (System.in);
        System.out.print("1=Encrypt 2= Decrypt: ");
        int c= s.nextInt();
        s.nextLine();
        System.out.print("File name: ");
        String t= new String (Files.readAllBytes(Paths.get(s.nextLine())));
        String o = "";
        for(char x:t.toCharArray()){
            if(x>='A' && x<= 'Z') x=(char)(c==1? 'A'+(x-'A' +3)% 26: 'A'+ (x-'A'+23)%26);
            else if(x>='a' && x<= 'z') x =(char)(c==1?'a'+(x-'a'+3)%26:'a'+(x-'a'+23)%26);
            o+=x;
        }
        Files.write(Paths.get(c==1?"e.txt":"d.txt"), o.getBytes());
        System.out.println("Done Vinita ");
        s.close();  
    }   
}
