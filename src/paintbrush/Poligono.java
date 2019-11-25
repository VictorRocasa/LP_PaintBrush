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

    public void desenhar(Graphics g, boolean preencher){
        int[] xs = new int[pontos.size()];//pontos x do poligono
        int[] ys = new int[pontos.size()];//pontos y do poligono
        if(preencher)//se preencher selecionado preenche com a cor interna
        {
            g.setColor(super.getCorInterna());
            for(int i = 0; i < pontos.size(); i++)
            {
                xs[i] = pontos.get(i).getX();
                ys[i] = pontos.get(i).getY();
            }
            g.fillPolygon(xs, ys, pontos.size());
        }
        g.setColor(super.getCor());
        for(int i = 0; i < pontos.size(); i++)
        {
            xs[i] = pontos.get(i).getX();
            ys[i] = pontos.get(i).getY();
        }
        g.drawPolygon(xs, ys, pontos.size());
    }   
    
    @Override
    public void area(Graphics g) {//só está por herança mas não é utilizada
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void perimetro(Graphics g) {//só está por herança mas não é utilizada
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
