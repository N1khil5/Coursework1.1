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
public class Sphere extends ThreeDShapes {

    private double _radius;

    public Sphere(String name, double radius) {
        super(name, 0);
        _radius = radius;
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\t I'm also a sphere.");
    }
    
    @Override
    public double getSurfaceArea() {
        double surfaceArea = (Math.PI*4.0*_radius*_radius);
        return surfaceArea;
    }
    
    @Override
    public double getVolume() {
        double volume = (Math.PI*_radius*_radius*_radius*(4/3));
        return volume;
    }
}
