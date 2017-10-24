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
public class Triangle extends TwoDShapes{
    private double _side1;
    private double _side2;
    private double _side3;
    
    public Triangle(String name, double side1, double side2, double side3) {
        super(name,3);
        _side1 = side1;
        _side2 = side2;
        _side3 = side3;
    }
    
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm also a triangle");
    }
    
    @Override
    public double getArea() {
        //Variable s is the semiperimeter we're finding
        double s = (_side1 + _side2 + _side3)/2;
        //We can use the semiperimeter to get the area using Heron's formula
        double Area = Math.sqrt(s*(s-_side1)*(s-_side2)*(s-_side3));
        return Area;
    }
    
    @Override
    public double getPerimeter() {
        return _side1 + _side2 + _side3;
    }
}
