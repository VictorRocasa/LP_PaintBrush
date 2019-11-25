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
public class Retangulo extends D2{
    private int base;
    private int largura;

    public Retangulo(int x0, int y0, int x1, int y1, Color corExterna, Color corInterna) {
        super(x0, y0, x1, y1, corExterna, corInterna);
        this.base = x1 - x0;
        this.largura = y1 - y0;
    }
    
    public void desenhar(Graphics g, boolean preencher){
        int x = super.getX();
        int y = super.getY();
        if(preencher)
        {
            g.setColor(super.getCorInterna());            
            g.fillRect(x, y, base, largura);
        }
        g.setColor(super.getCor());
        g.drawRect(x, y, (super.getX1()-x), (super.getY1()-y));
    }    

    @Override
    public void area(Graphics g) {
        double area = base * largura;
        g.drawString(""+Math.round(area)+"px", (super.getX()+super.getX1())/2,(super.getY()+super.getY1())/2);
    }

    @Override
    public void perimetro(Graphics g) {
        double perimetro = 2*base + 2*largura;
        g.drawString(""+Math.round(perimetro)+"px", (super.getX()+super.getX1())/2,super.getY());
    }
}
