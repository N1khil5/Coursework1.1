/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author M00607592
 */
public class Client {

    Client(String arg, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void start() {

        try {
            final Socket client = new Socket("127.0.0.1",5555);
            
            final PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            
            final Scanner in = new Scanner(client.getInputStream());
            
            final Scanner userIn = new Scanner(System.in);
            
            while(true) {
                System.out.print("Enter request: ");
                
                final String userInput = userIn.nextLine();
                
                out.println(userInput);
                
                System.out.println(">> " + in.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
