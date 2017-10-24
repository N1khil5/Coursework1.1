/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

import java.util.Scanner;

/**
 *
 * @author M00607592
 */
public class Client {

    Scanner s = new Scanner(System.in);

    public void Menu() {
        System.out.println("Welcome to the Shapes Application. What would you like to do?");
        
        System.out.println("1. Create 2D Shapes");
        
        System.out.println("2. Create 3D Shapes");
        
        System.out.println("3. Exit");
        
        s.nextInt();
    }
}
