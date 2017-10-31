/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

/**
 *
 * @author M00607592
 */
public class Coursework11 {

    /**
     * @param args the command line arguments
     */
    final static String FORMAT = "--server <port>\n--client <host><port>";
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         final Rectangle myRectangle = new Rectangle("Rectangle",10,20);
         myRectangle.displayDescription();
         System.out.println("Area     :" + myRectangle.getArea());
         System.out.println("Perimeter:" + myRectangle.getPerimeter());
        
         final Circle myCircle = new Circle("Circle",10);
         myCircle.displayDescription();
         System.out.println("Area     :" + myCircle.getArea());
         System.out.println("Perimeter:" + myCircle.getPerimeter());
        
         final Triangle myTriangle = new Triangle("Triangle",10,10,10);
         myTriangle.displayDescription();
         System.out.println("Area     :" + myTriangle.getArea());
         System.out.println("Perimeter:" + myTriangle.getPerimeter());
        
         final Sphere mySphere = new Sphere("Sphere",10);
         mySphere.displayDescription();
         System.out.println("Surface Area:" + mySphere.getSurfaceArea());
         System.out.println("Volume      :" + mySphere.getVolume());
        
         final Cylinder myCylinder = new Cylinder("Cylinder",10,10);
         myCylinder.displayDescription();
         System.out.println("Surface Area:" + myCylinder.getSurfaceArea());
         System.out.println("Volume      :" + myCylinder.getVolume());
        
         */
        
        if(args.length ==0) {
            System.out.println("Invalid arguments provided. Arguments: ");
            System.out.println(FORMAT);
            return;
        }
        
        if(args[0].equals("--server") && args.length ==2) {
            final Server server = new Server(Integer.parseInt(args[1]));
            server.start();
        } else if(args[0].equals("--client") && args.length ==3) {
            final Client client = new Client(args[1],Integer.parseInt(args[2]));
            client.start();
        } else{
            System.out.println("Invalid arguments provided. Arguments: ");
            System.out.println(FORMAT);;
        }
        
    }
}
