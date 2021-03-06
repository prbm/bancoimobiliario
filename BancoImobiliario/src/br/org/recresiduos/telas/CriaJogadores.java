/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.constantes.CorJogador;
import br.org.recresiduos.entidades.Jogador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Paulo
 */
public class CriaJogadores extends javax.swing.JFrame {

    /**
     * Creates new form CriaJogadores
     */
    public CriaJogadores() {
        primeiraVezFoco = true;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLPFundo = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLAmarelo = new javax.swing.JLabel();
        jTFNomeJogador1 = new javax.swing.JTextField();
        jLAzul = new javax.swing.JLabel();
        jTFNomeJogador2 = new javax.swing.JTextField();
        jLBranco = new javax.swing.JLabel();
        jTFNomeJogador3 = new javax.swing.JTextField();
        jLPreto = new javax.swing.JLabel();
        jTFNomeJogador4 = new javax.swing.JTextField();
        jBContinuar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(410, 384));
        setMinimumSize(new java.awt.Dimension(410, 384));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(410, 384));
        setResizable(false);

        jLPFundo.setBackground(new java.awt.Color(26, 64, 35));
        jLPFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(168, 165, 108)));
        jLPFundo.setMaximumSize(new java.awt.Dimension(410, 384));
        jLPFundo.setMinimumSize(new java.awt.Dimension(410, 384));
        jLPFundo.setOpaque(true);
        jLPFundo.setPreferredSize(new java.awt.Dimension(410, 384));

        jLabel1.setBackground(new java.awt.Color(168, 165, 108));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 64, 35));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escreva seu nome ao lado \nda cor que quer usar");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(366, 66));
        jLabel1.setMinimumSize(new java.awt.Dimension(366, 66));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(366, 66));

        jLAmarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorAmarelo.png"))); // NOI18N
        jLAmarelo.setMaximumSize(new java.awt.Dimension(50, 50));
        jLAmarelo.setMinimumSize(new java.awt.Dimension(50, 50));
        jLAmarelo.setName("jLAmarelo"); // NOI18N
        jLAmarelo.setPreferredSize(new java.awt.Dimension(50, 50));

        jTFNomeJogador1.setText("Escreva seu nome aqui");
        jTFNomeJogador1.setToolTipText("");
        jTFNomeJogador1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFNomeJogador1.setName("jTFNomeJogador1"); // NOI18N
        jTFNomeJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeJogador1ActionPerformed(evt);
            }
        });
        jTFNomeJogador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeJogador1KeyPressed(evt);
            }
        });

        jLAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorAzul.png"))); // NOI18N
        jLAzul.setMaximumSize(new java.awt.Dimension(50, 50));
        jLAzul.setMinimumSize(new java.awt.Dimension(50, 50));
        jLAzul.setName("jLAmarelo"); // NOI18N
        jLAzul.setPreferredSize(new java.awt.Dimension(50, 50));

        jTFNomeJogador2.setText("Escreva seu nome aqui");
        jTFNomeJogador2.setToolTipText("");
        jTFNomeJogador2.setName("jTFNomeJogador2"); // NOI18N
        jTFNomeJogador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeJogador2KeyPressed(evt);
            }
        });

        jLBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorBranco.png"))); // NOI18N
        jLBranco.setMaximumSize(new java.awt.Dimension(50, 50));
        jLBranco.setMinimumSize(new java.awt.Dimension(50, 50));
        jLBranco.setName("jLAmarelo"); // NOI18N
        jLBranco.setPreferredSize(new java.awt.Dimension(50, 50));

        jTFNomeJogador3.setText("Escreva seu nome aqui");
        jTFNomeJogador3.setToolTipText("");
        jTFNomeJogador3.setName("jTFNomeJogador3"); // NOI18N
        jTFNomeJogador3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeJogador3KeyPressed(evt);
            }
        });

        jLPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorPreto.png"))); // NOI18N
        jLPreto.setMaximumSize(new java.awt.Dimension(50, 50));
        jLPreto.setMinimumSize(new java.awt.Dimension(50, 50));
        jLPreto.setName("jLAmarelo"); // NOI18N
        jLPreto.setPreferredSize(new java.awt.Dimension(50, 50));

        jTFNomeJogador4.setText("Escreva seu nome aqui");
        jTFNomeJogador4.setToolTipText("");
        jTFNomeJogador4.setName("jTFNomeJogador4"); // NOI18N
        jTFNomeJogador4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFNomeJogador4KeyPressed(evt);
            }
        });

        jBContinuar.setMnemonic('C');
        jBContinuar.setText("Continuar");
        jBContinuar.setActionCommand("jBContinuar");
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jBSair.setMnemonic('S');
        jBSair.setText("Sair");
        jBSair.setActionCommand("jBSair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLPFundo.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jLAmarelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jTFNomeJogador1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jLAzul, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jTFNomeJogador2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jLBranco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jTFNomeJogador3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jLPreto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jTFNomeJogador4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jBContinuar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLPFundo.setLayer(jBSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLPFundoLayout = new javax.swing.GroupLayout(jLPFundo);
        jLPFundo.setLayout(jLPFundoLayout);
        jLPFundoLayout.setHorizontalGroup(
            jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLPFundoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addComponent(jLAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNomeJogador2))
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addComponent(jLBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNomeJogador3))
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addComponent(jLAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addComponent(jLPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNomeJogador4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLPFundoLayout.createSequentialGroup()
                        .addComponent(jBContinuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLPFundoLayout.setVerticalGroup(
            jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTFNomeJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTFNomeJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTFNomeJogador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLPFundoLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jTFNomeJogador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBContinuar)
                    .addComponent(jBSair))
                .addGap(24, 24, 24))
        );

        jTFNomeJogador1.getAccessibleContext().setAccessibleName("jTFNomeJogador1");
        jLAzul.getAccessibleContext().setAccessibleName("jLCorAzul");
        jTFNomeJogador2.getAccessibleContext().setAccessibleName("jTFNomeJogador2");
        jLBranco.getAccessibleContext().setAccessibleName("jLBranco");
        jTFNomeJogador3.getAccessibleContext().setAccessibleName("jTFNomeJogador3");
        jLPreto.getAccessibleContext().setAccessibleName("jLPreto");
        jTFNomeJogador4.getAccessibleContext().setAccessibleName("jTFNomeJogador4");
        jBContinuar.getAccessibleContext().setAccessibleName("jBContinuar");
        jBSair.getAccessibleContext().setAccessibleName("jBSair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLPFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("FormCriaJogadores");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeJogador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNomeJogador1ActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Você quer realmente sair do jogo?", "Vai sair?", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        // verifica os nomes que foram digitados
        if ((jTFNomeJogador1.getText().trim().isEmpty()
                && jTFNomeJogador2.getText().trim().isEmpty()
                && jTFNomeJogador3.getText().trim().isEmpty()
                && jTFNomeJogador4.getText().trim().isEmpty())
                || (jTFNomeJogador1.getText().trim().toLowerCase().equals("escreva seu nome aqui")
                && jTFNomeJogador2.getText().trim().toLowerCase().equals("escreva seu nome aqui")
                && jTFNomeJogador3.getText().trim().toLowerCase().equals("escreva seu nome aqui")
                && jTFNomeJogador4.getText().trim().toLowerCase().equals("escreva seu nome aqui"))) {
            JOptionPane.showMessageDialog(null, "Não foi selecionado nenhum jogador, escreva seu nome ao lado de uma cor para selecionar a cor com que quer jogar!");
            jTFNomeJogador1.requestFocus();
            return;
        }

        // declara os quatro jogadores como null
        Jogador[] j = new Jogador[4];
        j[0] = null;
        j[1] = null;
        j[2] = null;
        j[3] = null;

        // verifica quais os jogadores selecionados
        // verifica se o jogador amarelo foi selecionado
        if (!jTFNomeJogador1.getText().trim().isEmpty() && !jTFNomeJogador1.getText().trim().toLowerCase().equals("escreva seu nome aqui")) {
            j[0] = new Jogador(jTFNomeJogador1.getText(), CorJogador.AMARELO, null);
        }

        // verifica se o jogador azul foi selecionado
        if (!jTFNomeJogador2.getText().trim().isEmpty() && !jTFNomeJogador2.getText().trim().toLowerCase().equals("escreva seu nome aqui")) {
            j[1] = new Jogador(jTFNomeJogador2.getText(), CorJogador.AZUL, null);
        }

        // verifica se o jogador branco foi selecionado
        if (!jTFNomeJogador3.getText().trim().isEmpty() && !jTFNomeJogador3.getText().trim().toLowerCase().equals("escreva seu nome aqui")) {
            j[2] = new Jogador(jTFNomeJogador3.getText(), CorJogador.BRANCO, null);
        }

        // verifica se o jogador preto foi selecionado
        if (!jTFNomeJogador4.getText().trim().isEmpty() && !jTFNomeJogador4.getText().trim().toLowerCase().equals("escreva seu nome aqui")) {
            j[3] = new Jogador(jTFNomeJogador4.getText(), CorJogador.PRETO, null);
        }

        // chama a tela GameBoard, sem manter o vínculo entre elas
        new GameBoard(j).setVisible(true);
        // fecha esta tela
        this.dispose();
    }//GEN-LAST:event_jBContinuarActionPerformed

    /*
     * Os métodos a seguir tratam os eventos de teclado gerados pelo usuário, quando
     * definirem os nomes do jogadores
    */
    
    private void jTFNomeJogador1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeJogador1KeyPressed
        limpaJTEFNomeJogador(jTFNomeJogador1, evt);
    }//GEN-LAST:event_jTFNomeJogador1KeyPressed

    private void jTFNomeJogador2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeJogador2KeyPressed
        limpaJTEFNomeJogador(jTFNomeJogador2, evt);
    }//GEN-LAST:event_jTFNomeJogador2KeyPressed

    private void jTFNomeJogador3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeJogador3KeyPressed
        limpaJTEFNomeJogador(jTFNomeJogador3, evt);
    }//GEN-LAST:event_jTFNomeJogador3KeyPressed

    private void jTFNomeJogador4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNomeJogador4KeyPressed
        limpaJTEFNomeJogador(jTFNomeJogador4, evt);
    }//GEN-LAST:event_jTFNomeJogador4KeyPressed

    // trata os eventos de teclado ao definir o nome do jogador
    private void limpaJTEFNomeJogador(JTextField jtf, java.awt.event.KeyEvent evt) {
        // verifica se o evento foi gerado por algum dos campos de TextField, usando a propriedade getName()
        // pois todos os nomes possuem este texto em comum jTFNomeJogador
        if (evt.getComponent().getName().substring(0, jtf.getName().length() - 1).equals("jTFNomeJogador")) {
            // verifica se apenas a tecla shift não foi pressionada
            if (evt.getKeyCode() != KeyEvent.VK_SHIFT) {
                // verifica se o campo está com o texto original
                if (jtf.getText().toLowerCase().equals("escreva seu nome aqui")) {
                    // limpa o campo, para que apareça o que o usuário está digitando
                    jtf.setText("");
                }
            }
        }
    }

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
            java.util.logging.Logger.getLogger(CriaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriaJogadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriaJogadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLAmarelo;
    private javax.swing.JLabel jLAzul;
    private javax.swing.JLabel jLBranco;
    private javax.swing.JLayeredPane jLPFundo;
    private javax.swing.JLabel jLPreto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFNomeJogador1;
    private javax.swing.JTextField jTFNomeJogador2;
    private javax.swing.JTextField jTFNomeJogador3;
    private javax.swing.JTextField jTFNomeJogador4;
    // End of variables declaration//GEN-END:variables
    // variável de controle se o focus é a primeira vez
    private boolean primeiraVezFoco = false;
}
