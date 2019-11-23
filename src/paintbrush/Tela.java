/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.ColorModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import paintbrush.D0;

/**
 *
 * @author 09795410695
 */

/**progresso:
 * 
 * base do algoritmo
 * Pontos
 * Retas
 * 
 **/
public class Tela extends javax.swing.JFrame {

    Graphics g;//Modelo do painel de desenho
    int tipo = 0;//tipo de desenho escolhido
    boolean primeiro;//em desenhos de múltiplos pontos, indica se o ponto atual é o primeiro ou não
    int x0, y0;//x0 e y0 do primeiro ponto
    int valorRealTamanho;//valor do slide de tamanho
    int valorRealDensidade;//valor do slide de spary
    
    public Tela() {
        initComponents();
        this.g = this.painel.getGraphics();
        this.primeiro = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jToggleButton1 = new javax.swing.JToggleButton();
        jSlider1 = new javax.swing.JSlider();
        painel = new javax.swing.JPanel();
        Preencher = new java.awt.Checkbox();
        selecionaCor = new javax.swing.JColorChooser();
        corExterna = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        corInterna = new javax.swing.JPanel();
        pontos = new javax.swing.JButton();
        retas = new javax.swing.JButton();
        retangulo = new javax.swing.JButton();
        circulo = new javax.swing.JButton();
        cilindro = new javax.swing.JButton();
        spary = new javax.swing.JButton();
        borracha = new javax.swing.JButton();
        valorSlideTamanho = new javax.swing.JSlider();
        tamanho = new javax.swing.JLabel();
        distancia = new javax.swing.JRadioButton();
        area = new javax.swing.JRadioButton();
        diametro = new javax.swing.JRadioButton();
        volume = new javax.swing.JRadioButton();
        valorSlideDensidade = new javax.swing.JSlider();
        densidade = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PaintBrush");

        painel.setBackground(new java.awt.Color(255, 255, 193));
        painel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                painelMouseDragged(evt);
            }
        });
        painel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Preencher.setLabel("Preencher");

        corExterna.setBackground(new java.awt.Color(0, 0, 0));
        corExterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                corExternaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout corExternaLayout = new javax.swing.GroupLayout(corExterna);
        corExterna.setLayout(corExternaLayout);
        corExternaLayout.setHorizontalGroup(
            corExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        corExternaLayout.setVerticalGroup(
            corExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jLabel1.setText("Cor Externa:");

        jLabel2.setText("Cor Interna:");

        corInterna.setBackground(new java.awt.Color(255, 255, 153));
        corInterna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                corInternaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                corInternaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout corInternaLayout = new javax.swing.GroupLayout(corInterna);
        corInterna.setLayout(corInternaLayout);
        corInternaLayout.setHorizontalGroup(
            corInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        corInternaLayout.setVerticalGroup(
            corInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        pontos.setText("Pontos");
        pontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontosActionPerformed(evt);
            }
        });

        retas.setText("Retas");
        retas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retasActionPerformed(evt);
            }
        });

        retangulo.setText("Retângulo");
        retangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retanguloActionPerformed(evt);
            }
        });

        circulo.setText("Círculo");
        circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloActionPerformed(evt);
            }
        });

        cilindro.setText("Cilindro");
        cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroActionPerformed(evt);
            }
        });

        spary.setText("Spray");
        spary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparyActionPerformed(evt);
            }
        });

        borracha.setText("Borracha");
        borracha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrachaActionPerformed(evt);
            }
        });

        valorSlideTamanho.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                valorSlideTamanhoMouseDragged(evt);
            }
        });
        valorSlideTamanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                valorSlideTamanhoMouseReleased(evt);
            }
        });

        tamanho.setText("Tamanho(8)");

        distancia.setText("Distância");

        area.setText("Área");

        diametro.setText("Diâmetro");

        volume.setText("Volume");

        valorSlideDensidade.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                valorSlideDensidadeMouseDragged(evt);
            }
        });
        valorSlideDensidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                valorSlideDensidadeMouseReleased(evt);
            }
        });

        densidade.setText("Densidade(8)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorSlideTamanho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(volume)
                                            .addComponent(diametro)
                                            .addComponent(area)
                                            .addComponent(distancia)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(pontos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(borracha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(spary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cilindro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(retangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                .addComponent(retas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(tamanho)))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorSlideDensidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(densidade))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Preencher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(corExterna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(corInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selecionaCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pontos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(circulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cilindro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borracha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(area)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diametro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorSlideTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(densidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorSlideDensidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecionaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(corInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Preencher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseClicked
        switch(this.tipo){
            case 0://quando clica com o mouse e o tipo é 0 desenha um ponto na posição do clique
                D0 ponto = new D0(evt.getX(),evt.getY(),this.corExterna.getBackground());
                ponto.desenhar(g);
                break;
            case 1: 
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }//GEN-LAST:event_painelMouseClicked

    private void painelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMousePressed
        switch(this.tipo){
            case 0://quando pressiona o mouse e o tipo é 0 desenha um ponto na posição do clique
                D0 ponto = new D0(evt.getX(),evt.getY(),this.corExterna.getBackground());
                ponto.desenhar(g);
                break;
            case 1://Quando aperta o mouse e o tipo é 1, salva a pocição do evento            
                if(!primeiro)
                {
                    x0 = evt.getX();
                    y0 = evt.getY();
                    primeiro = true;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }//GEN-LAST:event_painelMousePressed

    private void painelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseDragged
        switch(this.tipo){
            case 0://quando arrasta o mouse pressionado e o tipo é 0 desenha um ponto nas posições que o mouse passou
                D0 ponto = new D0(evt.getX(),evt.getY(),this.corExterna.getBackground());
                ponto.desenhar(g);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }//GEN-LAST:event_painelMouseDragged

    private void pontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontosActionPerformed
        this.tipo = 0;//tipo de figura ponto
    }//GEN-LAST:event_pontosActionPerformed

    private void retasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retasActionPerformed
        this.tipo = 1;//tipo de figura reta
    }//GEN-LAST:event_retasActionPerformed

    private void retanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retanguloActionPerformed
        this.tipo = 2;//tipo de figura retangulo
    }//GEN-LAST:event_retanguloActionPerformed

    private void circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloActionPerformed
        this.tipo = 3;//tipo de figura circulo
    }//GEN-LAST:event_circuloActionPerformed

    private void cilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroActionPerformed
        this.tipo = 4;//tipo de figura cilindro
    }//GEN-LAST:event_cilindroActionPerformed

    private void sparyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparyActionPerformed
        this.tipo = 5;//tipo de figura spray
    }//GEN-LAST:event_sparyActionPerformed

    private void borrachaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrachaActionPerformed
        this.tipo = 6;//tipo de figura borracha
    }//GEN-LAST:event_borrachaActionPerformed

    private void corInternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corInternaMouseClicked
        this.corInterna.setBackground(this.selecionaCor.getColor());
    }//GEN-LAST:event_corInternaMouseClicked

    private void painelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseReleased
        switch(this.tipo){
            case 0://quando libera o mouse pressionado e o tipo é 0 desenha um ponto nas posição do evento
                D0 ponto = new D0(evt.getX(),evt.getY(),this.corExterna.getBackground());
                ponto.desenhar(g);
                break;
            case 1://Quando solta o mouse, desenha uma reta entre a posição salva e a atual                
                if(primeiro)
                {
                    int x1 = evt.getX();
                    int y1 = evt.getY();
                    if(((x1 - x0) > 2 || (y1 - y0) > 2) || ((x1 - x0) < -2 || (y1 - y0) < -2) )
                    {
                        D1 reta = new D1(x0,y0,x1,y1,this.corExterna.getBackground());
                        reta.desenhar(g);
                        if(this.distancia.isSelected())
                            reta.comprimento(g);
                    }
                    primeiro = false;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }//GEN-LAST:event_painelMouseReleased

    private void valorSlideTamanhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideTamanhoMouseReleased
        this.valorRealTamanho = Math.round(this.valorSlideTamanho.getValue()/6);
        this.tamanho.setText("Tamanho("+valorRealTamanho+")");
    }//GEN-LAST:event_valorSlideTamanhoMouseReleased

    private void valorSlideTamanhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideTamanhoMouseDragged
        this.valorRealTamanho = Math.round(this.valorSlideTamanho.getValue()/6);
        this.tamanho.setText("Tamanho("+valorRealTamanho+")");
    }//GEN-LAST:event_valorSlideTamanhoMouseDragged

    private void corExternaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corExternaMouseReleased
        //Ao liberar o mouse em cima desse painel seta a cor dele com a selecionada
        this.corExterna.setBackground(this.selecionaCor.getColor());
    }//GEN-LAST:event_corExternaMouseReleased

    private void corInternaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corInternaMouseReleased
        //Ao liberar o mouse em cima desse painel seta a cor dele com a selecionada
        this.corInterna.setBackground(this.selecionaCor.getColor());
    }//GEN-LAST:event_corInternaMouseReleased

    private void valorSlideDensidadeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideDensidadeMouseDragged
        this.valorRealDensidade = Math.round(this.valorSlideDensidade.getValue()/6);
        this.densidade.setText("Densidade("+valorRealDensidade+")");
    }//GEN-LAST:event_valorSlideDensidadeMouseDragged

    private void valorSlideDensidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideDensidadeMouseReleased
        this.valorRealDensidade = Math.round(this.valorSlideDensidade.getValue()/6);
        this.densidade.setText("Densidade("+valorRealDensidade+")");
    }//GEN-LAST:event_valorSlideDensidadeMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox Preencher;
    private javax.swing.JRadioButton area;
    private javax.swing.JButton borracha;
    private javax.swing.JButton cilindro;
    private javax.swing.JButton circulo;
    private javax.swing.JPanel corExterna;
    private javax.swing.JPanel corInterna;
    private javax.swing.JLabel densidade;
    private javax.swing.JRadioButton diametro;
    private javax.swing.JRadioButton distancia;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel painel;
    private javax.swing.JButton pontos;
    private javax.swing.JButton retangulo;
    private javax.swing.JButton retas;
    private javax.swing.JColorChooser selecionaCor;
    private javax.swing.JButton spary;
    private javax.swing.JLabel tamanho;
    private javax.swing.JSlider valorSlideDensidade;
    private javax.swing.JSlider valorSlideTamanho;
    private javax.swing.JRadioButton volume;
    // End of variables declaration//GEN-END:variables
}
