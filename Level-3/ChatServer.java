/*
Cognifyz Java Internship - Level 3 Task=1
Chat Application - Server Side 
Name=Vinita Tarayil
Concepts :   Socket Programming , ServerSocket ,Client-Server Architecture , .
Description : Server that accepts client connections and exchanges messages . 
 */
package BaddieCodes.Cognifyz_Internship_Vinita;
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server= new ServerSocket( 8888);
        System.out.println("Vinita now server is on , waiting for client ");
        Socket socket =server.accept();
        System.out.println("Client arrived");
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        String send , receive;
        while(true){
            receive = in.readLine();
            if(receive.equals("bye")){
                System.out.println("Client said bye");
                break;
            }
            System.out.println("Client : "+ receive);
            System.out.println("Server:");
            send = keyRead.readLine();
            out.println(send);
            if(send.equals("bye"));  break;
        }
        socket.close();
        server.close();
        System.out.println("Chat Closed. Done Vinita");
    }
    
}
