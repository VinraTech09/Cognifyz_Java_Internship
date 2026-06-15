/*
Cognifyz Java Internship - Level 3 Task=3 
GUI Desktop Calculator Application
Name=Vinita Tarayil
Concepts : Java Swing ,Event Handling, GUI Components
Description :Basic calculator with + , - , * , % operations using JFrame .
 */

package BaddieCodes.Cognifyz_Internship_Vinita;
import java.awt.event.*;

import javax.swing.*;

public class MiniCalc_desktopApp {
    public static void main(String[] args) {
        JFrame f = new JFrame ("Vinita's calci");
        JTextField t1 = new JTextField(); t1.setBounds(50,50,150,30);
        JTextField t2 = new JTextField(); t2.setBounds(50,100,150,30);
        JTextField t3 = new JTextField(); t3.setBounds(50,150,150,30);
        t3.setEditable (false);
        JButton b=  new JButton("+");  b.setBounds(50,200,70,30);
        JButton b2= new JButton("-"); b2.setBounds(130,200,70,30);

        JButton b3= new JButton("*"); b3.setBounds(50,250,70,30);
        JButton b4= new JButton("%"); b4.setBounds(130,250,70,30);

        b.addActionListener(e ->{
            int a= Integer.parseInt(t1.getText());
            int b1= Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a+b1));
        });
        b2.addActionListener(e -> {
            int a= Integer.parseInt(t1.getText());
            int b1= Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a - b1));
        });
        b3.addActionListener(e -> {
            int a= Integer.parseInt(t1.getText());
            int b1= Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a * b1));
        });
        b4.addActionListener(e -> {
            int a= Integer.parseInt(t1.getText());
            int b1= Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(a % b1));
        });
        f.add(t1); f.add(t2); f.add(t3); f.add(b); f.add(b2); f.add(b3); f.add(b4);
        f.setSize(300,300); f.setLayout(null); f.setVisible(true);
    }
}
