/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author 09795410695
 */
public class Spray extends D0{
    int raio;
    int densidade;

    public Spray(int x, int y, Color cor, int densidade, int raio) {
        super(x, y, cor);
        this.densidade = densidade;
        this.raio = raio*2;//diametro 
    }
    
    @Override
    public void desenhar(Graphics g){
        g.setColor(super.getCor());
        Random r = new Random();
        int X = super.getX();
        int Y = super.getY();
        for(int i = 0; i < densidade; i++)//plota vários pontos usando um raio de referencia
        { 
            int deslocamentoX = (int)Math.round(raio*(r.nextDouble()-0.5));
            int deslocamentoY = (int)Math.round(raio*(r.nextDouble()-0.5));
            g.drawLine(X+deslocamentoX,Y+deslocamentoY,X+deslocamentoX,Y+deslocamentoY);
        }
    }
}
