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
public abstract class D3 extends D2{
    private int altura;

    public D3(int x, int y, int x1, int y1, Color corExterna, Color corInterna) {
        super(x, y, x1, y1, corExterna, corInterna);
    }

    public abstract void volume();
}
