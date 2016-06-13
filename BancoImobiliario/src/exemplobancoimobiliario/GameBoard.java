/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobancoimobiliario;

import java.awt.Component;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author Paulo
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     */
    public GameBoard() {
        // inicializa os componentes básicos de tela
        initComponents();

        // cria os labels que vão receber as figuras dos jogadores
        jLAzul = new JLabel();
        jLPreto = new JLabel();
        jLBranco = new JLabel();
        jLAmarelo = new JLabel();

        // cria os labels que vão receber a figura de fundo da casa
        jLFundoCasa1 = new JLabel();
        jLFundoCasa2 = new JLabel();
        jLFundoCasa3 = new JLabel();
        jLFundoCasa4 = new JLabel();
        // determina os nomes dos peões
        jLFundoCasa1.setName("Fundo001");
        jLFundoCasa2.setName("Fundo001");
        jLFundoCasa3.setName("Fundo001");
        jLFundoCasa4.setName("Fundo001");

        jLAmarelo.setName("Amarelo");
        jLAzul.setName("Azul");
        jLBranco.setName("Branco");
        jLPreto.setName("Preto");
        // ajusta o tamanho dos labels com as imagens dos jogadores
        jLAmarelo.setSize(jLP1.getWidth(), jLP1.getHeight());
        jLAzul.setSize(jLP1.getWidth(), jLP1.getHeight());
        jLBranco.setSize(jLP1.getWidth(), jLP1.getHeight());
        jLPreto.setSize(jLP1.getWidth(), jLP1.getHeight());
        // ajusta o tamanho dos labels de cada uma das casas;
        jLFundoCasa1.setSize(jLP1.getWidth(), jLP1.getHeight());
        jLFundoCasa2.setSize(jLP1.getWidth(), jLP1.getHeight());
        jLFundoCasa3.setSize(jLP1.getWidth(), jLP1.getHeight());
        jLFundoCasa4.setSize(jLP1.getWidth(), jLP1.getHeight());
        // associa as imagens a cada um dos labels
        jLFundoCasa1.setIcon(new ImageIcon(getClass().getResource("/imagensbir/Casa001.png")));
        jLFundoCasa2.setIcon(new ImageIcon(getClass().getResource("/imagens/Casa002.png")));
        jLFundoCasa3.setIcon(new ImageIcon(getClass().getResource("/imagens/Casa003.png")));
        jLFundoCasa4.setIcon(new ImageIcon(getClass().getResource("/imagens/Casa004.png")));  

        // associa as imagens de cada um dos peões dos jogadores
        jLAmarelo.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoAmarelo.png")));
        jLAzul.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoAzul.png")));
        jLBranco.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoBranco.png")));
        jLPreto.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoPreto.png")));
        // adiciona as imagens aos layers da casa de início
        jLP1.add(jLFundoCasa1, 0);
        jLP1.add(jLAmarelo, 0);
        jLP1.add(jLAzul, 0);
        jLP1.add(jLBranco, 0);
        jLP1.add(jLPreto, 0);
        // adiciona as imagen de fundo das demais casas
        jLP2.add(jLFundoCasa2, 0);
        jLP3.add(jLFundoCasa3, 0);
        jLP4.add(jLFundoCasa4, 0);

        montaListaLayeredPanel();

        // relaciona os jogadores que estão jogando
        jogadores = new Jogador[4];
        jogadores[0] = new Jogador("Manfred Von Richtofen", CorJogador.AMARELO, jLAmarelo);
        jogadores[1] = new Jogador("Rene Fonck", CorJogador.AZUL, jLAzul);
        jogadores[2] = new Jogador("William Bishop", CorJogador.BRANCO, jLBranco);
        jogadores[3] = new Jogador("Ernst Udet", CorJogador.PRETO, jLPreto);

        // determina quem inicializa o jogo
        vezJogador = CorJogador.AMARELO;

        // atualiza a tela
        mostrarQuemEstaJogando();

    }

    private void montaListaLayeredPanel() {
        jLPanels = new ArrayList<>();
        jLPanels.add(jLP1);
        jLPanels.add(jLP2);
        jLPanels.add(jLP3);
        jLPanels.add(jLP4);
        jLPanels.add(jLP5);
        jLPanels.add(jLP6);
        jLPanels.add(jLP7);
        jLPanels.add(jLP8);
        jLPanels.add(jLP9);
        jLPanels.add(jLP10);
        jLPanels.add(jLP11);
        jLPanels.add(jLP12);
        jLPanels.add(jLP13);
        jLPanels.add(jLP14);
        jLPanels.add(jLP15);
        jLPanels.add(jLP16);
        jLPanels.add(jLP17);
        jLPanels.add(jLP18);
        jLPanels.add(jLP19);
        jLPanels.add(jLP20);
        jLPanels.add(jLP21);
        jLPanels.add(jLP22);
        jLPanels.add(jLP23);
        jLPanels.add(jLP24);
    }

    private void mostrarQuemEstaJogando() {

        // define uma variável temporária
        Jogador j = new Jogador();

        // verifica quem está jogando, para atualizar a tela
        switch (vezJogador) {
            case AMARELO:
                j = jogadores[0];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorAmarelo.png")));
                break;
            case AZUL:
                j = jogadores[1];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorAzul.png")));
                break;
            case BRANCO:
                j = jogadores[2];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorBranco.png")));
                break;
            case PRETO:
                j = jogadores[3];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorPreto.png")));

                break;
        }

        // atualiza o nome do jogador
        jLNomeJogador.setText(j.getNome());

    }

    private void determinaProximoJogador(Jogador j) {
        // verifica quem é o próximo jogador
        switch (j.getCor()) {
            case AMARELO:
                if (jogadores[1] != null) {
                    vezJogador = CorJogador.AZUL;
                } else if (jogadores[2] != null) {
                    vezJogador = CorJogador.BRANCO;
                } else if (jogadores[3] != null) {
                    vezJogador = CorJogador.PRETO;
                } else {
                    vezJogador = CorJogador.AMARELO;
                }
                break;
            case AZUL:
                if (jogadores[2] != null) {
                    vezJogador = CorJogador.BRANCO;
                } else if (jogadores[3] != null) {
                    vezJogador = CorJogador.PRETO;
                } else if (jogadores[0] != null) {
                    vezJogador = CorJogador.AMARELO;
                } else {
                    vezJogador = CorJogador.AZUL;
                }
                break;
            case BRANCO:
                if (jogadores[3] != null) {
                    vezJogador = CorJogador.PRETO;
                } else if (jogadores[0] != null) {
                    vezJogador = CorJogador.AMARELO;
                } else if (jogadores[1] != null) {
                    vezJogador = CorJogador.AZUL;
                } else {
                    vezJogador = CorJogador.BRANCO;
                }
                break;
            case PRETO:
                if (jogadores[0] != null) {
                    vezJogador = CorJogador.AMARELO;
                } else if (jogadores[1] != null) {
                    vezJogador = CorJogador.AZUL;
                } else if (jogadores[2] != null) {
                    vezJogador = CorJogador.BRANCO;
                } else {
                    vezJogador = CorJogador.PRETO;
                }
                break;
        }
    }

    private void movimentarJogador(int numeroCasasAndar, Jogador j) {
        // verifica qual é a casa atual do jogador
        int nroCasa = j.getNumeroCasa();

        // formata o ícone andando
        for (int cont = 0; cont < numeroCasasAndar; cont++) {
            // tira o ícone da casa onde ele está
            tiraPeaoCasa(nroCasa, j.getPeaoJogador());
            // verifica qual é a próxima casa a colocar o ícone
            nroCasa++;
            if (nroCasa > numeroCasasTabuleiro) // corrige o contador para voltar à primeira casa
            {
                nroCasa = 1;
            }

            // posiciona o ícone na próxima casa
            poePeaoCasa(nroCasa, j.getPeaoJogador());

            // atualiza o número da casa onde o jogador se encontra
            j.setNumeroCasa(nroCasa);
            // força pausa de 0,01 segundos
            try {
                Thread.sleep(850);
            } catch (InterruptedException ie) {
                System.out.println("[LOG] movimentarJogador() InterruptedException: " + ie.getMessage());
            }
        }
    }

    private void tiraPeaoCasa(int casa, JLabel peao) {

        // obtém o label onde o jogador está posicionado
        JLayeredPane jLPTmp = jLPanels.get(casa - 1);

        // lê os labels que estão no layer
        Component[] componentes = jLPTmp.getComponentsInLayer(0);

        // verifica se o label do jogador existe no layer
        for (Component c : componentes) {
            // se existir, remove ele do layer
            if (c.getName().equals(peao.getName())) {
                jLPTmp.remove(peao);
                // atualiza o desenho do layer
                jLPTmp.revalidate();
                jLPTmp.paintComponents(jLPTmp.getGraphics());
                break;
            }
        }
    }

    private void poePeaoCasa(int casa, JLabel peao) {

        // obtém o label onde o jogador será posicionado
        JLayeredPane jLPTmp = jLPanels.get(casa - 1);
        // adiciona o ícone do jogador ao layer
        jLPTmp.add(peao, 0);
        // atualiza o desenho do layer
        jLPTmp.revalidate();
        jLPTmp.paintComponents(jLPTmp.getGraphics());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFundoTela = new javax.swing.JPanel();
        jLP1 = new javax.swing.JLayeredPane();
        jLP2 = new javax.swing.JLayeredPane();
        jLP3 = new javax.swing.JLayeredPane();
        jLP4 = new javax.swing.JLayeredPane();
        jLP5 = new javax.swing.JLayeredPane();
        jLP6 = new javax.swing.JLayeredPane();
        jLP7 = new javax.swing.JLayeredPane();
        jLP8 = new javax.swing.JLayeredPane();
        jLP9 = new javax.swing.JLayeredPane();
        jLP10 = new javax.swing.JLayeredPane();
        jLP11 = new javax.swing.JLayeredPane();
        jLP12 = new javax.swing.JLayeredPane();
        jLP13 = new javax.swing.JLayeredPane();
        jLP14 = new javax.swing.JLayeredPane();
        jLP15 = new javax.swing.JLayeredPane();
        jLP16 = new javax.swing.JLayeredPane();
        jLP17 = new javax.swing.JLayeredPane();
        jLP18 = new javax.swing.JLayeredPane();
        jLP19 = new javax.swing.JLayeredPane();
        jLP20 = new javax.swing.JLayeredPane();
        jLP21 = new javax.swing.JLayeredPane();
        jLP22 = new javax.swing.JLayeredPane();
        jLP23 = new javax.swing.JLayeredPane();
        jLP24 = new javax.swing.JLayeredPane();
        jLJogador = new javax.swing.JLabel();
        jLCorJogador = new javax.swing.JLabel();
        jLNomeJogador = new javax.swing.JLabel();
        jBJogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jPFundoTela.setBackground(new java.awt.Color(255, 102, 102));

        jLP1.setBackground(new java.awt.Color(102, 102, 0));
        jLP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP1.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP1.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP1Layout = new javax.swing.GroupLayout(jLP1);
        jLP1.setLayout(jLP1Layout);
        jLP1Layout.setHorizontalGroup(
            jLP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP1Layout.setVerticalGroup(
            jLP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP2.setBackground(new java.awt.Color(153, 255, 153));
        jLP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP2.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP2.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP2Layout = new javax.swing.GroupLayout(jLP2);
        jLP2.setLayout(jLP2Layout);
        jLP2Layout.setHorizontalGroup(
            jLP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP2Layout.setVerticalGroup(
            jLP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP3.setBackground(new java.awt.Color(153, 255, 153));
        jLP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP3.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP3.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP3Layout = new javax.swing.GroupLayout(jLP3);
        jLP3.setLayout(jLP3Layout);
        jLP3Layout.setHorizontalGroup(
            jLP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP3Layout.setVerticalGroup(
            jLP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP4.setBackground(new java.awt.Color(153, 255, 153));
        jLP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP4.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP4.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP4Layout = new javax.swing.GroupLayout(jLP4);
        jLP4.setLayout(jLP4Layout);
        jLP4Layout.setHorizontalGroup(
            jLP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP4Layout.setVerticalGroup(
            jLP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP5.setBackground(new java.awt.Color(153, 255, 153));
        jLP5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP5.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP5.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP5Layout = new javax.swing.GroupLayout(jLP5);
        jLP5.setLayout(jLP5Layout);
        jLP5Layout.setHorizontalGroup(
            jLP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP5Layout.setVerticalGroup(
            jLP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP6.setBackground(new java.awt.Color(153, 255, 153));
        jLP6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP6.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP6.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP6Layout = new javax.swing.GroupLayout(jLP6);
        jLP6.setLayout(jLP6Layout);
        jLP6Layout.setHorizontalGroup(
            jLP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP6Layout.setVerticalGroup(
            jLP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP7.setBackground(new java.awt.Color(153, 255, 153));
        jLP7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP7.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP7.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP7Layout = new javax.swing.GroupLayout(jLP7);
        jLP7.setLayout(jLP7Layout);
        jLP7Layout.setHorizontalGroup(
            jLP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP7Layout.setVerticalGroup(
            jLP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP8.setBackground(new java.awt.Color(153, 255, 153));
        jLP8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP8.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP8.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP8Layout = new javax.swing.GroupLayout(jLP8);
        jLP8.setLayout(jLP8Layout);
        jLP8Layout.setHorizontalGroup(
            jLP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP8Layout.setVerticalGroup(
            jLP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP9.setBackground(new java.awt.Color(153, 255, 153));
        jLP9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP9.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP9.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP9Layout = new javax.swing.GroupLayout(jLP9);
        jLP9.setLayout(jLP9Layout);
        jLP9Layout.setHorizontalGroup(
            jLP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP9Layout.setVerticalGroup(
            jLP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP10.setBackground(new java.awt.Color(153, 255, 153));
        jLP10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP10.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP10.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP10Layout = new javax.swing.GroupLayout(jLP10);
        jLP10.setLayout(jLP10Layout);
        jLP10Layout.setHorizontalGroup(
            jLP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP10Layout.setVerticalGroup(
            jLP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP11.setBackground(new java.awt.Color(153, 255, 153));
        jLP11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP11.setMaximumSize(new java.awt.Dimension(75, 150));
        jLP11.setMinimumSize(new java.awt.Dimension(75, 150));

        javax.swing.GroupLayout jLP11Layout = new javax.swing.GroupLayout(jLP11);
        jLP11.setLayout(jLP11Layout);
        jLP11Layout.setHorizontalGroup(
            jLP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP11Layout.setVerticalGroup(
            jLP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLP12.setBackground(new java.awt.Color(153, 255, 153));
        jLP12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP12.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP12.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP12Layout = new javax.swing.GroupLayout(jLP12);
        jLP12.setLayout(jLP12Layout);
        jLP12Layout.setHorizontalGroup(
            jLP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP12Layout.setVerticalGroup(
            jLP12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP13.setBackground(new java.awt.Color(153, 255, 153));
        jLP13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP13.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP13.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP13Layout = new javax.swing.GroupLayout(jLP13);
        jLP13.setLayout(jLP13Layout);
        jLP13Layout.setHorizontalGroup(
            jLP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP13Layout.setVerticalGroup(
            jLP13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP14.setBackground(new java.awt.Color(153, 255, 153));
        jLP14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP14.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP14.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP14Layout = new javax.swing.GroupLayout(jLP14);
        jLP14.setLayout(jLP14Layout);
        jLP14Layout.setHorizontalGroup(
            jLP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP14Layout.setVerticalGroup(
            jLP14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP15.setBackground(new java.awt.Color(153, 255, 153));
        jLP15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP15.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP15.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP15Layout = new javax.swing.GroupLayout(jLP15);
        jLP15.setLayout(jLP15Layout);
        jLP15Layout.setHorizontalGroup(
            jLP15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP15Layout.setVerticalGroup(
            jLP15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP16.setBackground(new java.awt.Color(153, 255, 153));
        jLP16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP16.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP16.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP16Layout = new javax.swing.GroupLayout(jLP16);
        jLP16.setLayout(jLP16Layout);
        jLP16Layout.setHorizontalGroup(
            jLP16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP16Layout.setVerticalGroup(
            jLP16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP17.setBackground(new java.awt.Color(153, 255, 153));
        jLP17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP17.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP17.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP17Layout = new javax.swing.GroupLayout(jLP17);
        jLP17.setLayout(jLP17Layout);
        jLP17Layout.setHorizontalGroup(
            jLP17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP17Layout.setVerticalGroup(
            jLP17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP18.setBackground(new java.awt.Color(153, 255, 153));
        jLP18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP18.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP18.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP18Layout = new javax.swing.GroupLayout(jLP18);
        jLP18.setLayout(jLP18Layout);
        jLP18Layout.setHorizontalGroup(
            jLP18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP18Layout.setVerticalGroup(
            jLP18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP19.setBackground(new java.awt.Color(153, 255, 153));
        jLP19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP19.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP19.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP19Layout = new javax.swing.GroupLayout(jLP19);
        jLP19.setLayout(jLP19Layout);
        jLP19Layout.setHorizontalGroup(
            jLP19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP19Layout.setVerticalGroup(
            jLP19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP20.setBackground(new java.awt.Color(153, 255, 153));
        jLP20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP20.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP20.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP20Layout = new javax.swing.GroupLayout(jLP20);
        jLP20.setLayout(jLP20Layout);
        jLP20Layout.setHorizontalGroup(
            jLP20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP20Layout.setVerticalGroup(
            jLP20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP21.setBackground(new java.awt.Color(153, 255, 153));
        jLP21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP21.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP21.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP21Layout = new javax.swing.GroupLayout(jLP21);
        jLP21.setLayout(jLP21Layout);
        jLP21Layout.setHorizontalGroup(
            jLP21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP21Layout.setVerticalGroup(
            jLP21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP22.setBackground(new java.awt.Color(153, 255, 153));
        jLP22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP22.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP22.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP22Layout = new javax.swing.GroupLayout(jLP22);
        jLP22.setLayout(jLP22Layout);
        jLP22Layout.setHorizontalGroup(
            jLP22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP22Layout.setVerticalGroup(
            jLP22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP23.setBackground(new java.awt.Color(153, 255, 153));
        jLP23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP23.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP23.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP23Layout = new javax.swing.GroupLayout(jLP23);
        jLP23.setLayout(jLP23Layout);
        jLP23Layout.setHorizontalGroup(
            jLP23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP23Layout.setVerticalGroup(
            jLP23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP24.setBackground(new java.awt.Color(153, 255, 153));
        jLP24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP24.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP24.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP24Layout = new javax.swing.GroupLayout(jLP24);
        jLP24.setLayout(jLP24Layout);
        jLP24Layout.setHorizontalGroup(
            jLP24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLP24Layout.setVerticalGroup(
            jLP24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLJogador.setText("jogador:");

        jLCorJogador.setBackground(new java.awt.Color(0, 0, 204));
        jLCorJogador.setText("jLabel1");
        jLCorJogador.setMaximumSize(new java.awt.Dimension(30, 30));
        jLCorJogador.setMinimumSize(new java.awt.Dimension(30, 30));
        jLCorJogador.setPreferredSize(new java.awt.Dimension(30, 30));

        jLNomeJogador.setText("Nome Jogador:");
        jLNomeJogador.setToolTipText("");

        jBJogar.setMnemonic('J');
        jBJogar.setText("Jogar");
        jBJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFundoTelaLayout = new javax.swing.GroupLayout(jPFundoTela);
        jPFundoTela.setLayout(jPFundoTelaLayout);
        jPFundoTelaLayout.setHorizontalGroup(
            jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addComponent(jLP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLP22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLP23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLP24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                        .addComponent(jLP21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLP20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLP19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLP18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFundoTelaLayout.createSequentialGroup()
                                        .addComponent(jLJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLCorJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addComponent(jBJogar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLP11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLP13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPFundoTelaLayout.setVerticalGroup(
            jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLP6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLP10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLJogador)
                                    .addComponent(jLCorJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLNomeJogador))
                                .addGap(30, 30, 30)
                                .addComponent(jBJogar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFundoTelaLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLP24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFundoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPFundoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarActionPerformed

        // define uma variável temporária
        Jogador j = new Jogador();
        JLabel peao = new JLabel();
        Dado d = new Dado();

        // verifica quem está jogando, para atualizar a tela
        switch (vezJogador) {
            case AMARELO:
                j = jogadores[0];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorAmarelo.png")));
                peao = jLAmarelo;
                break;
            case AZUL:
                j = jogadores[1];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorAzul.png")));
                peao = jLAzul;
                break;
            case BRANCO:
                j = jogadores[2];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorBranco.png")));
                peao = jLBranco;
                break;
            case PRETO:
                j = jogadores[3];
                jLCorJogador.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorPreto.png")));
                peao = jLPreto;
                break;
        }

        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        mostrarQuemEstaJogando();
        movimentarJogador(d.rolarDados(), j);
        determinaProximoJogador(j);
        mostrarQuemEstaJogando();
        setCursor(Cursor.getDefaultCursor());
        
    }//GEN-LAST:event_jBJogarActionPerformed

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
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBJogar;
    private javax.swing.JLabel jLCorJogador;
    private javax.swing.JLabel jLJogador;
    private javax.swing.JLabel jLNomeJogador;
    private javax.swing.JLayeredPane jLP1;
    private javax.swing.JLayeredPane jLP10;
    private javax.swing.JLayeredPane jLP11;
    private javax.swing.JLayeredPane jLP12;
    private javax.swing.JLayeredPane jLP13;
    private javax.swing.JLayeredPane jLP14;
    private javax.swing.JLayeredPane jLP15;
    private javax.swing.JLayeredPane jLP16;
    private javax.swing.JLayeredPane jLP17;
    private javax.swing.JLayeredPane jLP18;
    private javax.swing.JLayeredPane jLP19;
    private javax.swing.JLayeredPane jLP2;
    private javax.swing.JLayeredPane jLP20;
    private javax.swing.JLayeredPane jLP21;
    private javax.swing.JLayeredPane jLP22;
    private javax.swing.JLayeredPane jLP23;
    private javax.swing.JLayeredPane jLP24;
    private javax.swing.JLayeredPane jLP3;
    private javax.swing.JLayeredPane jLP4;
    private javax.swing.JLayeredPane jLP5;
    private javax.swing.JLayeredPane jLP6;
    private javax.swing.JLayeredPane jLP7;
    private javax.swing.JLayeredPane jLP8;
    private javax.swing.JLayeredPane jLP9;
    private javax.swing.JPanel jPFundoTela;
    // End of variables declaration//GEN-END:variables

    private CorJogador vezJogador;

    // cria os labels que vão receber as figuras dos jogadores    
    private JLabel jLAzul = new JLabel();
    private JLabel jLPreto = new JLabel();
    private JLabel jLBranco = new JLabel();
    private JLabel jLAmarelo = new JLabel();
    // cria os labels que vão receber a figura de fundo da casa
    private JLabel jLFundoCasa1 = new JLabel();
    private JLabel jLFundoCasa2 = new JLabel();
    private JLabel jLFundoCasa3 = new JLabel();
    private JLabel jLFundoCasa4 = new JLabel();

    private final Jogador[] jogadores;
    private final int numeroCasasTabuleiro = 24;
    private List<JLayeredPane> jLPanels;
}
