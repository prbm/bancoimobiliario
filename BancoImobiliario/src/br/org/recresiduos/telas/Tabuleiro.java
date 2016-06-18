/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.uteis.Dado;
import br.org.recresiduos.constantes.CorJogador;
import br.org.recresiduos.constantes.TipodeMateriais;
import br.org.recresiduos.entidades.Objetivo;
import br.org.recresiduos.entidades.Casa;
import br.org.recresiduos.entidades.Jogador;
import static java.lang.Boolean.FALSE;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class Tabuleiro extends javax.swing.JFrame {

    /**
     * Creates new form Tabuleiro
     */
    public Tabuleiro() {
        
        iniciarJogo();
        
    }
    
    public void iniciarJogo(){
        initComponents();
        
        // pode ser mais útil transformar os jogadores em coleção, veremos mais adiante
        j1 = new Jogador("Jogador 1", CorJogador.PRETO, null);
        j2 = new Jogador("Jogador 2", CorJogador.BRANCO, null);
        banco = new Jogador("Banco",CorJogador.BANCO_SEMCOR, null);
        
        // configura as casas que são usadas no tabuleiro;
        configuraCasasTabuleiro();
        
        // definir o array de labels que são as casas do jogo
        definirArrayLabels();
        
        //definir as cartas sorte e reves do jogo
        definirCartas();
      
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

        // inicia a relação de casas do tabuleiro
        casas = new ArrayList<Casa>();
        //Coloquei para iniciar casa por casa assim quando chegarem as imagens só vou trocar os valores
        casas.add(new Casa(false, 0, 0, 0, 0, 0, TipodeMateriais.NENHUM));
        casas.add(new Casa(true, 0, 0, 0, 0, 1, TipodeMateriais.NENHUM));
        casas.add(new Casa(true, 1000, 100, 100, 1000, 2, TipodeMateriais.METAL));
        casas.add(new Casa(true, 4000, 400, 400, 4000, 3, TipodeMateriais.PAPEL));
        casas.add(new Casa(true, 3500, 350, 350,3500, 4,  TipodeMateriais.ORGANICO));
        casas.add(new Casa(true, 1800, 180, 180, 1800, 5,  TipodeMateriais.PLASTICO));
        casas.add(new Casa(true, 2000, 200, 200, 2000, 6,  TipodeMateriais.VIDRO));
        casas.add(new Casa(true, 1000, 100, 100, 1000, 7,  TipodeMateriais.MADEIRA));
        casas.add(new Casa(true, 1600, 160, 160, 1600, 8,  TipodeMateriais.METAL));
        casas.add(new Casa(true, 1400, 140, 140, 1400, 9,  TipodeMateriais.PAPEL));
        casas.add(new Casa(true, 1400, 140, 140, 1400, 10, TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 11, TipodeMateriais.ORGANICO));
        casas.add(new Casa(true, 2200, 220, 220, 2200, 12,  TipodeMateriais.PLASTICO));
        casas.add(new Casa(true, 2400, 240, 240, 2400, 13,  TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 600, 60, 60, 600, 14,  TipodeMateriais.VIDRO));
        casas.add(new Casa(true, 750, 75, 75, 750, 15,  TipodeMateriais.MADEIRA));
        casas.add(new Casa(true, 1000, 100, 100, 1000, 16, TipodeMateriais.METAL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 17, TipodeMateriais.PAPEL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 18, TipodeMateriais.ORGANICO));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 19, TipodeMateriais.PLASTICO));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 20, TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 21,  TipodeMateriais.VIDRO));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 22,  TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 23,  TipodeMateriais.MADEIRA));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 24,  TipodeMateriais.METAL));
        
        System.out.println("Foram configuradas " + casas.size() + " casas");

        for (int i = 0; i < 21; i++) {
            Casa c = casas.get(i);
            System.out.println("Casa" + String.format("%03d", i) + "," + c.isPodeComprar() + "," + c.getAluguel());
        }
    }

    private void definirArrayLabels() {
        
        // inicia a relação de labels do tabuleiro
        labels = new ArrayList<JLabel>();
        
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
    
        // configuração das cartas objetivo
    private void definirCartas(){

        // inicia a relação de cartas objetivo
        cartas = new ArrayList<Objetivo>();
        
        // até aqui, tudo bem
        cartas.add(new Objetivo("Mesa Vidro",0,0,0,0,0,0,0,0,1));
        cartas.add(new Objetivo("Cadeira Madeira",0,0,0,0,0,0,0,0,2));
        cartas.add(new Objetivo("Mesa Madeira",0,0,0,0,0,0,0,0,3));
        cartas.add(new Objetivo("Mesa Ferro",0,0,0,0,0,0,0,0,4));
        cartas.add(new Objetivo("Mesa a",0,0,0,0,0,0,0,0,5));
        cartas.add(new Objetivo("Mesa b ",0,0,0,0,0,0,0,0,6));
        cartas.add(new Objetivo("Mesa c",0,0,0,0,0,0,0,0,7));
        cartas.add(new Objetivo("Mesa d",0,0,0,0,0,0,0,0,8));
        cartas.add(new Objetivo("Mesa e",0,0,0,0,0,0,0,0,9));
        cartas.add(new Objetivo("Mesa f",0,0,0,0,0,0,0,0,10));
        
       
        
        // embaralha as cartas, enquanto a lista original não estiver vazia
       		while(!cartas.isEmpty()){
                    // reinicia o objeto
                    Objetivo ob = null;
                    // se houver mais de uma carta na lista
                  if(cartas.size()>1){
                    // lê o número total de cartas que a lista tem
                    int numeroCartas = cartas.size();
                    // gera aleatoriamente o número da posição da lista original
                    Random rnd = new Random();
                    int posicaoLista = rnd.nextInt(numeroCartas);
                    // identifica o objeto da posição selecionada
                    ob = cartas.get(posicaoLista);
                  }
                  else{
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
                for(Objetivo s : cartas){
                System.out.println("Carta: " + s.getDescr());
                }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jlJogadorTurno = new javax.swing.JLabel();
        jbJogar = new javax.swing.JButton();
        jlSaldo = new javax.swing.JLabel();
        jlNumeroCasa = new javax.swing.JLabel();
        jTFNumeroCasa = new javax.swing.JTextField();
        jlComprarVender = new javax.swing.JLabel();
        jTFComprarVender = new javax.swing.JTextField();
        jlValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jlCasa14 = new javax.swing.JLabel();
        jlCasa15 = new javax.swing.JLabel();
        jlCasa16 = new javax.swing.JLabel();
        jlCasa17 = new javax.swing.JLabel();
        jlCasa18 = new javax.swing.JLabel();
        jlCasa19 = new javax.swing.JLabel();
        jlCasa8 = new javax.swing.JLabel();
        jlValorDado = new javax.swing.JLabel();
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
        jlCasa9 = new javax.swing.JLabel();
        jlCasa2 = new javax.swing.JLabel();
        jlCasa12 = new javax.swing.JLabel();
        jlCasa13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KING CITY");
        setPreferredSize(new java.awt.Dimension(747, 667));
        setResizable(false);
        setSize(new java.awt.Dimension(60, 0));

        jlJogadorTurno.setText("Vez do Jogador:");

        jbJogar.setText("Jogar");
        jbJogar.setAutoscrolls(true);
        jbJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJogarActionPerformed(evt);
            }
        });

        jlSaldo.setText("Saldo:");

        jlNumeroCasa.setText("Número Casa:");

        jTFNumeroCasa.setEditable(false);

        jlComprarVender.setText("Comprar/Vender:");

        jTFComprarVender.setEditable(false);

        jlValor.setText("Aluguel:");

        jTFValor.setEditable(false);

        jlCasa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa014.png"))); // NOI18N
        jlCasa14.setText("Casa 14");

        jlCasa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa015.png"))); // NOI18N
        jlCasa15.setText("Casa 15");

        jlCasa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa016.png"))); // NOI18N
        jlCasa16.setText("Casa 16");

        jlCasa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa017.png"))); // NOI18N
        jlCasa17.setText("Casa 17");

        jlCasa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa018.png"))); // NOI18N
        jlCasa18.setText("Casa 18");

        jlCasa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa019.png"))); // NOI18N
        jlCasa19.setText("Casa 19");

        jlCasa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa008.png"))); // NOI18N
        jlCasa8.setText("Casa 8");

        jlValorDado.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jlValorDado.setText("Valor do Dado:");

        jlCasa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa011.png"))); // NOI18N
        jlCasa11.setText("Casa 11");

        jlCasa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa004.png"))); // NOI18N
        jlCasa4.setText("Casa 4");

        jlDadoRolado.setFont(new java.awt.Font("Arial Unicode MS", 0, 18)); // NOI18N
        jlDadoRolado.setForeground(new java.awt.Color(153, 0, 0));
        jlDadoRolado.setText("0");
        jlDadoRolado.setMaximumSize(new java.awt.Dimension(100, 100));
        jlDadoRolado.setMinimumSize(new java.awt.Dimension(100, 100));

        jlCasa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa005.png"))); // NOI18N
        jlCasa5.setText("Casa 5");

        jlCasa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa010.png"))); // NOI18N
        jlCasa10.setText("Casa 10");

        jlCasa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa007.png"))); // NOI18N
        jlCasa7.setText("Casa 7");

        jlCasa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa020.png"))); // NOI18N
        jlCasa20.setText("Casa 20");

        jlCasa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa001.png"))); // NOI18N
        jlCasa1.setText("Casa 1");

        jlCasa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa006.png"))); // NOI18N
        jlCasa6.setText("Casa 6");

        jlCasa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa003.png"))); // NOI18N
        jlCasa3.setText("Casa 3");

        jlCasa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa009.png"))); // NOI18N
        jlCasa9.setText("Casa 9");

        jlCasa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa002.png"))); // NOI18N
        jlCasa2.setText("Casa 2");

        jlCasa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa012.png"))); // NOI18N
        jlCasa12.setText("Casa 12");

        jlCasa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Casa013.png"))); // NOI18N
        jlCasa13.setText("Casa 13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCasa20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlValorDado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlDadoRolado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCasa8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCasa10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlCasa19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCasa18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa16, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(405, 405, 405)
                                .addComponent(jlCasa13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCasa11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlCasa20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlValorDado)
                        .addComponent(jlDadoRolado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlCasa10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCasa11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCasa19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jlDadoRolado.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlJogadorTurno)
                            .addComponent(jlSaldo)
                            .addComponent(jbJogar))
                        .addGap(236, 236, 236)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNumeroCasa)
                            .addComponent(jlComprarVender)
                            .addComponent(jlValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNumeroCasa)
                            .addComponent(jTFComprarVender)
                            .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
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
                        .addComponent(jbJogar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(494, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(610, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
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
                JOptionPane.showMessageDialog(null, "Você completou uma volta, recebeu 200 em honorários!");
                jogadorVez.setSaldo((jogadorVez.getSaldo() + 200));
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

        //botoes
        String[] compraAluga = {"Comprar" , "Alugar" };
        String[] vender = {"Vender", "Não"};
        String[] alugar = {"Alugar"};
        
        // atualiza a interface de usuário com o jogador que está jogando
        jlJogadorTurno.setText(jogadorVez.getNome());

        // lê o número da casa em que o jogador se encontra
        int numeroCasa = jogadorVez.getNumeroCasa();

        // lê o valor da que a casa possui
	double valorCompra = casas.get(numeroCasa).getCompra();
 	double valorVenda = casas.get(numeroCasa).getCompra();
	double valorAluguel = casas.get(numeroCasa).getAluguel();
        int s = 1;
        
        //verifica se o jogador se encontra na casa inicio, pois ela não deve ser comprada, vendida ou alugada
        if(numeroCasa > 1){
        
        //Verifica se a casa pode ser comprada
        if (casas.get(numeroCasa).isPodeComprar()){
            if(casas.get(numeroCasa).getPertence().equals(banco)) {
            //Comprar ou alugar caso a casa possa ser vendida, e a casa pertencer ao banco
            
            //verifica se o jogador tem saldo suficiente para a compra
            while(s==1){
            int resultado = JOptionPane.showOptionDialog(null, "Você quer comprar ou alugar?", // mensagem do corpo
                "Decisão",                     // título
                JOptionPane.YES_NO_OPTION,     // opções de botão
                JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
                null,                          // ícone da mensagem
                compraAluga,                   // títulos dos botões da tela
                compraAluga[0]);               // indica o botão default
            
            if(resultado == JOptionPane.YES_OPTION){
                //Realizou a opção de compra   
                if((jogadorVez.getSaldo() > valorCompra)){
                JOptionPane.showMessageDialog(null, "Você comprou esta casa!");
                jogadorVez.setSaldo((jogadorVez.getSaldo() - valorCompra));

                System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());

                // atualiza a interface de usuário com as informações atualizadas
                jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
                jlJogadorTurno.updateUI();
                casas.get(numeroCasa).setPodeComprar(false);
                casas.get(numeroCasa).setPertence(jogadorVez);
                s=0;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Você não tem saldo suficiente para comprar este imovel!");
                }
            }
            else{
                //Realizou a opção de alugar
                JOptionPane.showMessageDialog(null, "Obrigado por alugar!");

                // atualiza o saldo do jogador
                jogadorVez.setSaldo((jogadorVez.getSaldo() - valorAluguel));
                System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());

                // atualiza a interface de usuário com as informações atualizadas
                jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
                jlJogadorTurno.updateUI();
                s=0;
            }
            }
            }
        }
                
        //Vender caso a casa pentença ao jogador da vez ele so tem a opção de vender ou não
        else {
            
            if (casas.get(numeroCasa).getPertence().equals(jogadorVez)) {
                int resultado = JOptionPane.showOptionDialog(null, "Você quer vender?",  // mensagem do corpo
                    "Decisão",                     // título
                    JOptionPane.YES_NO_OPTION,     // opções de botão
                    JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
                    null,                          // ícone da mensagem
                    vender,                        // títulos dos botões da tela
                    vender[0]);                    // indica o botão default

                if(resultado == JOptionPane.YES_OPTION){
                    //Realizou a opção de venda
                    JOptionPane.showMessageDialog(null, "Obrigada por vender!");
                    jogadorVez.setSaldo((jogadorVez.getSaldo() + valorVenda));

                    System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());

                    // atualiza a interface de usuário com as informações atualizadas
                    jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
                    jlJogadorTurno.updateUI();
                    casas.get(numeroCasa).setPodeComprar(true);
                    casas.get(numeroCasa).setPertence(banco);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Não vendeu!");
                }
            }
            else{
                //Alugar caso a casa pentença a outro jogador ela só pode ser alugada
                int x=0;
                while(x==0){
                 int   resultado = JOptionPane.showOptionDialog(null, "A casa pertence a outro jogador pague o aluguel.",  // mensagem do corpo
                    "Decisão",                     // título
                    JOptionPane.YES_NO_OPTION,     // opções de botão
                    JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
                    null,                          // ícone da mensagem
                    alugar,                        // títulos dos botões da tela
                    alugar[0]);                    // indica o botão default

                    if(resultado == JOptionPane.YES_OPTION){
                        //Realizou a opção de alugar
                        JOptionPane.showMessageDialog(null, "Obrigado por alugar!");

                        // atualiza o saldo do jogador
                        jogadorVez.setSaldo((jogadorVez.getSaldo() - valorAluguel));
                        System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());
                        
                        // atualiza o saldo o dono da casa
                        if(casas.get(numeroCasa).getPertence().equals(j1)){
                            j1.setSaldo((j1.getSaldo()+ valorAluguel));
                        }
                        if(casas.get(numeroCasa).getPertence().equals(j2)){
                            j2.setSaldo((j2.getSaldo()+ valorAluguel));
                        }
                        // atualiza a interface de usuário com as informações atualizadas
                        jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
                        jlJogadorTurno.updateUI();
                        x=1;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Você deve pagar o aluguel pois a casa não te pertence");
                        x=0;
                    }
                }
            }
        } 
        }
      
        while (jogadorVez.isPodeSortear()){
        String[] sorteio = {"Sortear"};
        int y=0;
        while(y==0){
            int RCarta = JOptionPane.showOptionDialog(null, "Sorteie um Objetivo",  // mensagem do corpo
            "Objetivos",              // título
            JOptionPane.YES_NO_OPTION,     // opções de botão
            JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
            null,                          // ícone da mensagem
            sorteio,                        // títulos dos botões da tela
            sorteio[0]);                    // indica o botão default

            if(RCarta == JOptionPane.YES_OPTION){
                //trás a primeira carta da pilha
                double valorCarta = cartas.get(0).getValor();
                
                //atualizar saldo com a carta
                jogadorVez.setSaldo((jogadorVez.getSaldo() + valorCarta));
                System.out.println("O saldo do jogador " + jogadorVez.getNome() + " foi atualizado para " + jogadorVez.getSaldo());
                JOptionPane.showMessageDialog(null, "Descrição:" + cartas.get(0).getDescr() + 
                        "\n"+
                        "Vidro: " + cartas.get(0).getVidro()+
                        "\n"+
                        "Papel: " + cartas.get(0).getPapel()+
                        "\n"+
                        "Ferro: " + cartas.get(0).getFerro()+
                        "\n"+
                        "Aluminio: " + cartas.get(0).getAluminio()+
                        "\n"+
                        "Oleo: " + cartas.get(0).getOleo()+
                        "\n"+
                        "Madeira: " + cartas.get(0).getMadeira()+
                        "\n"+
                        "Plastico: " + cartas.get(0).getPlastico()+
                        "\n"+
                        "Valor: " + cartas.get(0).getValor());
                
                //copia o objetivo para cada jogador
               jogadorVez.setObjetivo(cartas.get(0));
               
                // atualiza a interface de usuário com as informações atualizadas
                jlSaldo.setText(String.valueOf(jogadorVez.getSaldo()));
                jlJogadorTurno.updateUI();
                y=1;
                jogadorVez.setPodeSortear(FALSE);
	    }
	    else{
		JOptionPane.showMessageDialog(null, "Você deve sortear uma carta");
		y=0;
                
            }
        }   
            cartas.add(cartas.get(0));	// copia a primeira carta para o fim da lista 
            cartas.remove(0);		// remove a primeira carta para a lista
        }    
            //verificar se o jogador faliu
            if(jogadorVez.getSaldo() <= 0){
            //encerra o jogo
            JOptionPane.showMessageDialog(null, "Você Faliu!");
            
            String[] novapartida = {"Nova Partida" , "Encerrar"};
            if(jogadorVez == j1){
                JOptionPane.showMessageDialog(null, "Jogador 2, é o vencedor com o saldo de: " + j2.getSaldo());
                int jogar = JOptionPane.showOptionDialog(null, "Deseja jogar novamente?",  // mensagem do corpo
                    "Decisão",                     // título
                    JOptionPane.YES_NO_OPTION,     // opções de botão
                    JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
                    null,                          // ícone da mensagem
                    novapartida,                        // títulos dos botões da tela
                    novapartida[0]);                    // indica o botão default

                    if(jogar == JOptionPane.YES_OPTION){
			//jogar de novo
//                        iniciarJogo(); 
                        new Tabuleiro().setVisible(true);
                        this.dispose();
			}
		    else{
                        //encerrar jogo
                        System.exit(0);			
			}
            }
            if(jogadorVez == j2){
                JOptionPane.showMessageDialog(null, "Jogador 1, é o vencedor com o saldo de: " + j1.getSaldo());
                int jogar = JOptionPane.showOptionDialog(null, "Deseja jogar novamente?",  // mensagem do corpo
                    "Decisão",                     // título
                    JOptionPane.YES_NO_OPTION,     // opções de botão
                    JOptionPane.QUESTION_MESSAGE,  // tipo da mensagem
                    null,                          // ícone da mensagem
                    novapartida,                        // títulos dos botões da tela
                    novapartida[0]);                    // indica o botão default

                    if(jogar == JOptionPane.YES_OPTION){
			//jogar de novo
//                        iniciarJogo(); 
                        new Tabuleiro().setVisible(true);
                        this.dispose();
                    }
		    else{
			//encerrar jogo
                        System.exit(0);                        
                    }
            }
        }
     
        // atualiza a rodada
        rodada++;
    }//GEN-LAST:event_jbJogarActionPerformed
    
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFComprarVender;
    private javax.swing.JTextField jTFNumeroCasa;
    private javax.swing.JTextField jTFValor;
    private javax.swing.JButton jbJogar;
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
    private Jogador j1, j2, banco;
    private Dado dado;
    private Objetivo carta;
    private int rodada, branco, preto, ocupado, ocupadoBranco, ocupadoPreto;

    // declaração da relação de todas as casas que existem no tabuleiro
    private List<Casa> casas = new ArrayList<Casa>();
    
    // declaração da relação de todos os labels de casa
    private List<JLabel> labels = new ArrayList<JLabel>();
    
    // cria uma variável global, para verificar qual é o jogador que está jogando
    private Jogador jogadorVez;
    
    // cria uma nova lista para armazenar as cartas sendo embaralhadas
    private List<Objetivo> cartas = new ArrayList <Objetivo>();
    
    //Cria uma lista temporaria para realizar a troca das cartas
    List<Objetivo> cartasTmp = new ArrayList<Objetivo>();
    
}
