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
public class Circle extends TwoDShapes{
    
    private double _radius;
    
    public Circle(String name, double radius) {
        super(name,0);
        _radius = radius;
    }
    
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm also a circle");
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(_radius,2);
    }
    
    @Override
    public double getPerimeter() {
        return Math.PI * (_radius*2);
    }
}
