/*
Cognifyz Java Internship - Level 2 Task=1
Tic Tac Toe Game 
Name=Vinita Tarayil
Concepts :  Arrays , Loops , 2D Logic , Conditional Statements .
Description : Two-Player Tic Tac Toe Game with win condition check 
 */

package BaddieCodes.Cognifyz_Internship_Vinita;

import java.util.Scanner;

public class Task5_TicTacToe {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        char[] b={'1','2','3','4','5','6','7','8','9'};
        char p ='X';
        int t =0;
        while(t < 9){
            System.out.println("\n" +b[0]+"|" +b[1]+ "|" +b[2] +"\n" +b[3] +"|"+ b[4]+"|" + b[5] + "\n" +b[6] + "|" +b[7] +"|"+b[8]);
            System.out.println("Player "  + p +"enter the number 1-9: ");
            int m = sc.nextInt() -1;
            if(m<0 || m>8 || b[m]=='X' || b[m] =='O'){
                System.out.println("Wrong!"); continue; }
                b[m] = p;t++;

                int[][] w = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
                for(int[] l: w){
                    
                    //l is used as variable i.e small L .......dont get confused 

                    if(b[l[0]]== p && b[l[1]] == p && b[l[2]] == p){ 
                        System.out.println("\n" +b[0]+"|" +b[1]+ "|"+ b[2] + "\n" +b[3] + "|" +b[4] +"|" +b[5]+ "\n" +b[6]+ "|" + b[7] + "|" + b [8]);
                        System.out.println("Player " + p +" We Won ");
                        System.out.println("Game by Vinita ");
                        return;
                    }
                }            
                p = (p=='X') ? 'O' : 'X';
        }
        System.out.println("Draw Game By Vinita");
    }
    
}
