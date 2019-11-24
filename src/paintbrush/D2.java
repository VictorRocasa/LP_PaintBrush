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
public abstract class D2 extends D1{
    private Color corInterna;

    public D2(int x, int y, int x1, int y1, Color corInterna, Color corExterna) {
        super(x, y, x1, y1, corExterna);
        this.corInterna = corInterna;
    }
       
    public abstract void area(Graphics g);
    public abstract void perimetro(Graphics g);

    public Color getCorInterna() {
        return corInterna;
    }

    public void setCorInterna(Color corInterna) {
        this.corInterna = corInterna;
    }
}
