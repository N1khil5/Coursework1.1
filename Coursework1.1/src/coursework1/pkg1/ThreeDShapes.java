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
public abstract class ThreeDShapes extends Shape{

    public ThreeDShapes(String name, int noOfSides) {
        super(name, noOfSides);
    }
    
    public abstract double getSurfaceArea();
    
    public abstract double getVolume();
}
