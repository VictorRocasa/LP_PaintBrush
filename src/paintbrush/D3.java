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
public abstract class D3 extends D0{
    private int altura;

    public D3(int x, int y, Color cor) {
        super(x, y, cor);
    }
    public abstract int volume();
}
