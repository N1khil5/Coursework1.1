/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.io.Serializable;

/**
 *
 * @author M00607592
 */
public abstract class Shape implements Serializable {

    private int noOfSides;
    private String name;

    public int getNoOfSides() {
        return noOfSides;
    }

    public Shape(String name, int noOfSides) {
        this.name = name;
        this.noOfSides = noOfSides;
    }

    public String getName() {
        return name;
    }

    public void displayDescription() {
        System.out.println("I'm a shape named " + name);
    }

    public void printInfo() {
        System.out.println("I'm a shape named " + name);
    }

}
