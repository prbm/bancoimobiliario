/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.entidades.Jogador;
import br.org.recresiduos.entidades.Objetivo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Thays
 */
public class TelaSorteaCartas extends javax.swing.JDialog {

    /**
     * Creates new form TelaSorteaCartas
     */
    public TelaSorteaCartas(java.awt.Frame parent, boolean modal,Jogador j ) {
        super(parent, modal);
        initComponents();
        
        // copia os dados do jogador para uso nesta tela
        this.j = j;
        
        definirCartas();
                
    }

    private TelaSorteaCartas(JFrame jFrame, boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      // configuração das cartas objetivo
    private void definirCartas() {

        // inicia a relação de cartas objetivo
        cartas = new ArrayList<Objetivo>();

        // até aqui, tudo bem
        cartas.add(new Objetivo("Mesa Vidro", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1));
        cartas.add(new Objetivo("Cadeira Madeira", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2));
        cartas.add(new Objetivo("Mesa Madeira", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 3));
        cartas.add(new Objetivo("Mesa Ferro", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 4));
        cartas.add(new Objetivo("Mesa a", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 5));
        cartas.add(new Objetivo("Mesa b ", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 6));
        cartas.add(new Objetivo("Mesa c", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 7));
        cartas.add(new Objetivo("Mesa d", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 8));
        cartas.add(new Objetivo("Mesa e", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 9));
        cartas.add(new Objetivo("Mesa f", 10, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 10));

        // embaralha as cartas, enquanto a lista original não estiver vazia
        while (!cartas.isEmpty()) {
            // reinicia o objeto
            Objetivo ob = null;
            // se houver mais de uma carta na lista
            if (cartas.size() > 1) {
                // lê o número total de cartas que a lista tem
                int numeroCartas = cartas.size();
                // gera aleatoriamente o número da posição da lista original
                Random rnd = new Random();
                int posicaoLista = rnd.nextInt(numeroCartas);
                // identifica o objeto da posição selecionada
                ob = cartas.get(posicaoLista);
            } else {
                // lê o objeto da posição 0
                ob = cartas.get(0);
            }
            // adiciona o objeto selecionado à nova lista
            cartasTmp.add(ob);
            // remove o objeto selecionado da lista original
            cartas.remove(ob);
        }
        // copia as cartas embaralhadas para a lista original
        cartas = cartasTmp;

        // imprime a lista embaralhada, para conferência
        for (Objetivo s : cartas) {
            System.out.println("Carta: " + s.getDescr());
        }
    }

    private void sortear(Jogador j) {

        while (j.isPodeSortear()) {
            //trás a primeira carta da pilha
            double valorCarta = cartas.get(0).getValor();

            System.out.println("Descrição: " + cartas.get(0).getDescr()
                    + "\n"
                    + "Vidro: " + cartas.get(0).getQtdeVidro()
                    + "\n"
                    + "Papel: " + cartas.get(0).getQtdePapel()
                    + "\n"
                    + "Organico: " + cartas.get(0).getQtdeOrganico()
                    + "\n"
                    + "Metal: " + cartas.get(0).getQtdeMetal()
                    + "\n"
                    + "Ferro: " + cartas.get(0).getQtdeFerro()
                    + "\n"
                    + "Aluminio: " + cartas.get(0).getQtdeAluminio()
                    + "\n"
                    + "Oleo: " + cartas.get(0).getQtdeOleo()
                    + "\n"
                    + "Madeira: " + cartas.get(0).getQtdeMadeira()
                    + "\n"
                    + "Plastico: " + cartas.get(0).getQtdePlastico()
                    + "\n"
                    + "Valor: " + cartas.get(0).getValor());

            //copia o objetivo para cada jogador
            j.setObjetivo(cartas.get(0));
            j.setPodeSortear(false);

        }
        cartas.add(cartas.get(0));	// copia a primeira carta para o fim da lista 
        cartas.remove(0);		// remove a primeira carta para a lista
        
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
        jLabel1 = new javax.swing.JLabel();
        jLCartaObjetivo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(26, 64, 35));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setMaximumSize(new java.awt.Dimension(4000, 4000));

        jLabel1.setBackground(new java.awt.Color(161, 165, 108));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 64, 35));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carta Objetivo");
        jLabel1.setOpaque(true);

        jLCartaObjetivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente.png"))); // NOI18N
        jLCartaObjetivo.setText("CartaObjetivo");

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton1.setText("Sortear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLCartaObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLCartaObjetivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sortear(j);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSorteaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSorteaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSorteaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSorteaCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaSorteaCartas dialog = new TelaSorteaCartas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLCartaObjetivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    // Atributos adicionais para esta classe
    private Jogador j;
    private Objetivo carta;
    // cria uma nova lista para armazenar as cartas sendo embaralhadas
    private List<Objetivo> cartas = new ArrayList<Objetivo>();

    //Cria uma lista temporaria para realizar a troca das cartas
    private List<Objetivo> cartasTmp = new ArrayList<Objetivo>();
}
