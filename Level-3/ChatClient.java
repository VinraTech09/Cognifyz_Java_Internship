/*
Cognifyz Java Internship - Level 3 Task=1
Chat Application - Client Side 
Name=Vinita Tarayil
Concepts :   Socket Programming , Input/Output Streams, Networking .
Description : Client that connects to a server for real-time message exchange. 
 */
package BaddieCodes.Cognifyz_Internship_Vinita;
import java.io.*;
import java.net.*;
public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket= new Socket("localhost", 8888);
        System.out.println("Server is connected now");

        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        String send , receive;
        while(true){
            System.out.println("Client:");
            send= keyRead.readLine();
            out.println(send);
            if(send.equals("bye")) break;
            receive = in.readLine();
            if(receive.equals("bye")){
                System.out.println("Server said bye");
                break;
            }
            System.out.println("Server:" + receive);
        }
        socket.close();
        System.out.println("Chat Closed. Done Vinita");
    }
    
}

    
    

