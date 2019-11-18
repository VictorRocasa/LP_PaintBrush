/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;

/**
 *
 * @author 09795410695
 */
public abstract class D2 extends D0{
    private Color corInterna;

    public D2(int x, int y, Color cor) {
        super(x, y, cor);
    }
    public abstract int area();
    public abstract int perimetro();
}
