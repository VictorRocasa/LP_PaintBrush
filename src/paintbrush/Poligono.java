/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author 09795410695
 */
public class Poligono extends D2{
    ArrayList<D0> pontos = new ArrayList();
    
    public Poligono(int x, int y, int x1, int y1, Color corExterna, Color corInterna, ArrayList pontos) {
        super(x, y, x1, y1, corExterna, corInterna);
        this.pontos = pontos;
    }

    @Override
    public void desenhar(Graphics g){
        int[] xs = new int[pontos.size()+1];
        int[] ys = new int[pontos.size()+1];
        g.setColor(super.getCor());
        int i;
        for(i = 0; i < pontos.size(); i++)
        {
            xs[i] = pontos.get(i).getX();
            ys[i] = pontos.get(i).getY();
        }
            xs[i] = pontos.get(0).getX();
            ys[i] = pontos.get(0).getY();
        g.drawPolygon(xs, ys, pontos.size()+1);
        
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
