/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
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
    ObjectOutputStream outputToServer = null;
    ObjectInputStream fromServer = null;

    public void start() throws IOException {
        int option = 0;
        ArrayList<Shape> Shapes = new ArrayList<Shape>();
        System.out.println("Welcome to the shapes application. Please look at the menu and select the option you would like.");
        Socket client = new Socket("localhost", 8000);
        while (option != 5) {

            System.out.println("Please enter the number associated with the option you choose");
            System.out.println("1. Create 2D Shapes");
            System.out.println("2. Create 3D Shapes");
            System.out.println("3. Send Shapes");
            System.out.println("4. Receive Shapes");
            System.out.println("5. Exit");
            Scanner s = new Scanner(System.in);

            option = s.nextInt();

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
                    double side1 = s.nextDouble();
                    System.out.println("Enter the length for side 2");
                    double side2 = s.nextDouble();
                    System.out.println("Enter the length for side 3");
                    double side3 = s.nextDouble();

                    Triangle myTriangle = new Triangle(name, side1, side2, side3);

                    myTriangle.displayDescription();

                    System.out.println("Area     :" + myTriangle.getArea());

                    System.out.println("Perimeter:" + myTriangle.getPerimeter());

                    Shapes.add(myTriangle);
                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Would you like to send the triange " + name + " to the server?");
                    System.out.println("Select y for yes and n for no");
                    String response = s.next();
                    //Based on user input, either send the triangle to the server or not.
                    //outputToServer = new ObjectOutputStream(client.getOutputStream());
                    new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
                    client.close();

                } else if (twod.equals("c")) {
                    System.out.println("What are the dimensions for your circle named " + name + " ?");
                    System.out.println("Enter the length of the radius");
                    double radius = s.nextDouble();

                    Circle myCircle = new Circle(name, radius);

                    myCircle.displayDescription();

                    System.out.println("Area     :" + myCircle.getArea());

                    System.out.println("Perimeter:" + myCircle.getPerimeter());

                    Shapes.add(myCircle);
                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Would you like to send the circle " + name + " to the server?");
                    System.out.println("Select y for yes and n for no");
                    String response = s.next();
                    //Based on user input, either send the circle to the server or not.
                    //outputToServer = new ObjectOutputStream(client.getOutputStream());
                    new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
                    client.close();

                } else if (twod.equals("r")) {
                    System.out.println("What are the dimensions for your rectangle named " + name + " ?");
                    System.out.println("Enter the height of the rectangle");
                    int height = s.nextInt();
                    System.out.println("Enter the width of the rectangle");
                    int width = s.nextInt();

                    Rectangle myRectangle = new Rectangle(name, height, width);

                    myRectangle.displayDescription();

                    System.out.println("Area     :" + myRectangle.getArea());

                    System.out.println("Perimeter:" + myRectangle.getPerimeter());

                    Shapes.add(myRectangle);
                    //Calculate the area and perimeter and then store in ArrayList<Shape>
                    System.out.println("Would you like to send the rectangle " + name + " to the server?");
                    System.out.println("Select y for yes and n for no");
                    String response = s.next();
                    //Based on user input, either send the rectangle to the server or not.   
                    //outputToServer = new ObjectOutputStream(client.getOutputStream());
                    new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
                    client.close();

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

                if (threed.equals("c")) {
                    System.out.println("What are the dimensions for your cylinder named " + name + " ?");
                    System.out.println("Enter the radius for your cylinder");
                    int radius = s.nextInt();
                    System.out.println("Enter the height for your cylinder");
                    int height = s.nextInt();

                    Cylinder myCylinder = new Cylinder(name, radius, height);

                    myCylinder.displayDescription();

                    System.out.println("Surface Area:" + myCylinder.getSurfaceArea());

                    System.out.println("Volume      :" + myCylinder.getVolume());

                    Shapes.add(myCylinder);
                    //Calculate the surface area and volume and then move to ArrayList<Shape>
                    System.out.println("Would you like to send the cylinder " + name + " to the server?");
                    System.out.println("Select y for yes and n for no");
                    String response = s.next();
                    //Based on user input, either send the cylinder to the server or not.
                    //outputToServer = new ObjectOutputStream(client.getOutputStream());
                    new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
                    client.close();

                } else if (threed.equals("s")) {
                    System.out.println("Enter the dimensions for your sphere named " + name + " ?");
                    System.out.println("Enter the radius for your sphere");
                    int radius = s.nextInt();

                    Sphere mySphere = new Sphere(name, radius);

                    mySphere.displayDescription();

                    System.out.println("Surface Area:" + mySphere.getSurfaceArea());

                    System.out.println("Volume      :" + mySphere.getVolume());

                    Shapes.add(mySphere);
                    //Calculate surface area and volume and then move to ArrayList<Shape>
                    System.out.println("Would you like to send the sphere " + name + " to the server?");
                    System.out.println("Select y for yes and n for no");
                    String response = s.next();
                    //Based on user input, either send the sphere to the server or not.
                    //outputToServer = new ObjectOutputStream(client.getOutputStream());
                    new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
                    client.close();

                } else {
                    System.out.println("You have not entered a valid letter corresponding to the 3D shape you wish to create.");
                }
                System.exit(0);

            } else if (option == 3) {
                //Create a line that will allow the client to send data to the files about shapes stored.
                System.out.println("You have selected send shapes");
                System.out.println("");
                //outputToServer = new ObjectOutputStream(client.getOutputStream());
                new ObjectOutputStream(client.getOutputStream()).writeObject(Shapes);
                //String send = s.next();
                client.close();

            } else if (option == 4) {
                //Create a line that will allow the client to receive data from the files about shapes stored.
                System.out.println("Which shapes would you like to receive?");
                System.out.println("Enter a for All, r for Rectangle, t for Triangle, c for Circle, s for Sphere and cy for Cylinder");
                String receive = s.next();
                if (receive.equals("r")) {

                } else if (receive.equalsIgnoreCase("t")) {

                } else if (receive.equalsIgnoreCase("c")) {

                } else if (receive.equalsIgnoreCase("s")) {

                } else if (receive.equalsIgnoreCase("cy")) {

                } else if (receive.equalsIgnoreCase("a")) {

                } else {

                    System.out.println("Please enter a valid input");
                    System.out.println();
                }

            } else if (option == 5) {
                System.exit(0);

            } else {
                System.out.println("Please enter a valid input");
                System.out.println();
            }
        }
        /*
        try {
            //final Socket client = new Socket("127.0.0.1", 5555);

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
         */
    }

}
