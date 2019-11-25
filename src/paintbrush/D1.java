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
public class D1 extends D0{
    private int x1,y1;

    public D1(int x0, int y0, int x1, int y1, Color cor) {
        super(x0, y0, cor);
        this.x1 = x1;
        this.y1 = y1;
    }
    
    @Override public void desenhar(Graphics g){
        g.setColor(super.getCor());
        g.drawLine(super.getX(), super.getY(), x1, y1);
    }
    
    public void comprimento(Graphics g){//calcula o comprimeto da reta
        double comprimento = Math.sqrt((x1-super.getX())*(x1-super.getX())+(y1-super.getY())*(y1-super.getY()));
        g.drawString(""+Math.round(comprimento)+"px", (super.getX()+x1)/2,(super.getY()+y1)/2);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
    
    
}
