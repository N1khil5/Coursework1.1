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
public class Cylinder extends ThreeDShapes {

    private double _radius;
    private double _height;

    public Cylinder(String name, double radius, double height) {
        super(name, 0);
        _radius = radius;
        _height = height;
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm also a cylinder.");
    }

    @Override
    public double getSurfaceArea() {
        double surfaceArea = (Math.PI * 2.0 * _height * _radius) + (Math.PI * _radius * _radius * 2.0);
        return surfaceArea;
    }

    @Override
    public double getVolume() {
        double volume = (Math.PI * _radius * _radius * _height);
        return volume;
    }
}
