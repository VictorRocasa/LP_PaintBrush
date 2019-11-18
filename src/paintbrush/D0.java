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
public class D0 {
    private int x, y;
    private Color cor;

    public D0(int x, int y, Color cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }
    
    public void desenhar(Graphics g){
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }
    
    
}
