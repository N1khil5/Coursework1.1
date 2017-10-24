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
    public static void main(String[] args) {
        // TODO code application logic here
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
    }
    
}
