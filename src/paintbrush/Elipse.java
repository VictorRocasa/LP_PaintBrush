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
 * @author 09795410695
 */
public class Elipse extends D2{

    int horizontal, vertical;

    public Elipse(int x, int y, int x1, int y1, Color corExterna, Color corInterna) {
        super(x, y, x1, y1, corExterna, corInterna);
        this.horizontal = x1 - x;
        this.vertical = y1 - y;
    }

    public void desenhar(Graphics g, Boolean preencher) {
        int x = super.getX();
        int y = super.getY();
        if(preencher)
        {
            g.setColor(super.getCorInterna()); 
            g.fillOval(x, y, horizontal, vertical);
        }
        g.setColor(super.getCor()); 
        g.drawOval(x, y, horizontal, vertical);
    }

    @Override
    public void area(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void perimetro(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
