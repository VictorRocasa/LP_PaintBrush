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
public abstract class D3 extends D2{
    private int altura;

    public D3(int x, int y, int x1, int y1, Color corExterna, Color corInterna) {
        super(x, y, x1, y1, corExterna, corInterna);
        this.altura = (y1-y);//calcula a altura
    }

    public abstract void volume(Graphics g);//calcula o volume 

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
}

