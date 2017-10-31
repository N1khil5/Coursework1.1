/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author M00607592
 */
public class Server {

    Server(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void start() {

        
        try {
            final ServerSocket server = new ServerSocket(5555);

            final Socket clientConnection = server.accept();

            final PrintWriter out = new PrintWriter(clientConnection.getOutputStream(), true);

            final Scanner in = new Scanner(clientConnection.getInputStream());

            while (in.hasNext()) {

                final String clientRequest = in.nextLine();

                if (!clientRequest.isEmpty()) {

                    out.println("Request received '" + clientRequest.toUpperCase() + "'");
                }
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
