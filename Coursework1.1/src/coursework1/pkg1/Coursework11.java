/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.io.IOException;

/**
 *
 * @author M00607592
 */
public class Coursework11 {

    /**
     * @param args the command line arguments
     */
    final static String FORMAT = "--server <port>\n--client <host><port>";

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        if (args.length == 0) {
            System.out.println("Invalid arguments provided. Arguments: ");
            System.out.println(FORMAT);
            return;
        }

        if (args[0].equals("--server") && args.length == 2) {
            final Server server = new Server(Integer.parseInt(args[1]));
            server.start();
        } else if (args[0].equals("--client") && args.length == 3) {
            final Client client = new Client(args[1], Integer.parseInt(args[2]));
            client.start();
        } else {
            System.out.println("Invalid arguments provided. Arguments: ");
            System.out.println(FORMAT);;
        }

    }
}
