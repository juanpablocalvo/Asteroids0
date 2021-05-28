/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.asteroids.entity;

import com.mycompany.asteroids.Game;
import java.awt.Graphics2D;

/**
 *
 * @author juanp
 * triangle1 = new Polygon();
        triangle1.addPoint(400, 550);        //left   
        triangle1.addPoint(600, 550); //right
        triangle1.addPoint(500, 350); //top
        triangle2 = new Polygon();
        triangle2.addPoint(600, 550);  // left
        triangle2.addPoint(700, 350); //top
        triangle2.addPoint(800, 550);  //right
        triangle3 = new Polygon();
        triangle3.addPoint(500, 350); //left
        triangle3.addPoint(700, 350); //right
        triangle3.addPoint(600, 150); // 
 */
public class Nave {
    
    public void draw(Graphics2D g, Game game) {
            g.drawLine(-10, -8, 10, 0);
            g.drawLine(-10, 8, 10, 0);
            g.drawLine(-6, -6, -6, 6); //Draw the PoewerUp.

    }
}
