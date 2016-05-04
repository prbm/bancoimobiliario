/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobancoimobiliario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Paulo
 */
public class Tabuleiro extends javax.swing.JFrame {

    /**
     * Creates new form Tabuleiro
     */
    public Tabuleiro() {
        initComponents();
        // configura as casas que são usadas no tabuleiro;
        configuraCasasTabuleiro();
        // definir o array de labels que são as casas do jogo
        definirArrayLabels();

        // pode ser mais útil transformar os jogadores em coleção, veremos mais adiante
        j1 = new Jogador("Jogador 1", "Preto");
        j2 = new Jogador("Jogador 2", "Branco");

        // já informa no label qual é o jogador que está jogando
        jlJogadorTurno.setText(j1.getNome());

        // inicia os dados do jogo
        rodada = 1;
        branco = 0;
        preto = 0;
        ocupado = 0;
        ocupadoBranco = 0;
        ocupadoPreto = 0;
        dado = new Dado();
    }

    private void configuraCasasTabuleiro() {

        //Coloquei para iniciar casa por casa assim quando chegarem as imagens só vou trocar os valores
        casas.add(new Casa(false, 0, 0, 0, 0, 0, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 1, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 2, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 3, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 4, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 5, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 6, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 7, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 8, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 9, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 10, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 11, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 12, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 13, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 14, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 15, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 16, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 17, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 18, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 19, "b"));
        casas.add(new Casa(true, 100, 10, 10, 100, 20, "b"));

        System.out.println("Foram configuradas " + casas.size() + " casas");

        for (int i = 0; i < 21; i++) {
            Casa c = casas.get(i);
            System.out.println("Casa" + String.format("%03d", i) + "," + c.isPodeComprar() + "," + c.getAluguel());
        }
    }

    private void definirArrayLabels() {
        labels.add(null);
        labels.add(jlCasa1);
        labels.add(jlCasa2);
        labels.add(jlCasa3);
        labels.add(jlCasa4);
        labels.add(jlCasa5);
        labels.add(jlCasa6);
        labels.add(jlCasa7);
        labels.add(jlCasa8);
        labels.add(jlCasa9);
        labels.add(jlCasa10);
        labels.add(jlCasa11);
        labels.add(jlCasa12);
        labels.add(jlCasa13);
        labels.add(jlCasa14);
        labels.add(jlCasa15);
        labels.add(jlCasa16);
        labels.add(jlCasa17);
        labels.add(jlCasa18);
        labels.add(jlCasa19);
        labels.add(jlCasa20);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlJogadorTurno = new javax.swing.JLabel();
        jbJogar = new javax.swing.JButton();
        jbComprar = new javax.swing.JButton();
        jlCasa9 = new javax.swing.JLabel();
        jlCasa2 = new javax.swing.JLabel();
        jlCasa11 = new javax.swing.JLabel();
        jlCasa4 = new javax.swing.JLabel();
        jlDadoRolado = new javax.swing.JLabel();
        jlCasa5 = new javax.swing.JLabel();
        jlCasa10 = new javax.swing.JLabel();
        jlCasa7 = new javax.swing.JLabel();
        jlCasa20 = new javax.swing.JLabel();
        jlCasa1 = new javax.swing.JLabel();
        jlCasa6 = new javax.swing.JLabel();
        jlCasa3 = new javax.swing.JLabel();
        jlCasa12 = new javax.swing.JLabel();
        jlCasa13 = new javax.swing.JLabel();
        jlCasa14 = new javax.swing.JLabel();
        jlCasa15 = new javax.swing.JLabel();
        jlCasa16 = new javax.swing.JLabel();
        jlCasa17 = new javax.swing.JLabel();
        jlCasa18 = new javax.swing.JLabel();
        jlCasa19 = new javax.swing.JLabel();
        jlCasa8 = new javax.swing.JLabel();
        jlValorDado = new javax.swing.JLabel();
        jlSaldo = new javax.swing.JLabel();
        jbVender = new javax.swing.JButton();
        jlNumeroCasa = new javax.swing.JLabel();
        jTFNumeroCasa = new javax.swing.JTextField();
        jlComprarVender = new javax.swing.JLabel();
        jTFComprarVender = new javax.swing.JTextField();
        jlValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(678, 427));
        setSize(new java.awt.Dimension(66, 0));

