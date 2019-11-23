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

    public D1(int x1, int y1, int x, int y, Color cor) {
        super(x, y, cor);
        this.x1 = x1;
        this.y1 = y1;
    }
    
    @Override public void desenhar(Graphics g){
        g.setColor(super.getCor());
        g.drawLine(super.getX(), super.getY(), x1, y1);
    }
    
    public void comprimento(){
    
    }
}
