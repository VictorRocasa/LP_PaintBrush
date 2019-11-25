/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author victorPC
 */
public class Circulo extends Elipse{
    int raio;

    public Circulo(int x, int y, int x1, int y1, Color corInterna, Color corExterna) {
        super(x, y, x1, y1, corInterna, corExterna);
        this.raio = (x1-x)/2;
    }

    @Override
    public void area(Graphics g) {
        double area = Math.sqrt(raio*raio*Math.PI);
        g.drawString(""+Math.round(area)+"px", (super.getX()+super.getX1())/2,(super.getY()+super.getY1())/2);
    }

    @Override
    public void perimetro(Graphics g) {
        double perimetro = 2*Math.PI*raio;
        g.drawString(""+Math.round(perimetro)+"px", (super.getX()+super.getX1())/2,super.getY());
    }
}
