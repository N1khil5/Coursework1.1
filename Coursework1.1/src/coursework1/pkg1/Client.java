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

    private int port;
    private String host;

    Client(String host, int port) {
        this.port = port;
        this.host = host;
    }

    public void start() {

        System.out.println("Welcome to the shapes application. Please look at the menu and select the option you would like.");
        System.out.println("Please enter the number associated with the option you choose");
        System.out.println("1. Create 2D Shapes");
        System.out.println("2. Create 3D Shapes");
        System.out.println("3. Receive Shapes");
        System.out.println("4. Exit");

        Scanner s = new Scanner(System.in);
        int option = s.nextInt();

        if (option == 1) {
            System.out.println("You have selected 2D Shapes");
            System.out.println("What would you like to name your shape?");
            String name = s.next();
            System.out.println("What 2D shape would you like to create?");
            System.out.println("Please enter the letter based on the shape you wish to create:");
            System.out.println("t for Create Triangle :");
            System.out.println("c for Create Circle   :");
            System.out.println("r for Create Rectangle:");
            System.out.println("To exit, enter anything else");
            String twod = s.next();
            if (twod.equals("t")) {
                System.out.println("What are the dimensions for your triangle named " + name + " ?");
                System.out.println("Enter the length for side 1");
                int side1 = s.nextInt();
                System.out.println("Enter the length for side 2");
                int side2 = s.nextInt();
                System.out.println("Enter the length for side 3");
                int side3 = s.nextInt();
                // Move to the Triangle class to start performing calculations
                //Calculate the area and perimeter and then store in ArrayList<Shape>
                System.out.println("Would you like to send the triange " + name + " to the server?");
                String response = s.next();
                //Based on user input, either send the triangle to the server or not.
            } else if (twod == "c") {
                System.out.println("What are the dimensions for your circle named " + name + " ?");
                System.out.println("Enter the length of the radius");
                int radius = s.nextInt();
                //Move to the Circle class to start performing calculations
                //Calculate the area and perimeter and then store in ArrayList<Shape>
                System.out.println("Would you like to send the circle " + name + " to the server?");
                String response = s.next();
                //Based on user input, either send the circle to the server or not.                
            } else if (twod == "r") {
                System.out.println("What are the dimensions for your rectangle named " + name + " ?");
                System.out.println("Enter the height of the rectangle");
                int height = s.nextInt();
                System.out.println("Enter the width of the rectangle");
                int width = s.nextInt();
                //Move to the rectangle class to start performing calculations
                //Calculate the area and perimeter and then store in ArrayList<Shape>
                System.out.println("Would you like to send the rectangle " + name + " to the server?");
                String response = s.next();
                //Based on user input, either send the rectangle to the server or not.                
            } else {
                System.out.println("You have not entered a valid letter corresponding to the 2D shape you wish to create.");
            }
            System.exit(0);
        } else if (option == 2) {
            System.out.println("You have selected 3D Shapes");
            System.out.println("What would you like to name your shape?");
            String name = s.next();
            System.out.println("What 3D shape would you like to create?");
            System.out.println("Please enter the letter based on the shape you wish to create:");
            System.out.println("c for Create Cylinder   :");
            System.out.println("s for Create Sphere     :");
            System.out.println("To exit, enter anything else");
            String threed = s.next();
            if (threed == "c") {
                System.out.println("What are the dimensions for your cylinder named " + name + " ?");
                System.out.println("Enter the radius for your cylinder");
                int radius = s.nextInt();
                System.out.println("Enter the height for your cylinder");
                int height = s.nextInt();
                //Move to the cylinder class to start performing calculations
                //Calculate the surface area and volume and then move to ArrayList<Shape>
                System.out.println("Would you like to send the cylinder " + name + " to the server?");
                String response = s.next();
                //Based on user input, either send the cylinder to the server or not.                
            } else if (threed == "s") {
                System.out.println("Enter the dimensions for your sphere named " + name + " ?");
                System.out.println("Enter the radius for your sphere");
                int radius = s.nextInt();
                //Move to the sphere class to start performing calculations
                //Calculate surface area and volume and then move to ArrayList<Shape>
                System.out.println("Would you like to send the sphere " + name + " to the server?");
                String response = s.next();
                //Based on user input, either send the sphere to the server or not.
            } else {
                System.out.println("You have not entered a valid letter corresponding to the 3D shape you wish to create.");
            }
            System.exit(0);
        } else if (option == 3) {
            //Create a line that will allow the client to receive data from the files about shapes stored.
            System.out.println("Which shapes would you like to receive?");
            System.out.println("Enter a for All, r for Rectangle, t for Triangle, c for Circle, s for Sphere and cy for Cylinder");
            String receive = s.next();
        } else if (option == 4) {
            System.exit(0);
        } else {
            System.out.println("Please enter a valid input");
        }

        try {
            final Socket client = new Socket("127.0.0.1", 5555);

            final PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            final Scanner in = new Scanner(client.getInputStream());

            final Scanner userIn = new Scanner(System.in);

            while (true) {
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
