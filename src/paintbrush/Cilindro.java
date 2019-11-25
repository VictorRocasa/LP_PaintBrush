/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Graphics;

/**
 *
 * @author 09795410695
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 09795410695
 */
public class Cilindro extends D3{
    int base;
    int largura;
    int raio;
    Elipse eDECima;
    Elipse eDEBaixo;
    D1 retaDaEsquerda;
    D1 retaDaDireita;
    
   
    public Cilindro(int x, int y, int x1, int y1, Color corExterna, Color corInterna) {
        super(x, y, x1, y1, corExterna, corInterna);  
        largura = 10;
        base = x1-x;
        raio = base/2;
    }
    
    @Override
    public void desenhar(Graphics g){
        int x = super.getX();
        int y = super.getY();
        int x1 = super.getX1();
        int y1 = super.getY1();
        retaDaEsquerda = new D1(x,y+10,x,y1-10,super.getCor());
        retaDaDireita = new D1(x1,y+10,x1,y1-10,super.getCor());
        retaDaEsquerda.desenhar(g);
        retaDaDireita.desenhar(g);
        eDECima = new Elipse(x,y,x1,y+20,super.getCorInterna(),super.getCor());
        eDEBaixo = new Elipse(x,y1-20,x1,y1,super.getCorInterna(), super.getCor());
        eDEBaixo.desenhar(g, false);
        eDECima.desenhar(g, false);

    }  

    public void volume(Graphics g) {//calcula volume
        System.out.println("");
        double volume = (Math.PI * Math.pow(raio, 2)) * super.getAltura();
        g.drawString(""+Math.round(volume)+"px", (super.getX()+super.getX1())/2,(super.getY()+super.getY1())/2);
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