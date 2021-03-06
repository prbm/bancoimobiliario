/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.entidades.Jogador;
import br.org.recresiduos.uteis.Arredonda;
import br.org.recresiduos.uteis.MascaraValor;

/**
 *
 * @author Thays
 */
public class GameOver extends javax.swing.JDialog {

    /**
     * Creates new form GameOver
     */
    public GameOver(java.awt.Frame parent, boolean modal, Jogador[] j) {
        super(parent, modal);
        initComponents();
        
        // define a core de fundo dos panels com a mesma cor do fundo principal
        jPGanhador.setBackground(jPFundo.getBackground());
        jPSegundo.setBackground(jPFundo.getBackground());
        jPTerceiro.setBackground(jPFundo.getBackground());
        jPQuarto.setBackground(jPFundo.getBackground());

        // verifica a quantidade de jogadores, e somente mostra 
//        //habilitar os jpanels
//        jPSegundo.setVisible(false);
//        jPTerceiro.setVisible(false);
//        jPQuarto.setVisible(false);
        // copia os jogadores que foram criados na tela anterior
        this.jogadores = j;
        ordenar();

    }

    private void ordenar() {
        //aray temporario    
        Jogador[] jog = new Jogador[4];

        //Copia somemente as posições que não estão nulas
        for (int i = 0; i < 4; i++) {
            if (jogadores[i] == null) {
                jog[i] = new Jogador("",null,null);
                jog[i].setSaldo(-10);
            } else {
                jog[i] = jogadores[i];
                double saldo = jog[i].getSaldo();
                jog[i].setSaldo(new Arredonda(saldo).valorArredondado());
            }
        }

        // faz o sort pelo saldo
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 3; b++) {
                //se um dos jogadores for nulo, aborta o restante
                if (jog[b].getSaldo() > jog[b + 1].getSaldo()) {
                    Jogador j = jog[b + 1];
                    jog[b + 1] = jog[b];
                    jog[b] = j;
                }
            }
        }

        // formata o fundo dos panels com a mesma cor do label principal,
        // para que fiquem visíveis
        if(!jog[0].getNome().trim().isEmpty()){
            jPQuarto.setBackground(jLFimJogo.getBackground());
            jLJogadorQua.setText("Jogador: " + jog[0].getNome());
            jLSaldoQua.setText(new MascaraValor(jog[0].getSaldo()).numeroFormatado());
        }

        if(!jog[1].getNome().trim().isEmpty()){
            jPTerceiro.setBackground(jLFimJogo.getBackground());
            jLJogadorTer.setText("Jogador: " + jog[1].getNome());
            jLSaldoTer.setText(new MascaraValor(jog[1].getSaldo()).numeroFormatado());
        }

        if(!jog[2].getNome().trim().isEmpty()){
            jPSegundo.setBackground(jLFimJogo.getBackground());
            jLJogadorSeg.setText("Jogador: " + jog[2].getNome());
            jLSaldoSeg.setText(new MascaraValor(jog[2].getSaldo()).numeroFormatado());
        }

        if(!jog[3].getNome().trim().isEmpty()){
            jPGanhador.setBackground(jLFimJogo.getBackground());
            jLJogadorGanhador.setText("Jogador: " + jog[3].getNome());
            jLSaldoGanhador.setText(new MascaraValor(jog[3].getSaldo()).numeroFormatado());
        }
