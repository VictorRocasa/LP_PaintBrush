/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import static java.awt.Color.BLACK;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.colorchooser.AbstractColorChooserPanel;

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
    int x0, y0;//x0 e y0 do primeiro ponto
    int valorRealTamanho;//valor do slide de tamanho
    int valorRealDensidade;//valor do slide de spary
    ArrayList<D0> pontosPoligono = new ArrayList();
    boolean poligono;
    
    public Tela() {
        initComponents();
        this.g = this.painel.getGraphics();
        this.valorRealTamanho = 16;
        this.valorRealDensidade = 16;
        this.poligono = false;
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
        selecionaCor = new javax.swing.JColorChooser();
        corExterna = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        corInterna = new javax.swing.JPanel();
        pontoBotao = new javax.swing.JButton();
        retaBotao = new javax.swing.JButton();
        retanguloBotao = new javax.swing.JButton();
        circuloBotao = new javax.swing.JButton();
        cilindroBotao = new javax.swing.JButton();
        sprayBotao = new javax.swing.JButton();
        borrachaBotao = new javax.swing.JButton();
        valorSlideTamanho = new javax.swing.JSlider();
        tamanho = new javax.swing.JLabel();
        distancia = new javax.swing.JRadioButton();
        area = new javax.swing.JRadioButton();
        perimetro = new javax.swing.JRadioButton();
        volume = new javax.swing.JRadioButton();
        valorSlideDensidade = new javax.swing.JSlider();
        densidade = new javax.swing.JLabel();
        preencher = new javax.swing.JRadioButton();
        poligonoBotao = new javax.swing.JButton();
        elipseBotao = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PaintBrush");
        setResizable(false);

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
            .addGap(0, 804, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );

        AbstractColorChooserPanel[] guias = selecionaCor.getChooserPanels();
        for (AbstractColorChooserPanel atual : guias)
        if(!atual.getDisplayName().equals("Amostras"))
        selecionaCor.removeChooserPanel(atual);

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
            .addGap(0, 83, Short.MAX_VALUE)
        );
        corExternaLayout.setVerticalGroup(
            corExternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jLabel1.setText("Cor Externa:");

        jLabel2.setText("Cor Interna:");

        corInterna.setBackground(new java.awt.Color(255, 255, 193));
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

        pontoBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapis.png"))); // NOI18N
        pontoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoBotaoActionPerformed(evt);
            }
        });

        retaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reta.png"))); // NOI18N
        retaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retaBotaoActionPerformed(evt);
            }
        });

        retanguloBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/retangulo.png"))); // NOI18N
        retanguloBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retanguloBotaoActionPerformed(evt);
            }
        });

        circuloBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/circulo.png"))); // NOI18N
        circuloBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloBotaoActionPerformed(evt);
            }
        });

        cilindroBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cilindroer.png"))); // NOI18N
        cilindroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroBotaoActionPerformed(evt);
            }
        });

        sprayBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spray.png"))); // NOI18N
        sprayBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprayBotaoActionPerformed(evt);
            }
        });

        borrachaBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borracha.png"))); // NOI18N
        borrachaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrachaBotaoActionPerformed(evt);
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

        tamanho.setText("Tamanho(20)");

        distancia.setText("Distância");

        area.setText("Área");

        perimetro.setText("Perimetro");

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

        densidade.setText("Densidade(58)");

        preencher.setText("Preencher");

        poligonoBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/poligono.png"))); // NOI18N
        poligonoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poligonoBotaoActionPerformed(evt);
            }
        });

        elipseBotao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/elipse.png"))); // NOI18N
        elipseBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elipseBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(elipseBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pontoBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cilindroBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(circuloBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retanguloBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retaBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(poligonoBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sprayBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrachaBotao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(124, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(distancia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(area)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(perimetro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(volume))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(corExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(corInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(preencher))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(tamanho))
                                    .addComponent(valorSlideTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorSlideDensidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(densidade)
                                        .addGap(20, 20, 20)))
                                .addGap(58, 58, 58)))
                        .addComponent(selecionaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(distancia)
                                    .addComponent(area)
                                    .addComponent(perimetro)
                                    .addComponent(volume))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(corExterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(corInterna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(preencher)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(densidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorSlideDensidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tamanho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valorSlideTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(selecionaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pontoBotao)
                        .addGap(18, 18, 18)
                        .addComponent(retaBotao)
                        .addGap(18, 18, 18)
                        .addComponent(retanguloBotao)
                        .addGap(18, 18, 18)
                        .addComponent(circuloBotao)
                        .addGap(18, 18, 18)
                        .addComponent(cilindroBotao)
                        .addGap(18, 18, 18)
                        .addComponent(poligonoBotao)
                        .addGap(18, 18, 18)
                        .addComponent(sprayBotao)
                        .addGap(18, 18, 18)
                        .addComponent(borrachaBotao)
                        .addGap(18, 18, 18)
                        .addComponent(elipseBotao)))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMousePressed
       //Salva a pocição inicial do evento quando pressiona o mouse
        x0 = evt.getX();
        y0 = evt.getY();
        if(tipo==5)
        {
                Spray spray = new Spray(evt.getX(),evt.getY(),this.corExterna.getBackground(),this.valorRealDensidade, this.valorRealTamanho);
                spray.desenhar(g); 
        }
    }//GEN-LAST:event_painelMousePressed

    private void painelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseDragged
        switch(this.tipo){//quando arrasta o mouse pressionado e 
            case 0://se o tipo é 0 desenha um ponto nas posições que o mouse passou
                D0 ponto = new D0(evt.getX(),evt.getY(),this.corExterna.getBackground());
                ponto.desenhar(g);
                break;
            case 1://tipo de figura reta
                break;
            case 2://tipo de figura retangulo
                break;
            case 3://tipo de figura circulo
                break;
            case 4://tipo de figura cilindro
                break;
            case 5://tipo de figura spray
                Spray spray = new Spray(evt.getX(),evt.getY(),this.corExterna.getBackground(),this.valorRealDensidade, this.valorRealTamanho);
                spray.desenhar(g);
                break;
            case 6://tipo de figura borracha
                int x = evt.getX();
                int y = evt.getY();
                Retangulo borracha = new Retangulo(x,y,x+valorRealTamanho,y+valorRealTamanho,this.painel.getBackground(),this.painel.getBackground());
                borracha.desenhar(g, true);
                break;
        }
    }//GEN-LAST:event_painelMouseDragged

    private void pontoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoBotaoActionPerformed
        this.tipo = 0;//tipo de figura ponto
    }//GEN-LAST:event_pontoBotaoActionPerformed

    private void retaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retaBotaoActionPerformed
        this.tipo = 1;//tipo de figura reta
    }//GEN-LAST:event_retaBotaoActionPerformed

    private void retanguloBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retanguloBotaoActionPerformed
        this.tipo = 2;//tipo de figura retangulo
    }//GEN-LAST:event_retanguloBotaoActionPerformed

    private void circuloBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloBotaoActionPerformed
        this.tipo = 3;//tipo de figura circulo
    }//GEN-LAST:event_circuloBotaoActionPerformed

    private void cilindroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroBotaoActionPerformed
        this.tipo = 4;//tipo de figura cilindro
    }//GEN-LAST:event_cilindroBotaoActionPerformed

    private void sprayBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprayBotaoActionPerformed
        this.tipo = 5;//tipo de figura spray
    }//GEN-LAST:event_sprayBotaoActionPerformed

    private void borrachaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrachaBotaoActionPerformed
        this.tipo = 6;//tipo de figura borracha
    }//GEN-LAST:event_borrachaBotaoActionPerformed

    private void corInternaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corInternaMouseClicked
        this.corInterna.setBackground(this.selecionaCor.getColor());
    }//GEN-LAST:event_corInternaMouseClicked

    private void painelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseReleased
            int x1 = evt.getX();//ponto x final
            int y1 = evt.getY();//ponto y final
            switch(this.tipo){//quando libera o mouse pressionado e 
            case 0://se o tipo é 0 desenha um ponto nas posição do evento
                D0 ponto = new D0(evt.getX(),evt.getY(),this.corExterna.getBackground());
                ponto.desenhar(g);
                break;
            case 1://se o tipo é 1 desenha uma reta entre a posição salva e a atual 
                if(((x1 - x0) > 2 || (y1 - y0) > 2) || ((x1 - x0) < -2 || (y1 - y0) < -2) )//evita fazer o dezenho 
                {                                                                         //numa distancia muito curta
                    D1 reta = new D1(x0,y0,x1,y1,this.corExterna.getBackground());
                    reta.desenhar(g);
                    if(this.distancia.isSelected())//verifica se a opção ditância esta selecionada
                        reta.comprimento(g);//chama a função que calcua a distâcia
                }
                break;
            case 2://se o tipo é 2 desenha um retangulo entre a posição salva e a atual
                if(((x1 - x0) > 2 || (y1 - y0) > 2) || ((x1 - x0) < -2 || (y1 - y0) < -2) )//evita fazer o desenho
                {                                                                         //numa distancia muito curta
                    if(x0 > x1)//trata a inverção de cor se puxar da direira pra esquerda
                    {
                        int aux = x1;
                        x1 = x0;
                        x0 = aux;
                    }
                    if(y0 > y1)//trata a inverção de cor se puxar de baixo pra cima
                    {
                        int aux = y1;
                        y1 = y0;
                        y0 = aux;
                    }
                    Retangulo retangulo = new Retangulo(x0,y0,x1,y1,this.corExterna.getBackground(),this.corInterna.getBackground());
                    retangulo.desenhar(g, this.preencher.isSelected());
                    if(this.area.isSelected())//verifica se a opção area esta selecionada
                        retangulo.area(g);//chama a função que calcua a area;
                    if(this.perimetro.isSelected())//verifica se a opção érimetro esta selecionada
                        retangulo.perimetro(g);//chama a função que calcua o perimetro
                }
                break;
            case 3://se o tipo é 3 desenha um círculo entre a posição salva e a atual
                if(((x1 - x0) > 2 || (y1 - y0) > 2) || ((x1 - x0) < -2 || (y1 - y0) < -2) )//evita fazer o desenho
                {                                                                         //numa distancia muito curta
                    if(x0 > x1)//trata a inverção de cor se puxar da direira pra esquerda
                    {
                        int aux = x1;
                        x1 = x0;
                        x0 = aux;
                    }
                    if(y0 > y1)//trata a inverção de cor se puxar de baixo pra cima
                    {
                        int aux = y1;
                        y1 = y0;
                        y0 = aux;
                    }
                    int desX = (x1-x0);
                    int desY = (y1-y0);
                    int raio = (desX+desY)/2;
                    Circulo circulo = new Circulo(x0,y0,x0+raio,y0+raio,this.corExterna.getBackground(),this.corInterna.getBackground());
                    circulo.desenhar(g, this.preencher.isSelected());
                    if(this.area.isSelected())//verifica se a opção area esta selecionada
                        circulo.area(g);//chama a função que calcua a area;
                    if(this.perimetro.isSelected())//verifica se a opção érimetro esta selecionada
                        circulo.perimetro(g);//chama a função que calcua o perimetro
                }
                break;
            case 4://se o tipo é 4 desenha um cilindro entre a posição salva e a atual
             if(((x1 - x0) > 2 || (y1 - y0) > 2) || ((x1 - x0) < -2 || (y1 - y0) < -2) )//evita fazer o desenho
                {                                                                      //numa distancia muito curta
                    if(x0 > x1)//trata a inverção de cor se puxar da direira pra esquerda
                    {
                        int aux = x1;
                        x1 = x0;
                        x0 = aux;
                    }
                    if(y0 > y1)//trata a inverção de cor se puxar de baixo pra cima
                    {
                        int aux = y1;
                        y1 = y0;
                        y0 = aux;
                    }
                    Cilindro cilindro = new Cilindro(x0,y0,x1,y1,this.corExterna.getBackground(),this.corExterna.getBackground());
                    cilindro.desenhar(g);
                    if(this.volume.isSelected())//verifica se a opção volume esta selecionada
                        cilindro.volume(g);//chama a função que calcua o volume
                }
                break;
            case 8://se o tipo é 8 desenha uma elipse entre a posição salva e a atual
                if(((x1 - x0) > 2 || (y1 - y0) > 2) || ((x1 - x0) < -2 || (y1 - y0) < -2) )//evita fazer o desenho
                {                                                                         //numa distancia muito curta
                    if(x0 > x1)//trata a inverção de cor se puxar da direira pra esquerda
                    {
                        int aux = x1;
                        x1 = x0;
                        x0 = aux;
                    }
                    if(y0 > y1)//trata a inverção de cor se puxar de baixo pra cima
                    {
                        int aux = y1;
                        y1 = y0;
                        y0 = aux;
                    }
                    Elipse elipse = new Elipse(x0,y0,x1,y1,this.corExterna.getBackground(),this.corInterna.getBackground());
                    elipse.desenhar(g, this.preencher.isSelected());
                }
        }
    }//GEN-LAST:event_painelMouseReleased

    private void valorSlideTamanhoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideTamanhoMouseReleased
        this.valorRealTamanho = Math.round(8+this.valorSlideTamanho.getValue()/4);
        this.tamanho.setText("Tamanho("+(valorRealTamanho)+")");
    }//GEN-LAST:event_valorSlideTamanhoMouseReleased

    private void valorSlideTamanhoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideTamanhoMouseDragged
        this.valorRealTamanho = Math.round(8+this.valorSlideTamanho.getValue()/4);
        this.tamanho.setText("Tamanho("+(valorRealTamanho)+")");
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
        this.valorRealDensidade = Math.round(8+this.valorSlideDensidade.getValue());
        this.densidade.setText("Densidade("+valorRealDensidade+")");
    }//GEN-LAST:event_valorSlideDensidadeMouseDragged

    private void valorSlideDensidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorSlideDensidadeMouseReleased
        this.valorRealDensidade = Math.round(8+this.valorSlideDensidade.getValue());
        this.densidade.setText("Densidade("+valorRealDensidade+")");
    }//GEN-LAST:event_valorSlideDensidadeMouseReleased

    private void poligonoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poligonoBotaoActionPerformed
        this.tipo = 7;//se o tipo é 7 desenha um poligono ligando os pontos de uma lista de pontos salva
        if(!this.poligono)//usado para detectar q vc selecionou a opção poligono
            this.poligono = true;
        else
        {
            if(this.pontosPoligono.size() > 0)//usado para detectar q vc clicou pela segunda vez no poligono
            {                                //informando assim q vc terinou de marcar os pontos
               this.poligono = false;
               Poligono p = new Poligono(0,0,0,0,this.corExterna.getBackground(),BLACK,this.pontosPoligono);
               p.desenhar(g);//plota o poligono
               this.pontosPoligono.clear();  
            }
        }
    }//GEN-LAST:event_poligonoBotaoActionPerformed

    private void painelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseClicked
        int X = evt.getX();
        int Y = evt.getY();
        if(this.poligono)
        {
            D0 ponto = new D0(X,Y,this.corExterna.getBackground());
            ponto.desenhar(g);
            this.pontosPoligono.add(ponto);
        }
    }//GEN-LAST:event_painelMouseClicked

    private void elipseBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elipseBotaoActionPerformed
        //tipo 8 = elipse
        this.tipo = 8;
    }//GEN-LAST:event_elipseBotaoActionPerformed

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
    private javax.swing.JRadioButton area;
    private javax.swing.JButton borrachaBotao;
    private javax.swing.JButton cilindroBotao;
    private javax.swing.JButton circuloBotao;
    private javax.swing.JPanel corExterna;
    private javax.swing.JPanel corInterna;
    private javax.swing.JLabel densidade;
    private javax.swing.JRadioButton distancia;
    private javax.swing.JButton elipseBotao;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel painel;
    private javax.swing.JRadioButton perimetro;
    private javax.swing.JButton poligonoBotao;
    private javax.swing.JButton pontoBotao;
    private javax.swing.JRadioButton preencher;
    private javax.swing.JButton retaBotao;
    private javax.swing.JButton retanguloBotao;
    private javax.swing.JColorChooser selecionaCor;
    private javax.swing.JButton sprayBotao;
    private javax.swing.JLabel tamanho;
    private javax.swing.JSlider valorSlideDensidade;
    private javax.swing.JSlider valorSlideTamanho;
    private javax.swing.JRadioButton volume;
    // End of variables declaration//GEN-END:variables
}
