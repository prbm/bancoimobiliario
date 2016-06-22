/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.entidades.Jogador;
import br.org.recresiduos.uteis.Dado;
import java.awt.Cursor;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class LancarDado extends javax.swing.JDialog {

    /**
     * Creates new form LancarDado
     */
    public LancarDado(java.awt.Frame parent, boolean modal, Dado dado, Jogador jogador) {
        super(parent, modal);
        initComponents();
        // recebe os dados que vieram da tela anterior
        this.dado = dado;
        this.jog = jogador;
        // atualiza o nome do jogador na tela
        jLNomeJogador.setText(this.jog.getNome());
        // foco no dado
        jLDado.requestFocus();
        
    }
    
    private void lancarDado(){
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        // animar dado
        ImageIcon[] dice = new ImageIcon[7];
        for (int i = 1; i < 7; i++) {
            String path = "/imagensbir/Dice00" + i + ".png";
            dice[i] = new ImageIcon(getClass().getResource(path));
        }

        // gera números aleatórios para mostrar as faces do dado
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            jLDado.setIcon(dice[(rnd.nextInt(6) + 1)]);
            jLDado.update(jLDado.getGraphics());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        // fim da animação  
        setCursor(Cursor.getDefaultCursor());

        // sorteia um número do dado e mostra o resultado
        dado.rolarDados();
        jLDado.setIcon(dice[dado.getNumFace()]);
        jLDado.update(jLDado.getGraphics());

        // pausa a tela por 1,5 segundos, para mostrar o número sorteado
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        
        this.dispose();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPFundo = new javax.swing.JPanel();
        jLNomeJogador = new javax.swing.JLabel();
        jLDado = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(26, 64, 35));
        setMaximumSize(new java.awt.Dimension(305, 250));
        setMinimumSize(new java.awt.Dimension(305, 250));
        setName("LancarDado"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(305, 250));
        setResizable(false);

        jPFundo.setBackground(new java.awt.Color(26, 64, 35));
        jPFundo.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPFundo.setMaximumSize(new java.awt.Dimension(305, 250));
        jPFundo.setMinimumSize(new java.awt.Dimension(305, 250));
        jPFundo.setName("Fundo"); // NOI18N
        jPFundo.setPreferredSize(new java.awt.Dimension(305, 250));

        jLNomeJogador.setBackground(new java.awt.Color(161, 165, 108));
        jLNomeJogador.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLNomeJogador.setForeground(new java.awt.Color(51, 51, 51));
        jLNomeJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNomeJogador.setText("Nome do Jogador");
        jLNomeJogador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLNomeJogador.setName("NomeJogador"); // NOI18N
        jLNomeJogador.setOpaque(true);

        jLDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/Dice006.png"))); // NOI18N
        jLDado.setToolTipText("Clique no dado para sortear um número");
        jLDado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLDado.setMaximumSize(new java.awt.Dimension(280, 90));
        jLDado.setMinimumSize(new java.awt.Dimension(280, 90));
        jLDado.setName("Dado"); // NOI18N
        jLDado.setPreferredSize(new java.awt.Dimension(280, 90));
        jLDado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLDadoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPFundoLayout = new javax.swing.GroupLayout(jPFundo);
        jPFundo.setLayout(jPFundoLayout);
        jPFundoLayout.setHorizontalGroup(
            jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLDado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLNomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPFundoLayout.setVerticalGroup(
            jPFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jLNomeJogador.getAccessibleContext().setAccessibleName("NomeJogador");
        jLDado.getAccessibleContext().setAccessibleName("Dado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPFundo.getAccessibleContext().setAccessibleName("Fundo");

        getAccessibleContext().setAccessibleName("LancarDado");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLDadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLDadoFocusGained
        lancarDado();
    }//GEN-LAST:event_jLDadoFocusGained

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
            java.util.logging.Logger.getLogger(LancarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LancarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LancarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LancarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LancarDado dialog = new LancarDado(new javax.swing.JFrame(), true, new Dado(), new Jogador());
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
    private javax.swing.JLabel jLDado;
    private javax.swing.JLabel jLNomeJogador;
    private javax.swing.JPanel jPFundo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private Dado dado;
    private Jogador jog;
}