        jlJogadorTurno.setText("Vez do Jogador:");

        jbJogar.setText("Jogar");
        jbJogar.setAutoscrolls(true);
        jbJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJogarActionPerformed(evt);
            }
        });

        jbComprar.setText("Comprar");
        jbComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComprarActionPerformed(evt);
            }
        });

        jlCasa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa001.png"))); // NOI18N
        jlCasa9.setText("Casa 9");

        jlCasa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa002.png"))); // NOI18N
        jlCasa2.setText("Casa 2");

        jlCasa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa003.png"))); // NOI18N
        jlCasa11.setText("Casa 11");

        jlCasa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa004.png"))); // NOI18N
        jlCasa4.setText("Casa 4");

        jlDadoRolado.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jlDadoRolado.setForeground(new java.awt.Color(153, 0, 0));
        jlDadoRolado.setText("999");
        jlDadoRolado.setMaximumSize(new java.awt.Dimension(100, 100));
        jlDadoRolado.setMinimumSize(new java.awt.Dimension(100, 100));

        jlCasa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa001.png"))); // NOI18N
        jlCasa5.setText("Casa 5");

        jlCasa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa002.png"))); // NOI18N
        jlCasa10.setText("Casa 10");

        jlCasa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa003.png"))); // NOI18N
        jlCasa7.setText("Casa 7");

        jlCasa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa004.png"))); // NOI18N
        jlCasa20.setText("Casa 20");

        jlCasa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa001.png"))); // NOI18N
        jlCasa1.setText("Casa 1");

        jlCasa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa002.png"))); // NOI18N
        jlCasa6.setText("Casa 6");

        jlCasa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa003.png"))); // NOI18N
        jlCasa3.setText("Casa 3");

        jlCasa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa004.png"))); // NOI18N
        jlCasa12.setText("Casa 12");

        jlCasa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa001.png"))); // NOI18N
        jlCasa13.setText("Casa 13");

        jlCasa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa002.png"))); // NOI18N
        jlCasa14.setText("Casa 14");

        jlCasa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa003.png"))); // NOI18N
        jlCasa15.setText("Casa 15");

        jlCasa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa004.png"))); // NOI18N
        jlCasa16.setText("Casa 16");

        jlCasa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa001.png"))); // NOI18N
        jlCasa17.setText("Casa 17");

        jlCasa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa002.png"))); // NOI18N
        jlCasa18.setText("Casa 18");

        jlCasa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa003.png"))); // NOI18N
        jlCasa19.setText("Casa 19");

        jlCasa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa004.png"))); // NOI18N
        jlCasa8.setText("Casa 8");

        jlValorDado.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jlValorDado.setText("Valor do Dado:");

        jlSaldo.setText("Saldo:");

        jbVender.setText("Vender");
        jbVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVenderActionPerformed(evt);
            }
        });

        jlNumeroCasa.setText("Número Casa:");

        jTFNumeroCasa.setEditable(false);

        jlComprarVender.setText("Comprar/Vender:");

        jTFComprarVender.setEditable(false);

        jlValor.setText("Valor:");

        jTFValor.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCasa19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCasa18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCasa20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlValorDado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlDadoRolado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCasa6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCasa10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCasa8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCasa13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlJogadorTurno)
                            .addComponent(jlSaldo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbJogar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbComprar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbVender)))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNumeroCasa)
                            .addComponent(jlComprarVender)
                            .addComponent(jlValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNumeroCasa, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jTFComprarVender)
                            .addComponent(jTFValor))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlJogadorTurno)
                    .addComponent(jlNumeroCasa)
                    .addComponent(jTFNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlComprarVender)
                            .addComponent(jTFComprarVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlValor)
                            .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSaldo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbJogar)
                            .addComponent(jbComprar)
                            .addComponent(jbVender))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorDado)
                    .addComponent(jlDadoRolado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCasa10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCasa11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlDadoRolado.getAccessibleContext().setAccessibleDescription("");
        jbVender.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJogarActionPerformed

        String imagemCasaOcupada = null;
        String nroCasaFutura; // armazena a casa para onde o jogador vai
        String nroCasaSaindo; // armazena a casa de onde o jogador vems
        JLabel lbl;

        System.out.println("Avaliar Rodada");

        if (rodada % 2 != 0) {
            jogadorVez = j1;
        } else {
            jogadorVez = j2;
        }

        // atualiza as informações sobre de quem é a vez de jogar
        int casasAndar = dado.rolarDados();
        jlDadoRolado.setText(String.valueOf(casasAndar));
        jlJogadorTurno.setText(jogadorVez.getNome());
        jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
        jlJogadorTurno.updateUI();

        // desocupa a casa da qual está saindo
        casas.get(jogadorVez.getNumeroCasa()).desocuparCasa(jogadorVez);

        // ajusta os nomes das casas sendo desocupadas
        nroCasaSaindo = String.format("%03d", jogadorVez.getNumeroCasa());
        String imagemCasa = null;
        lbl = labels.get(jogadorVez.getNumeroCasa());

        // verifica os jogadores que ficaram na casa e formata o nome da imagem a ser exibida
        if (casas.get(jogadorVez.getNumeroCasa()).getJogadoresOcupandoCasa().size() > 0) {
            imagemCasa = "/imagens/Casa" + nroCasaSaindo + "_Ocupada_" + 
                    casas.get(jogadorVez.getNumeroCasa()).getJogadoresOcupandoCasa().get(0).getCor() + ".png";
        } else if (casas.get(jogadorVez.getNumeroCasa()).getJogadoresOcupandoCasa().isEmpty()) {
            imagemCasa = "/imagens/Casa" + nroCasaSaindo + ".png";
        }

        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagemCasa)));

        // verifica por quantas casas vai andar
        for (int i = 1; i <= casasAndar; i++) {
            // se chegar ao fim das casas, retorna à casa 1
            if (jogadorVez.getNumeroCasa() >= 20) {
                jogadorVez.setNumeroCasa(1);
                break; // se voltou ao início, pode sair do loop
            } else {
                jogadorVez.setNumeroCasa(jogadorVez.getNumeroCasa() + 1);
            }
        }

        // identifica a casa que está sendo ocupada
        ocupado = jogadorVez.getNumeroCasa();

        // mostra as informações da casa ocupada
        Casa c = casas.get(ocupado);
        c.ocuparCasa(jogadorVez);
        nroCasaFutura = String.format("%03d", jogadorVez.getNumeroCasa());

        // apresenta as informações da casa
        jTFNumeroCasa.setText(String.valueOf(c.getNumeroCasa()));
        jTFValor.setText(String.valueOf(c.getAluguel()));
        if (c.isPodeComprar()) {
            jTFComprarVender.setText("COMPRAR");
        } else {
            jTFComprarVender.setText("VENDER");
        }

        // verifica os jogadores que ocupam a casa e formata o nome da imagem a ser exibida
        if (c.getJogadoresOcupandoCasa().size() > 1) {
            imagemCasaOcupada = "/imagens/Casa" + nroCasaFutura + "_Ocupada_Dois.png";
        } else if (c.getJogadoresOcupandoCasa().size() == 1) {
            imagemCasaOcupada = "/imagens/Casa" + nroCasaFutura + "_Ocupada_" + jogadorVez.getCor() + ".png";
        }
        // informa as configurações
        System.out.println("Caminho da imagem Ocupado: " + imagemCasaOcupada);
        System.out.println("Caminho da imagem Casa: " + imagemCasa);

        // atualiza as casas ocupadas
        lbl = labels.get(c.getNumeroCasa());
        lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagemCasaOcupada)));

        // atualiza a rodada
        rodada++;
    }//GEN-LAST:event_jbJogarActionPerformed

    private void jbComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComprarActionPerformed

        // atualiza a interface de usuário com o jogador que está jogando
        jlJogadorTurno.setText(jogadorVez.getNome());

        // lê o número da casa em que o jogador se encontra
        int numeroCasa = jogadorVez.getNumeroCasa();
        // lê o valor da compra que a casa possui

        double valorCompra = casas.get(numeroCasa).getCompra();
        // atualiza o saldo do jogador

        //Verifica se a casa pode ser comprada
        if (casas.get(numeroCasa).isPodeComprar()) {
            //Verifica se a casa pertence ao banco 
            if (casas.get(numeroCasa).getPertence() == "b") {

                jogadorVez.setSaldo((jogadorVez.getSaldo() - valorCompra));

                System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());

                // atualiza a interface de usuário com as informações atualizadas
                jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
                jlJogadorTurno.updateUI();
                casas.get(numeroCasa).setPodeComprar(false);
                casas.get(numeroCasa).setPertence(jogadorVez.getNome());
            }
        } else {
            System.out.println("Pertence ao outro jogador ");
        }

    }//GEN-LAST:event_jbComprarActionPerformed

    private void jbVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVenderActionPerformed
        // atualiza a interface de usuário com o jogador que está jogando
        jlJogadorTurno.setText(jogadorVez.getNome());

        // lê o número da casa em que o jogador se encontra
        int numeroCasa = jogadorVez.getNumeroCasa();
        // lê o valor da compra que a casa possui
        double valorVenda = casas.get(numeroCasa).getCompra();
        // atualiza o saldo do jogador

        //Verifica se a casa pode ser vendida
        if (casas.get(numeroCasa).isPodeComprar()) {
            System.out.println("Não pode vender ");
        } else if (jogadorVez.getNome() == casas.get(numeroCasa).getPertence()) {
            jogadorVez.setSaldo((jogadorVez.getSaldo() + valorVenda));

            System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());

            // atualiza a interface de usuário com as informações atualizadas
            jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
            jlJogadorTurno.updateUI();
            casas.get(numeroCasa).setPodeComprar(true);
            casas.get(numeroCasa).setPertence("b");
        } else {
            System.out.println("Somente o dono pode vender ");
        }


    }//GEN-LAST:event_jbVenderActionPerformed

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
            java.util.logging.Logger.getLogger(Tabuleiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuleiro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuleiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTFComprarVender;
    private javax.swing.JTextField jTFNumeroCasa;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JButton jbComprar;
    private javax.swing.JButton jbJogar;
    private javax.swing.JButton jbVender;
    private javax.swing.JLabel jlCasa1;
    private javax.swing.JLabel jlCasa10;
    private javax.swing.JLabel jlCasa11;
    private javax.swing.JLabel jlCasa12;
    private javax.swing.JLabel jlCasa13;
    private javax.swing.JLabel jlCasa14;
    private javax.swing.JLabel jlCasa15;
    private javax.swing.JLabel jlCasa16;
    private javax.swing.JLabel jlCasa17;
    private javax.swing.JLabel jlCasa18;
    private javax.swing.JLabel jlCasa19;
    private javax.swing.JLabel jlCasa2;
    private javax.swing.JLabel jlCasa20;
    private javax.swing.JLabel jlCasa3;
    private javax.swing.JLabel jlCasa4;
    private javax.swing.JLabel jlCasa5;
    private javax.swing.JLabel jlCasa6;
    private javax.swing.JLabel jlCasa7;
    private javax.swing.JLabel jlCasa8;
    private javax.swing.JLabel jlCasa9;
    private javax.swing.JLabel jlComprarVender;
    private javax.swing.JLabel jlDadoRolado;
    private javax.swing.JLabel jlJogadorTurno;
    private javax.swing.JLabel jlNumeroCasa;
    private javax.swing.JLabel jlSaldo;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlValorDado;
    // End of variables declaration//GEN-END:variables
    private Jogador j1, j2;
    private Dado dado;
    private int rodada, branco, preto, ocupado, ocupadoBranco, ocupadoPreto;

    // declaração da relação de todas as casas que existem no tabuleiro
    private List<Casa> casas = new ArrayList<Casa>();
    // declaração da relação de todos os labels de casa
    private List<JLabel> labels = new ArrayList<JLabel>();
    // cria uma variável global, para verificar qual é o jogador que está jogando
    private Jogador jogadorVez;
}
