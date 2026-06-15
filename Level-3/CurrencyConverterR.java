/*
Cognifyz Java Internship - Level 3 Task=4
Converter using API
Name=Vinita Tarayil
API used : exchangerate-api.com
Input : INR--->Output: USD
 */
package BaddieCodes.Cognifyz_Internship_Vinita;

import javax.swing.*;
import java.net.*;
import java.util.Scanner;
public class CurrencyConverterR {
    public static void main(String[] args) {
        JFrame f= new JFrame ("Converter");
        JTextField t1 = new JTextField(); t1.setBounds(30,30,120,25);
        JButton b= new JButton("Convert"); b.setBounds(30,70,120,25);
        JTextField t2 = new JTextField(); t2.setBounds(30,110,120,25);
        b.addActionListener(e-> {
            try{
                double inr= Double.parseDouble(t1.getText());
                URL url= new URL ("https://api.exchangerate-api.com/v4/latest/INR");
                Scanner sc= new Scanner(url.openStream());
                String json=sc.useDelimiter("\\A").next(); sc.close();
                int i= json.indexOf("\"USD\":")+6;
                int j= json.indexOf(",",i);
                double rate=Double.parseDouble(json.substring(i,j));
                t2.setText(String.format("%.2f",inr*rate));
            }catch(Exception ex){
                t2.setText("Error");
                System.out.println(ex);  
            }
        });
        f.add(t1); f.add(b); f.add(t2);
        f.setSize(200,200); f.setLayout(null); f.setVisible(true);       
    }   
}
