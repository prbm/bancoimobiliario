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
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Thays
 */
public class TelaSorteaCartas extends javax.swing.JDialog {

    /**
     * Creates new form TelaSorteaCartas
     */
    public TelaSorteaCartas(java.awt.Frame parent, boolean modal,Jogador j) {
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
        ImageIcon img;
        Objetivo obj;
        // Carta 001
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente001.png"));
        obj = new Objetivo("Cadeira de Tecido e Madeira", 450, img);
        obj.setQtdeMadeira(4);
        obj.setQtdeOrganico(6);
        cartas.add(obj);
        // Carta 002
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente002.png"));
        obj = new Objetivo("Cadeira de Metal e Madeira", 350, img);
        obj.setQtdeMetal(6);
        obj.setQtdeMadeira(6);
        cartas.add(obj);
        // Carta 003
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente003.png"));
        obj = new Objetivo("Cadeira de Couro e Metal", 650, img);
        obj.setQtdePlastico(4);
        obj.setQtdeOrganico(8);
        obj.setQtdeMetal(6);
        cartas.add(obj);
        // Carta 004
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente004.png"));
        obj = new Objetivo("Mesa de Metal e Madeira", 450, img);
        obj.setQtdeMadeira(8);
        obj.setQtdeMetal(1);
        cartas.add(obj);
        // Carta 005
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente005.png"));
        obj = new Objetivo("Mesa de Metal e Plástico", 650, img);
        obj.setQtdePlastico(10);
        obj.setQtdeMetal(6);
        cartas.add(obj);
        // Carta 006
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente006.png"));
        obj = new Objetivo("Canetas de Plástico", 50, img);
        obj.setQtdePlastico(2);
        cartas.add(obj);
        // Carta 007
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente007.png"));
        obj = new Objetivo("Canetas Tinteiro", 50, img);
        obj.setQtdePlastico(1);
        obj.setQtdeMetal(2);
        cartas.add(obj);
        // Carta 008
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente008.png"));
        obj = new Objetivo("Pilha de Papel", 50, img);
        obj.setQtdePapel(4);
        cartas.add(obj);
        // Carta 009
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente009.png"));
        obj = new Objetivo("Livro", 50, img);
        obj.setQtdePapel(3);
        obj.setQtdeOrganico(1);
        cartas.add(obj);
        // Carta 010
        img = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente010.png"));
        obj = new Objetivo("Avião", 2000, img);
        obj.setQtdePlastico(20);
        obj.setQtdeMetal(25);
        obj.setQtdeOrganico(15);
        obj.setQtdeVidro(15);
        cartas.add(obj);

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

        // cria um gerador de números aleatórios;
        Random rnd = new Random();
        // verifica o número da carta, baseado no número total de cartas
        int numeroCarta = rnd.nextInt(cartas.size());
        
        
        while (j.isPodeSortear()) {
            //trás a primeira carta da pilha
            double valorCarta = cartas.get(numeroCarta).getValor();

            System.out.println("Descrição: " + cartas.get(numeroCarta).getDescr()
                    + "\n"
                    + "Vidro: " + cartas.get(numeroCarta).getQtdeVidro()
                    + "\n"
                    + "Papel: " + cartas.get(numeroCarta).getQtdePapel()
                    + "\n"
                    + "Organico: " + cartas.get(numeroCarta).getQtdeOrganico()
                    + "\n"
                    + "Metal: " + cartas.get(numeroCarta).getQtdeMetal()
                    + "\n"
                    + "Ferro: " + cartas.get(numeroCarta).getQtdeFerro()
                    + "\n"
                    + "Aluminio: " + cartas.get(numeroCarta).getQtdeAluminio()
                    + "\n"
                    + "Oleo: " + cartas.get(numeroCarta).getQtdeOleo()
                    + "\n"
                    + "Madeira: " + cartas.get(numeroCarta).getQtdeMadeira()
                    + "\n"
                    + "Plastico: " + cartas.get(numeroCarta).getQtdePlastico()
                    + "\n"
                    + "Valor: " + cartas.get(numeroCarta).getValor());

            //copia o objetivo para cada jogador
            j.setObjetivo(cartas.get(numeroCarta));
            j.setPodeSortear(false);

        }

        // anima o sorteio da carta
        for(int i = 0; i < 25; i++){
            jLCartaObjetivo.setIcon(cartas.get(rnd.nextInt(cartas.size())).getImagem());
            jLCartaObjetivo.update(jLCartaObjetivo.getGraphics());                
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println("Animando carta objetivo ie: " + ie.getMessage());
            }
        }

        // prepara a exibição da carta sortada
        this.carta = cartas.get(numeroCarta);
//        cartas.remove(numeroCarta);		// remove a primeira carta para a lista
//        cartas.add(this.carta);                          // copia a primeira carta para o fim da lista 
        jLCartaObjetivo.setIcon(this.carta.getImagem());
        jLCartaObjetivo.update(jLCartaObjetivo.getGraphics());
        // determina a carta que o jogador vai usar
        this.j.setObjetivo(this.carta);
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
        jLObjetivo = new javax.swing.JLabel();
        jLCartaObjetivo = new javax.swing.JLabel();
        jButtonSortear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(275, 410));
        setMinimumSize(new java.awt.Dimension(275, 410));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(275, 410));

        jPanel1.setBackground(new java.awt.Color(26, 64, 35));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setMaximumSize(new java.awt.Dimension(275, 410));
        jPanel1.setMinimumSize(new java.awt.Dimension(275, 410));
        jPanel1.setPreferredSize(new java.awt.Dimension(275, 410));

        jLObjetivo.setBackground(new java.awt.Color(161, 165, 108));
        jLObjetivo.setFont(new java.awt.Font("Traditional Arabic", 1, 22)); // NOI18N
        jLObjetivo.setForeground(new java.awt.Color(26, 64, 35));
        jLObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLObjetivo.setText("Próximo Objetivo");
        jLObjetivo.setMaximumSize(new java.awt.Dimension(246, 42));
        jLObjetivo.setMinimumSize(new java.awt.Dimension(246, 42));
        jLObjetivo.setOpaque(true);
        jLObjetivo.setPreferredSize(new java.awt.Dimension(246, 42));

        jLCartaObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCartaObjetivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoCostas.png"))); // NOI18N
        jLCartaObjetivo.setMaximumSize(new java.awt.Dimension(145, 250));
        jLCartaObjetivo.setMinimumSize(new java.awt.Dimension(145, 250));
        jLCartaObjetivo.setPreferredSize(new java.awt.Dimension(145, 250));

        jButtonSortear.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jButtonSortear.setMnemonic('s');
        jButtonSortear.setLabel("Selecionar Objetivo");
        jButtonSortear.setMaximumSize(new java.awt.Dimension(246, 42));
        jButtonSortear.setMinimumSize(new java.awt.Dimension(246, 42));
        jButtonSortear.setPreferredSize(new java.awt.Dimension(246, 42));
        jButtonSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLCartaObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSortear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLObjetivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCartaObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonSortear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortearActionPerformed
        if(!jButtonSortear.getText().trim().toLowerCase().equals("ok")){
            sortear(j);
            jButtonSortear.setText("Ok");
            jButtonSortear.setMnemonic('o');
            jLObjetivo.setText("Seu Objetivo");
        }else{
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSortearActionPerformed

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
    private javax.swing.JButton jButtonSortear;
    private javax.swing.JLabel jLCartaObjetivo;
    private javax.swing.JLabel jLObjetivo;
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