//        
//        if (jog[3] != null) {
//            //habilitar os jpanels
//            jPSegundo.setVisible(true);
//            jPTerceiro.setVisible(true);
//            jPQuarto.setVisible(true);
//
//            jLJogadorGanhador.setText("Jogador: " + jog[3].getNome());
//            jLSaldoGanhador.setText(String.valueOf(jog[3].getSaldo()));
//
//            jLJogadorSeg.setText("Jogador: " + jog[2].getNome());
//            jLSaldoSeg.setText(String.valueOf(jog[2].getSaldo()));
//
//            jLJogadorTer.setText("Jogador: " + jog[1].getNome());
//            jLSaldoTer.setText(String.valueOf(jog[1].getSaldo()));
//
//            jLJogadorQua.setText("Jogador: " + jog[0].getNome());
//            jLSaldoQua.setText(String.valueOf(jog[0].getSaldo()));
//        }
//
//        if (jog[2] != null) {
//
//            //habilitar os jpanels
//            jPSegundo.setVisible(true);
//            jPTerceiro.setVisible(true);
//
//            jLJogadorGanhador.setText("Jogador: " + jog[2].getNome());
//            jLSaldoGanhador.setText(String.valueOf(jog[2].getSaldo()));
//
//            jLJogadorSeg.setText("Jogador: " + jog[1].getNome());
//            jLSaldoSeg.setText(String.valueOf(jog[1].getSaldo()));
//
//            jLJogadorTer.setText("Jogador: " + jog[0].getNome());
//            jLSaldoTer.setText(String.valueOf(jog[0].getSaldo()));
//        }
//
//        if (jog[1] != null) {
//
//            //habilitar os jpanels
//            jPSegundo.setVisible(true);
//
//            jLJogadorGanhador.setText("Jogador: " + jog[1].getNome());
//            jLSaldoGanhador.setText(String.valueOf(jog[1].getSaldo()));
//
//            jLJogadorSeg.setText("Jogador: " + jog[0].getNome());
//            jLSaldoSeg.setText(String.valueOf(jog[0].getSaldo()));
//        } else {
//            jLJogadorGanhador.setText("Jogador: " + jog[0].getNome());
//            jLSaldoGanhador.setText(String.valueOf(jog[0].getSaldo()));
//        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPFundo = new javax.swing.JPanel();
        jLFimJogo = new javax.swing.JLabel();
        jPGanhador = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLJogadorGanhador = new javax.swing.JLabel();
        jLSaldoGanhador = new javax.swing.JLabel();
        jPSegundo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLJogadorSeg = new javax.swing.JLabel();
        jLSaldoSeg = new javax.swing.JLabel();
        jPQuarto = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLJogadorQua = new javax.swing.JLabel();
        jLSaldoQua = new javax.swing.JLabel();
        jPTerceiro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLJogadorTer = new javax.swing.JLabel();
        jLSaldoTer = new javax.swing.JLabel();
        jBNovoJogo = new javax.swing.JButton();
        jBEncerrar = new javax.swing.JButton();

        jLabel17.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Quarto");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(26, 64, 35));
        setMaximumSize(new java.awt.Dimension(370, 348));
        setMinimumSize(new java.awt.Dimension(370, 348));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(370, 348));

        jPFundo.setBackground(new java.awt.Color(26, 64, 35));
        jPFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPFundo.setForeground(new java.awt.Color(26, 64, 35));
        jPFundo.setMaximumSize(new java.awt.Dimension(370, 348));
        jPFundo.setMinimumSize(new java.awt.Dimension(370, 348));
        jPFundo.setPreferredSize(new java.awt.Dimension(370, 348));

        jLFimJogo.setBackground(new java.awt.Color(161, 165, 108));
        jLFimJogo.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLFimJogo.setForeground(new java.awt.Color(26, 64, 35));
        jLFimJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLFimJogo.setText("Fim de Jogo");
        jLFimJogo.setMaximumSize(new java.awt.Dimension(322, 40));
        jLFimJogo.setMinimumSize(new java.awt.Dimension(322, 40));
        jLFimJogo.setOpaque(true);
        jLFimJogo.setPreferredSize(new java.awt.Dimension(322, 40));

        jPGanhador.setBackground(new java.awt.Color(255, 255, 255));
        jPGanhador.setMaximumSize(new java.awt.Dimension(158, 97));
        jPGanhador.setMinimumSize(new java.awt.Dimension(158, 97));
        jPGanhador.setPreferredSize(new java.awt.Dimension(158, 97));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 64, 35));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ganhador");

        jLJogadorGanhador.setForeground(new java.awt.Color(26, 64, 35));
        jLJogadorGanhador.setText("Jogador: Sem Jogador");

        jLSaldoGanhador.setForeground(new java.awt.Color(26, 64, 35));
        jLSaldoGanhador.setText("Saldo:");

        javax.swing.GroupLayout jPGanhadorLayout = new javax.swing.GroupLayout(jPGanhador);
        jPGanhador.setLayout(jPGanhadorLayout);
        jPGanhadorLayout.setHorizontalGroup(
            jPGanhadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGanhadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPGanhadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLJogadorGanhador)
                    .addComponent(jLSaldoGanhador))
                .addContainerGap())
        );
        jPGanhadorLayout.setVerticalGroup(
            jPGanhadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGanhadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLJogadorGanhador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSaldoGanhador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPSegundo.setBackground(new java.awt.Color(255, 255, 255));
        jPSegundo.setMaximumSize(new java.awt.Dimension(158, 97));
        jPSegundo.setMinimumSize(new java.awt.Dimension(158, 97));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 64, 35));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Segundo");

        jLJogadorSeg.setForeground(new java.awt.Color(26, 64, 35));
        jLJogadorSeg.setText("Jogador: Sem Jogador");

        jLSaldoSeg.setForeground(new java.awt.Color(26, 64, 35));
        jLSaldoSeg.setText("Saldo:");

        javax.swing.GroupLayout jPSegundoLayout = new javax.swing.GroupLayout(jPSegundo);
        jPSegundo.setLayout(jPSegundoLayout);
        jPSegundoLayout.setHorizontalGroup(
            jPSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPSegundoLayout.createSequentialGroup()
                        .addGroup(jPSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLJogadorSeg)
                            .addComponent(jLSaldoSeg))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPSegundoLayout.setVerticalGroup(
            jPSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLJogadorSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSaldoSeg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPQuarto.setBackground(new java.awt.Color(255, 255, 255));
        jPQuarto.setMaximumSize(new java.awt.Dimension(158, 97));
        jPQuarto.setMinimumSize(new java.awt.Dimension(158, 97));
        jPQuarto.setPreferredSize(new java.awt.Dimension(158, 97));

        jLabel14.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(26, 64, 35));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Quarto");

        jLJogadorQua.setForeground(new java.awt.Color(26, 64, 35));
        jLJogadorQua.setText("Jogador: Sem Jogador");

        jLSaldoQua.setForeground(new java.awt.Color(26, 64, 35));
        jLSaldoQua.setText("Saldo:");

        javax.swing.GroupLayout jPQuartoLayout = new javax.swing.GroupLayout(jPQuarto);
        jPQuarto.setLayout(jPQuartoLayout);
        jPQuartoLayout.setHorizontalGroup(
            jPQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPQuartoLayout.createSequentialGroup()
                        .addGroup(jPQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLJogadorQua)
                            .addComponent(jLSaldoQua))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPQuartoLayout.setVerticalGroup(
            jPQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLJogadorQua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSaldoQua)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPTerceiro.setBackground(new java.awt.Color(255, 255, 255));
        jPTerceiro.setMaximumSize(new java.awt.Dimension(158, 97));
        jPTerceiro.setMinimumSize(new java.awt.Dimension(158, 97));
        jPTerceiro.setPreferredSize(new java.awt.Dimension(158, 97));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 64, 35));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Terceiro");

        jLJogadorTer.setForeground(new java.awt.Color(26, 64, 35));
        jLJogadorTer.setText("Jogador: Sem Jogador");

        jLSaldoTer.setForeground(new java.awt.Color(26, 64, 35));
        jLSaldoTer.setText("Saldo:");

        javax.swing.GroupLayout jPTerceiroLayout = new javax.swing.GroupLayout(jPTerceiro);
        jPTerceiro.setLayout(jPTerceiroLayout);
        jPTerceiroLayout.setHorizontalGroup(
            jPTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTerceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPTerceiroLayout.createSequentialGroup()
                        .addGroup(jPTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLJogadorTer)
                            .addComponent(jLSaldoTer))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPTerceiroLayout.setVerticalGroup(
            jPTerceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTerceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLJogadorTer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSaldoTer)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jBNovoJogo.setMnemonic('j');
        jBNovoJogo.setText("Jogar Novamente");
        jBNovoJogo.setMaximumSize(new java.awt.Dimension(158, 41));
        jBNovoJogo.setMinimumSize(new java.awt.Dimension(158, 41));
        jBNovoJogo.setPreferredSize(new java.awt.Dimension(158, 41));
        jBNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoJogoActionPerformed(evt);
            }
        });

        jBEncerrar.setMnemonic('j');
        jBEncerrar.setText("Encerrar");
        jBEncerrar.setMaximumSize(new java.awt.Dimension(158, 41));
        jBEncerrar.setMinimumSize(new java.awt.Dimension(158, 41));
        jBEncerrar.setPreferredSize(new java.awt.Dimension(158, 41));
        jBEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFundoLayout = new javax.swing.GroupLayout(jPFundo);
        jPFundo.setLayout(jPFundoLayout);
        jPFundoLayout.setHorizontalGroup(
            jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFimJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addGroup(jPFundoLayout.createSequentialGroup()
                        .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBNovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPQuarto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEncerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPFundoLayout.createSequentialGroup()
                        .addComponent(jPGanhador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPFundoLayout.setVerticalGroup(
            jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLFimJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPGanhador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPTerceiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("gameOver");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoJogoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        CriaJogadores cJ = new CriaJogadores();
        //removerBarraTituloTela(cJ);
        cJ.setVisible(true);
    }//GEN-LAST:event_jBNovoJogoActionPerformed

    private void jBEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEncerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBEncerrarActionPerformed

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
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GameOver dialog = new GameOver(new javax.swing.JFrame(), true, new Jogador[4]);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEncerrar;
    private javax.swing.JButton jBNovoJogo;
    private javax.swing.JLabel jLFimJogo;
    private javax.swing.JLabel jLJogadorGanhador;
    private javax.swing.JLabel jLJogadorQua;
    private javax.swing.JLabel jLJogadorSeg;
    private javax.swing.JLabel jLJogadorTer;
    private javax.swing.JLabel jLSaldoGanhador;
    private javax.swing.JLabel jLSaldoQua;
    private javax.swing.JLabel jLSaldoSeg;
    private javax.swing.JLabel jLSaldoTer;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPFundo;
    private javax.swing.JPanel jPGanhador;
    private javax.swing.JPanel jPQuarto;
    private javax.swing.JPanel jPSegundo;
    private javax.swing.JPanel jPTerceiro;
    // End of variables declaration//GEN-END:variables

// cria um array de tamanho fixo para os jogadores
    private final Jogador[] jogadores;

}
