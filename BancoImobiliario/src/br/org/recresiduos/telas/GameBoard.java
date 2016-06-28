/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.uteis.Dado;
import br.org.recresiduos.constantes.CorJogador;
import br.org.recresiduos.constantes.TipodeMateriais;
import br.org.recresiduos.entidades.Casa;
import br.org.recresiduos.entidades.Jogador;
import br.org.recresiduos.entidades.Objetivo;
import java.awt.Component;
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     *
     * @param j determina a lista de jogadores que vai jogar
     */
    public GameBoard(Jogador[] j) {
        // inicializa os componentes básicos de tela
        initComponents();

        // copia os jogadores que foram criados na tela anterior
        this.jogadores = j;

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
        jLAmarelo.setName("Amarelo");
        jLAzul.setName("Azul");
        jLBranco.setName("Branco");
        jLPreto.setName("Preto");
        // ajusta o tamanho dos labels com as imagens dos jogadores
        int altura = jLP1.getHeight();
        int largura = jLP1.getWidth();
        jLAmarelo.setSize(largura, altura);
        jLAzul.setSize(largura, altura);
        jLBranco.setSize(largura, altura);
        jLPreto.setSize(largura, altura);
        // ajusta o tamanho dos labels de cada uma das casas;
        jLFundoCasa1.setSize(largura, altura);
        jLFundoCasa2.setSize(largura, altura);
        jLFundoCasa3.setSize(largura, altura);
        jLFundoCasa4.setSize(largura, altura);
        jLFundoCasa5.setSize(largura, altura);
        jLFundoCasa6.setSize(largura, altura);
        jLFundoCasa7.setSize(largura, altura);
        jLFundoCasa8.setSize(largura, altura);
        jLFundoCasa9.setSize(largura, altura);
        jLFundoCasa10.setSize(largura, altura);

        jLFundoCasa11.setSize(largura, altura);
        jLFundoCasa12.setSize(largura, altura);
        jLFundoCasa13.setSize(largura, altura);
        jLFundoCasa14.setSize(largura, altura);
        jLFundoCasa15.setSize(largura, altura);
        jLFundoCasa16.setSize(largura, altura);
        jLFundoCasa17.setSize(largura, altura);
        jLFundoCasa18.setSize(largura, altura);
        jLFundoCasa19.setSize(largura, altura);
        jLFundoCasa20.setSize(largura, altura);

        jLFundoCasa21.setSize(largura, altura);
        jLFundoCasa22.setSize(largura, altura);
        jLFundoCasa23.setSize(largura, altura);
        jLFundoCasa24.setSize(largura, altura);

        // associa as imagens a cada um dos labels
        jLFundoCasa1.setIcon(new ImageIcon(getClass().getResource("/imagensbir/Casa001.png")));
        jLFundoCasa2.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMetal.png")));
        jLFundoCasa3.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoPapel.png")));
        jLFundoCasa4.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoOrganico.png")));
        jLFundoCasa5.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoPlastico.png")));
        jLFundoCasa6.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoVidro.png")));
        jLFundoCasa7.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMadeira.png")));
        jLFundoCasa8.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMetal.png")));
        jLFundoCasa9.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoPapel.png")));
        jLFundoCasa10.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoNaoReciclavel.png")));

        jLFundoCasa11.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoOrganico.png")));
        jLFundoCasa12.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoPlastico.png")));
        jLFundoCasa13.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoNaoReciclavel.png")));
        jLFundoCasa14.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoVidro.png")));
        jLFundoCasa15.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMadeira.png")));
        jLFundoCasa16.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMetal.png")));
        jLFundoCasa17.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoPapel.png")));
        jLFundoCasa18.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoOrganico.png")));
        jLFundoCasa19.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoPlastico.png")));
        jLFundoCasa20.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoNaoReciclavel.png")));

        jLFundoCasa21.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoVidro.png")));
        jLFundoCasa22.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoNaoReciclavel.png")));
        jLFundoCasa23.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMadeira.png")));
        jLFundoCasa24.setIcon(new ImageIcon(getClass().getResource("/imagensbir/FundoMetal.png")));

        // associa as imagens de cada um dos peões dos jogadores
        jLAmarelo.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoAmarelo.png")));
        jLAzul.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoAzul.png")));
        jLBranco.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoBranco.png")));
        jLPreto.setIcon(new ImageIcon(getClass().getResource("/imagensbir/peaoPreto.png")));
        // adiciona as imagen de fundo das casas
        jLP1.add(jLFundoCasa1, 0);
        jLP2.add(jLFundoCasa2, 0);
        jLP3.add(jLFundoCasa3, 0);
        jLP4.add(jLFundoCasa4, 0);
        jLP5.add(jLFundoCasa5, 0);
        jLP6.add(jLFundoCasa6, 0);
        jLP7.add(jLFundoCasa7, 0);
        jLP8.add(jLFundoCasa8, 0);
        jLP9.add(jLFundoCasa9, 0);
        jLP10.add(jLFundoCasa10, 0);

        jLP11.add(jLFundoCasa11, 0);
        jLP12.add(jLFundoCasa12, 0);
        jLP13.add(jLFundoCasa13, 0);
        jLP14.add(jLFundoCasa14, 0);
        jLP15.add(jLFundoCasa15, 0);
        jLP16.add(jLFundoCasa16, 0);
        jLP17.add(jLFundoCasa17, 0);
        jLP18.add(jLFundoCasa18, 0);
        jLP19.add(jLFundoCasa19, 0);
        jLP20.add(jLFundoCasa20, 0);

        jLP21.add(jLFundoCasa21, 0);
        jLP22.add(jLFundoCasa22, 0);
        jLP23.add(jLFundoCasa23, 0);
        jLP24.add(jLFundoCasa24, 0);

        montaListaLayeredPanel();

        // ajusta a configuração dos jogadores que estão jogando
        for (int i = 0; i < 4; i++) {
            if (jogadores[i] != null) {
                JLabel tmp = new JLabel();
                switch (jogadores[i].getCor()) {
                    case AMARELO:
                        jogadores[i].setPeaoJogador(jLAmarelo);
                        tmp.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorAmarelo.png")));
                        jLP1.add(jLAmarelo, 0);
                        break;
                    case AZUL:
                        jogadores[i].setPeaoJogador(jLAzul);
                        tmp.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorAzul.png")));
                        jLP1.add(jLAzul, 0);
                        break;
                    case BRANCO:
                        jogadores[i].setPeaoJogador(jLBranco);
                        tmp.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorBranco.png")));
                        jLP1.add(jLBranco, 0);
                        break;
                    case PRETO:
                        jogadores[i].setPeaoJogador(jLPreto);
                        tmp.setIcon(new ImageIcon(getClass().getResource("/imagensbir/jogadorPreto.png")));
                        jLP1.add(jLPreto, 0);
                        break;
                }
                // atribui o ícone do jogador
                jogadores[i].setIconeJogador(tmp);
            }
        }

        // determina quem inicia o jogo
        if (jogadores[0] != null) {
            vezJogador = CorJogador.AMARELO;
        } else if (jogadores[1] != null) {
            vezJogador = CorJogador.AZUL;
        } else if (jogadores[2] != null) {
            vezJogador = CorJogador.BRANCO;
        } else if (jogadores[3] != null) {
            vezJogador = CorJogador.PRETO;
        }

        // determina quem é o última na rodada
        for (int i = 3; i >= 0; i--) {
            if (jogadores[i] != null) {
                jogadores[i].setUltimoNaRodada(true);
                break;
            }
        }

        //preencher casas tabuleiro
        configuraCasasTabuleiro();

        // atualiza a tela
        mostrarQuemEstaJogando();
        
        habilitarBotoesJogar();
    }

    private void configuraCasasTabuleiro() {

        // inicia a relação de casas do tabuleiro
        casas = new ArrayList<Casa>();
        //Coloquei para iniciar casa por casa assim quando chegarem as imagens só vou trocar os valores
        casas.add(new Casa(false, 0, 0, 0, 0, 0, TipodeMateriais.NENHUM));
        casas.add(new Casa(true, 0, 0, 0, 0, 1, TipodeMateriais.NENHUM));
        casas.add(new Casa(true, 1000, 100, 100, 1000, 2, TipodeMateriais.METAL));
        casas.add(new Casa(true, 4000, 400, 400, 4000, 3, TipodeMateriais.PAPEL));
        casas.add(new Casa(true, 3500, 350, 350, 3500, 4, TipodeMateriais.ORGANICO));
        casas.add(new Casa(true, 1800, 180, 180, 1800, 5, TipodeMateriais.PLASTICO));
        casas.add(new Casa(true, 2000, 200, 200, 2000, 6, TipodeMateriais.VIDRO));
        casas.add(new Casa(true, 1000, 100, 100, 1000, 7, TipodeMateriais.MADEIRA));
        casas.add(new Casa(true, 1600, 160, 160, 1600, 8, TipodeMateriais.METAL));
        casas.add(new Casa(true, 1400, 140, 140, 1400, 9, TipodeMateriais.PAPEL));
        casas.add(new Casa(true, 1400, 140, 140, 1400, 10, TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 11, TipodeMateriais.ORGANICO));
        casas.add(new Casa(true, 2200, 220, 220, 2200, 12, TipodeMateriais.PLASTICO));
        casas.add(new Casa(true, 2400, 240, 240, 2400, 13, TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 600, 60, 60, 600, 14, TipodeMateriais.VIDRO));
        casas.add(new Casa(true, 750, 75, 75, 750, 15, TipodeMateriais.MADEIRA));
        casas.add(new Casa(true, 1000, 100, 100, 1000, 16, TipodeMateriais.METAL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 17, TipodeMateriais.PAPEL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 18, TipodeMateriais.ORGANICO));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 19, TipodeMateriais.PLASTICO));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 20, TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 21, TipodeMateriais.VIDRO));
        casas.add(new Casa(true, 2600, 260, 260, 2600, 22, TipodeMateriais.NAORECICLAVEL));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 23, TipodeMateriais.MADEIRA));
        casas.add(new Casa(true, 3000, 300, 300, 3000, 24, TipodeMateriais.METAL));

        // código para efeitos de log
        System.out.println("Foram configuradas " + casas.size() + " casas");

        for (int i = 0; i < 25; i++) {
            Casa c = casas.get(i);
            System.out.println("Casa" + String.format("%03d", i) + "," + c.isPodeComprar() + "," + c.getAluguel());
        }
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

        // verifica quem está jogando
        Jogador j = dizQuemEstaJogando();

//        jLCorJogador.setIcon(j.getIconeJogador().getIcon());
//        // atualiza o nome do jogador
//        jLNomeJogador.setText(j.getNome());
//        //Atualiza o saldo do jogador
//        jLSaldo.setText(String.valueOf(j.getSaldo()));
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

    // Este método informa quem é o jogador que está jogando, pare evitar redundâncias
    // nos demais métodos
    private Jogador dizQuemEstaJogando() {
        switch (vezJogador) {
            case AMARELO:
                return jogadores[0];
            case AZUL:
                return jogadores[1];
            case BRANCO:
                return jogadores[2];
            case PRETO:
                return jogadores[3];
        }
        return null;
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
                j.setRodada(j.getRodada() + 1);
            }

            // posiciona o ícone na próxima casa
            poePeaoCasa(nroCasa, j.getPeaoJogador());
            // atualiza o número da casa onde o jogador se encontra
            j.setNumeroCasa(nroCasa);
            // força pausa de 0,01 segundos
            try {
                Thread.sleep(300);
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

    private void gameOver() {
        GameOver go = new GameOver(this, true, jogadores);
        go.setVisible(true);
    }

    private void jogar(){
        // verifica quem está jogando
        Jogador j = dizQuemEstaJogando();
        // cria um objeto do dado, para saber o número tirado
        Dado d = new Dado();

        mostrarQuemEstaJogando();

        // chama a tela que mostra o dado a ser rolado, e o que o jogador
        // consegui, na casa em que ele caiu
        LancarDado ld = new LancarDado(this, true, d, j);
        ld.setVisible(true);

        // move o peão pelo teclado e muda o cursos do mouse
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        movimentarJogador(d.getNumFace(), j);
        setCursor(Cursor.getDefaultCursor());

        // verifica se o jogador não caiu numa casa de não reciclável ou na casa Início
        if (casas.get(j.getNumeroCasa()).getMaterial() != TipodeMateriais.NENHUM
                && casas.get(j.getNumeroCasa()).getMaterial() != TipodeMateriais.NAORECICLAVEL) {

            // Sorteia o objetivo
            if (j.isPodeSortear()) {
                TelaSorteaCartas sco = new TelaSorteaCartas(this, true, j);
                sco.setVisible(true);
            }

            // chama a janela que trata a casa em que o jogador caiu
            ColetarMaterialCasa cmc = new ColetarMaterialCasa(this, true, j, casas.get(j.getNumeroCasa()));
            cmc.setVisible(true);

            // Atualiza o saldo do jogador
//            jLSaldo.setText(String.valueOf(j.getSaldo()));
        }

        // atualiza a rodada em que o jogador se encontra
        j.setRodada(j.getRodada() + 1);
        
        // se for a última rodada, encerra o jogo
        // verifica as rodadas do jogo
        if(j.isUltimoNaRodada() && j.getRodada()>1){
            gameOver();
            this.dispose();            
        }
        
        // verifica quem é o próximo jogador
        determinaProximoJogador(j);

        // habilita os botões de acordo com a vez do jogador
        habilitarBotoesJogar();
    }
    
    private void habilitarBotoesJogar(){
        // desabilita os botões
        jBJogarAmarelo.setEnabled(false);
        jBJogarAzul.setEnabled(false);
        jBJogarBranco.setEnabled(false);
        jBJogarPreto.setEnabled(false);
        
        // habilita o botão de acordo com a vez de quem está jogando
        switch(vezJogador){
            case AMARELO:
                jBJogarAmarelo.setEnabled(true);
                break;
            case AZUL:
                jBJogarAzul.setEnabled(true);
                break;
            case BRANCO:
                jBJogarBranco.setEnabled(true);
                break;
            case PRETO:
                jBJogarPreto.setEnabled(true);
                break;
        }
    }
    
    private void sair(){
        
        int res = JOptionPane.showConfirmDialog(this, "Isso fará o jogo terminar, você realmente quer fazer isso?", "Vai Sair?", JOptionPane.YES_NO_OPTION);

        switch (res) {
            case JOptionPane.OK_OPTION:
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                return;
        }
    }
    
//    // verifica qual material o jogador vai recolher
//    private void coletarMaterial(Jogador j) {
//
//        // lê o número da casa em que o jogador se encontra
//        int numeroCasa = j.getNumeroCasa();
//
//        System.out.println("Numero casa: " + numeroCasa
//                + "\n"
//                + "Material: " + casas.get(numeroCasa).getMaterial());
//
//        // verifica o material da casa que o jogador se encontra
//        switch (casas.get(numeroCasa).getMaterial()) {
//
//            case NENHUM:
//                System.out.println("Nada a recolher!");
//                break;
//            case METAL:
//                System.out.println("jogador " + j.getNome() + " quantidade metal: " + j.getMaterialColetado().getQtdeMetal());
//                j.setMaterialColetado(1, TipodeMateriais.METAL);
//                System.out.println("jogador " + j.getNome() + " quantidade metal atual: " + j.getMaterialColetado().getQtdeMetal());
//                break;
//            case PAPEL:
//                System.out.println("jogador " + j.getNome() + " quantidade papel: " + j.getMaterialColetado().getQtdePapel());
//                j.setMaterialColetado(1, TipodeMateriais.PAPEL);
//                System.out.println("jogador " + j.getNome() + " quantidade papel atual: " + j.getMaterialColetado().getQtdePapel());
//                break;
//            case ORGANICO:
//                System.out.println("jogador " + j.getNome() + " quantidade organico: " + j.getMaterialColetado().getQtdeOrganico());
//                j.setMaterialColetado(1, TipodeMateriais.ORGANICO);
//                System.out.println("jogador " + j.getNome() + " quantidade organico atual: " + j.getMaterialColetado().getQtdeOrganico());
//                break;
//            case PLASTICO:
//                System.out.println("jogador " + j.getNome() + " quantidade plastico: " + j.getMaterialColetado().getQtdePlastico());
//                j.setMaterialColetado(1, TipodeMateriais.PLASTICO);
//                System.out.println("jogador " + j.getNome() + " quantidade plastico atual: " + j.getMaterialColetado().getQtdePlastico());
//                break;
//            case VIDRO:
//                System.out.println("jogador " + j.getNome() + " quantidade vidro: " + j.getMaterialColetado().getQtdeVidro());
//                j.setMaterialColetado(1, TipodeMateriais.VIDRO);
//                System.out.println("jogador " + j.getNome() + " quantidade vidro atual: " + j.getMaterialColetado().getQtdeVidro());
//                break;
//            case MADEIRA:
//                System.out.println("jogador " + j.getNome() + " quantidade madeira: " + j.getMaterialColetado().getQtdeMadeira());
//                j.setMaterialColetado(1, TipodeMateriais.MADEIRA);
//                System.out.println("jogador " + j.getNome() + " quantidade madeira atual: " + j.getMaterialColetado().getQtdeMadeira());
//                break;
//            case NAORECICLAVEL:
//                System.out.println("jogador " + j.getNome() + " quantidade naoreciclavel: " + j.getMaterialColetado().getQtdeNaoReciclavel());
//                j.setMaterialColetado(1, TipodeMateriais.NAORECICLAVEL);
//                System.out.println("jogador " + j.getNome() + " quantidade naoreciclavel atual: " + j.getMaterialColetado().getQtdeNaoReciclavel());
//                break;
//        }
//
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
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
        jPanelJogadorAmarelo = new javax.swing.JPanel();
        jLIconeAmarelo = new javax.swing.JLabel();
        jLNomeAmarelo = new javax.swing.JLabel();
        jLObjetivoAmarelo = new javax.swing.JLabel();
        jLQtdeObjetivoAmarelo = new javax.swing.JLabel();
        jLSaldoAmarelo = new javax.swing.JLabel();
        jLValorSaldoAmarelo = new javax.swing.JLabel();
        jBJogarAmarelo = new javax.swing.JButton();
        jPanelJogadorAzul = new javax.swing.JPanel();
        jLIconeAmarelo1 = new javax.swing.JLabel();
        jLNomeAzul = new javax.swing.JLabel();
        jLObjetivoAzul = new javax.swing.JLabel();
        jLQtdeObjetivoAzul = new javax.swing.JLabel();
        jLSaldoAzul = new javax.swing.JLabel();
        jLValorSaldoAzul = new javax.swing.JLabel();
        jBJogarAzul = new javax.swing.JButton();
        jPanelJogadorAzul1 = new javax.swing.JPanel();
        jLIconeBranco = new javax.swing.JLabel();
        jLNomeBranco = new javax.swing.JLabel();
        jLObjetivoBranco = new javax.swing.JLabel();
        jLQtdeObjetivoBranco = new javax.swing.JLabel();
        jLSaldoBranco = new javax.swing.JLabel();
        jLValorSaldoBranco = new javax.swing.JLabel();
        jBJogarBranco = new javax.swing.JButton();
        jPanelJogadorAzul2 = new javax.swing.JPanel();
        jLIconePreto = new javax.swing.JLabel();
        jLNomePreto = new javax.swing.JLabel();
        jLObjetivoPreto = new javax.swing.JLabel();
        jLQtdeObjetivoPreto = new javax.swing.JLabel();
        jLSaldoPreto = new javax.swing.JLabel();
        jLValorSaldoPreto = new javax.swing.JLabel();
        jBJogarPreto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBNovoJogo = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPFundoTela.setBackground(new java.awt.Color(26, 64, 35));
        jPFundoTela.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(161, 165, 108)));

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
        jLP2.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP2.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP2Layout = new javax.swing.GroupLayout(jLP2);
        jLP2.setLayout(jLP2Layout);
        jLP2Layout.setHorizontalGroup(
            jLP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP2Layout.setVerticalGroup(
            jLP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP3.setBackground(new java.awt.Color(153, 255, 153));
        jLP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP3.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP3.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP3Layout = new javax.swing.GroupLayout(jLP3);
        jLP3.setLayout(jLP3Layout);
        jLP3Layout.setHorizontalGroup(
            jLP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP3Layout.setVerticalGroup(
            jLP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP4.setBackground(new java.awt.Color(153, 255, 153));
        jLP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP4.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP4.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP4Layout = new javax.swing.GroupLayout(jLP4);
        jLP4.setLayout(jLP4Layout);
        jLP4Layout.setHorizontalGroup(
            jLP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP4Layout.setVerticalGroup(
            jLP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP5.setBackground(new java.awt.Color(153, 255, 153));
        jLP5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP5.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP5.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP5Layout = new javax.swing.GroupLayout(jLP5);
        jLP5.setLayout(jLP5Layout);
        jLP5Layout.setHorizontalGroup(
            jLP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP5Layout.setVerticalGroup(
            jLP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP6.setBackground(new java.awt.Color(153, 255, 153));
        jLP6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP6.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP6.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP6Layout = new javax.swing.GroupLayout(jLP6);
        jLP6.setLayout(jLP6Layout);
        jLP6Layout.setHorizontalGroup(
            jLP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP6Layout.setVerticalGroup(
            jLP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP7.setBackground(new java.awt.Color(153, 255, 153));
        jLP7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP7.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP7.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP7Layout = new javax.swing.GroupLayout(jLP7);
        jLP7.setLayout(jLP7Layout);
        jLP7Layout.setHorizontalGroup(
            jLP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP7Layout.setVerticalGroup(
            jLP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP8.setBackground(new java.awt.Color(153, 255, 153));
        jLP8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP8.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP8.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP8Layout = new javax.swing.GroupLayout(jLP8);
        jLP8.setLayout(jLP8Layout);
        jLP8Layout.setHorizontalGroup(
            jLP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP8Layout.setVerticalGroup(
            jLP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP9.setBackground(new java.awt.Color(153, 255, 153));
        jLP9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP9.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP9.setMinimumSize(new java.awt.Dimension(75, 120));
        jLP9.setPreferredSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP9Layout = new javax.swing.GroupLayout(jLP9);
        jLP9.setLayout(jLP9Layout);
        jLP9Layout.setHorizontalGroup(
            jLP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP9Layout.setVerticalGroup(
            jLP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP10.setBackground(new java.awt.Color(153, 255, 153));
        jLP10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP10.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP10.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP10Layout = new javax.swing.GroupLayout(jLP10);
        jLP10.setLayout(jLP10Layout);
        jLP10Layout.setHorizontalGroup(
            jLP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP10Layout.setVerticalGroup(
            jLP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jLP11.setBackground(new java.awt.Color(153, 255, 153));
        jLP11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLP11.setMaximumSize(new java.awt.Dimension(75, 120));
        jLP11.setMinimumSize(new java.awt.Dimension(75, 120));

        javax.swing.GroupLayout jLP11Layout = new javax.swing.GroupLayout(jLP11);
        jLP11.setLayout(jLP11Layout);
        jLP11Layout.setHorizontalGroup(
            jLP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP11Layout.setVerticalGroup(
            jLP11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
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
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jLP24Layout.setVerticalGroup(
            jLP24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jPanelJogadorAmarelo.setBackground(new java.awt.Color(161, 165, 108));
        jPanelJogadorAmarelo.setMaximumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAmarelo.setMinimumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAmarelo.setPreferredSize(new java.awt.Dimension(156, 246));

        jLIconeAmarelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorAmarelo.png"))); // NOI18N

        jLNomeAmarelo.setBackground(new java.awt.Color(26, 64, 35));
        jLNomeAmarelo.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLNomeAmarelo.setText("jLabel1");

        jLObjetivoAmarelo.setBackground(new java.awt.Color(26, 64, 35));
        jLObjetivoAmarelo.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLObjetivoAmarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLObjetivoAmarelo.setText("Objetos Reciclados");
        jLObjetivoAmarelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLQtdeObjetivoAmarelo.setBackground(new java.awt.Color(26, 64, 35));
        jLQtdeObjetivoAmarelo.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLQtdeObjetivoAmarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeObjetivoAmarelo.setText("0");
        jLQtdeObjetivoAmarelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLSaldoAmarelo.setBackground(new java.awt.Color(26, 64, 35));
        jLSaldoAmarelo.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLSaldoAmarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSaldoAmarelo.setText("Saldo");
        jLSaldoAmarelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLValorSaldoAmarelo.setBackground(new java.awt.Color(26, 64, 35));
        jLValorSaldoAmarelo.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLValorSaldoAmarelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLValorSaldoAmarelo.setText("0");
        jLValorSaldoAmarelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBJogarAmarelo.setBackground(new java.awt.Color(26, 64, 35));
        jBJogarAmarelo.setForeground(new java.awt.Color(255, 255, 255));
        jBJogarAmarelo.setMnemonic('j');
        jBJogarAmarelo.setText("Jogar");
        jBJogarAmarelo.setEnabled(false);
        jBJogarAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarAmareloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJogadorAmareloLayout = new javax.swing.GroupLayout(jPanelJogadorAmarelo);
        jPanelJogadorAmarelo.setLayout(jPanelJogadorAmareloLayout);
        jPanelJogadorAmareloLayout.setHorizontalGroup(
            jPanelJogadorAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAmareloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLObjetivoAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(jPanelJogadorAmareloLayout.createSequentialGroup()
                        .addComponent(jLIconeAmarelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNomeAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLQtdeObjetivoAmarelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLSaldoAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLValorSaldoAmarelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBJogarAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelJogadorAmareloLayout.setVerticalGroup(
            jPanelJogadorAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAmareloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAmareloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNomeAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLIconeAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLObjetivoAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLQtdeObjetivoAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLSaldoAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLValorSaldoAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jBJogarAmarelo)
                .addContainerGap())
        );

        jPanelJogadorAzul.setBackground(new java.awt.Color(161, 165, 108));
        jPanelJogadorAzul.setMaximumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAzul.setMinimumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAzul.setPreferredSize(new java.awt.Dimension(156, 246));

        jLIconeAmarelo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorAzul.png"))); // NOI18N

        jLNomeAzul.setBackground(new java.awt.Color(26, 64, 35));
        jLNomeAzul.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLNomeAzul.setText("jLabel1");

        jLObjetivoAzul.setBackground(new java.awt.Color(26, 64, 35));
        jLObjetivoAzul.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLObjetivoAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLObjetivoAzul.setText("Objetos Reciclados");
        jLObjetivoAzul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLQtdeObjetivoAzul.setBackground(new java.awt.Color(26, 64, 35));
        jLQtdeObjetivoAzul.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLQtdeObjetivoAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeObjetivoAzul.setText("0");
        jLQtdeObjetivoAzul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLSaldoAzul.setBackground(new java.awt.Color(26, 64, 35));
        jLSaldoAzul.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLSaldoAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSaldoAzul.setText("Saldo");
        jLSaldoAzul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLValorSaldoAzul.setBackground(new java.awt.Color(26, 64, 35));
        jLValorSaldoAzul.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLValorSaldoAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLValorSaldoAzul.setText("0");
        jLValorSaldoAzul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBJogarAzul.setBackground(new java.awt.Color(26, 64, 35));
        jBJogarAzul.setForeground(new java.awt.Color(255, 255, 255));
        jBJogarAzul.setMnemonic('j');
        jBJogarAzul.setText("Jogar");
        jBJogarAzul.setEnabled(false);
        jBJogarAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarAzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJogadorAzulLayout = new javax.swing.GroupLayout(jPanelJogadorAzul);
        jPanelJogadorAzul.setLayout(jPanelJogadorAzulLayout);
        jPanelJogadorAzulLayout.setHorizontalGroup(
            jPanelJogadorAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLObjetivoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(jPanelJogadorAzulLayout.createSequentialGroup()
                        .addComponent(jLIconeAmarelo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNomeAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLQtdeObjetivoAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLSaldoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLValorSaldoAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBJogarAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelJogadorAzulLayout.setVerticalGroup(
            jPanelJogadorAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNomeAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLIconeAmarelo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLObjetivoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLQtdeObjetivoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLSaldoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLValorSaldoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jBJogarAzul)
                .addContainerGap())
        );

        jPanelJogadorAzul1.setBackground(new java.awt.Color(161, 165, 108));
        jPanelJogadorAzul1.setMaximumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAzul1.setMinimumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAzul1.setPreferredSize(new java.awt.Dimension(156, 246));

        jLIconeBranco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorBranco.png"))); // NOI18N

        jLNomeBranco.setBackground(new java.awt.Color(26, 64, 35));
        jLNomeBranco.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLNomeBranco.setText("jLabel1");

        jLObjetivoBranco.setBackground(new java.awt.Color(26, 64, 35));
        jLObjetivoBranco.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLObjetivoBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLObjetivoBranco.setText("Objetos Reciclados");
        jLObjetivoBranco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLQtdeObjetivoBranco.setBackground(new java.awt.Color(26, 64, 35));
        jLQtdeObjetivoBranco.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLQtdeObjetivoBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeObjetivoBranco.setText("0");
        jLQtdeObjetivoBranco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLSaldoBranco.setBackground(new java.awt.Color(26, 64, 35));
        jLSaldoBranco.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLSaldoBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSaldoBranco.setText("Saldo");
        jLSaldoBranco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLValorSaldoBranco.setBackground(new java.awt.Color(26, 64, 35));
        jLValorSaldoBranco.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLValorSaldoBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLValorSaldoBranco.setText("0");
        jLValorSaldoBranco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBJogarBranco.setBackground(new java.awt.Color(26, 64, 35));
        jBJogarBranco.setForeground(new java.awt.Color(255, 255, 255));
        jBJogarBranco.setMnemonic('j');
        jBJogarBranco.setText("Jogar");
        jBJogarBranco.setEnabled(false);
        jBJogarBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarBrancoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJogadorAzul1Layout = new javax.swing.GroupLayout(jPanelJogadorAzul1);
        jPanelJogadorAzul1.setLayout(jPanelJogadorAzul1Layout);
        jPanelJogadorAzul1Layout.setHorizontalGroup(
            jPanelJogadorAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAzul1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLObjetivoBranco, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(jPanelJogadorAzul1Layout.createSequentialGroup()
                        .addComponent(jLIconeBranco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNomeBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLQtdeObjetivoBranco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLSaldoBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLValorSaldoBranco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBJogarBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelJogadorAzul1Layout.setVerticalGroup(
            jPanelJogadorAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAzul1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAzul1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNomeBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLIconeBranco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLObjetivoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLQtdeObjetivoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLSaldoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLValorSaldoBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jBJogarBranco)
                .addContainerGap())
        );

        jPanelJogadorAzul2.setBackground(new java.awt.Color(161, 165, 108));
        jPanelJogadorAzul2.setMaximumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAzul2.setMinimumSize(new java.awt.Dimension(156, 246));
        jPanelJogadorAzul2.setPreferredSize(new java.awt.Dimension(156, 246));

        jLIconePreto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/jogadorPreto.png"))); // NOI18N

        jLNomePreto.setBackground(new java.awt.Color(26, 64, 35));
        jLNomePreto.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLNomePreto.setText("jLabel1");

        jLObjetivoPreto.setBackground(new java.awt.Color(26, 64, 35));
        jLObjetivoPreto.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLObjetivoPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLObjetivoPreto.setText("Objetos Reciclados");
        jLObjetivoPreto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLQtdeObjetivoPreto.setBackground(new java.awt.Color(26, 64, 35));
        jLQtdeObjetivoPreto.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLQtdeObjetivoPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeObjetivoPreto.setText("0");
        jLQtdeObjetivoPreto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLSaldoPreto.setBackground(new java.awt.Color(26, 64, 35));
        jLSaldoPreto.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLSaldoPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSaldoPreto.setText("Saldo");
        jLSaldoPreto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLValorSaldoPreto.setBackground(new java.awt.Color(26, 64, 35));
        jLValorSaldoPreto.setFont(new java.awt.Font("Traditional Arabic", 0, 14)); // NOI18N
        jLValorSaldoPreto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLValorSaldoPreto.setText("0");
        jLValorSaldoPreto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jBJogarPreto.setBackground(new java.awt.Color(26, 64, 35));
        jBJogarPreto.setForeground(new java.awt.Color(255, 255, 255));
        jBJogarPreto.setMnemonic('j');
        jBJogarPreto.setText("Jogar");
        jBJogarPreto.setEnabled(false);
        jBJogarPreto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarPretoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJogadorAzul2Layout = new javax.swing.GroupLayout(jPanelJogadorAzul2);
        jPanelJogadorAzul2.setLayout(jPanelJogadorAzul2Layout);
        jPanelJogadorAzul2Layout.setHorizontalGroup(
            jPanelJogadorAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAzul2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLObjetivoPreto, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(jPanelJogadorAzul2Layout.createSequentialGroup()
                        .addComponent(jLIconePreto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLNomePreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLQtdeObjetivoPreto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLSaldoPreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLValorSaldoPreto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBJogarPreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelJogadorAzul2Layout.setVerticalGroup(
            jPanelJogadorAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogadorAzul2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogadorAzul2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNomePreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLIconePreto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLObjetivoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLQtdeObjetivoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLSaldoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLValorSaldoPreto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jBJogarPreto)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(161, 165, 108));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 64, 35));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Banco de Resíduos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jBNovoJogo.setMnemonic('N');
        jBNovoJogo.setText("Novo Jogo");
        jBNovoJogo.setMaximumSize(new java.awt.Dimension(154, 56));
        jBNovoJogo.setMinimumSize(new java.awt.Dimension(154, 56));
        jBNovoJogo.setPreferredSize(new java.awt.Dimension(154, 56));
        jBNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoJogoActionPerformed(evt);
            }
        });

        jBSair.setMnemonic('S');
        jBSair.setText("Sair");
        jBSair.setMaximumSize(new java.awt.Dimension(154, 56));
        jBSair.setMinimumSize(new java.awt.Dimension(154, 56));
        jBSair.setPreferredSize(new java.awt.Dimension(154, 56));
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFundoTelaLayout = new javax.swing.GroupLayout(jPFundoTela);
        jPFundoTela.setLayout(jPFundoTelaLayout);
        jPFundoTelaLayout.setHorizontalGroup(
            jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addComponent(jLP22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLP24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLP23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJogadorAmarelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJogadorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJogadorAzul1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelJogadorAzul2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addComponent(jLP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLP10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addComponent(jLP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                                .addComponent(jLP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPFundoTelaLayout.setVerticalGroup(
            jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPFundoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLP6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLP10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addComponent(jLP11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelJogadorAzul1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelJogadorAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addComponent(jLP24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLP23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelJogadorAzul2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelJogadorAmarelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPFundoTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundoTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sair();
    }//GEN-LAST:event_formWindowClosing

    private void jBJogarAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarAmareloActionPerformed
        jogar();
    }//GEN-LAST:event_jBJogarAmareloActionPerformed

    private void jBJogarAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarAzulActionPerformed
        jogar();
    }//GEN-LAST:event_jBJogarAzulActionPerformed

    private void jBJogarBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarBrancoActionPerformed
        jogar();
    }//GEN-LAST:event_jBJogarBrancoActionPerformed

    private void jBJogarPretoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarPretoActionPerformed
        jogar();
    }//GEN-LAST:event_jBJogarPretoActionPerformed

    private void jBNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoJogoActionPerformed
        
        int res = JOptionPane.showConfirmDialog(this, "Para iniciar um novo jogo, este será encerrado sem vencedor, você realmente quer fazer isso?", "Recomeçar?", JOptionPane.YES_NO_OPTION);

        switch (res) {
            case JOptionPane.OK_OPTION:
                this.dispose();                
                CriaJogadores cj = new CriaJogadores();
                cj.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                return;
        }
    }//GEN-LAST:event_jBNovoJogoActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        sair();
    }//GEN-LAST:event_jBSairActionPerformed

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
                Jogador[] jog = new Jogador[4];
                new GameBoard(jog).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBJogarAmarelo;
    private javax.swing.JButton jBJogarAzul;
    private javax.swing.JButton jBJogarBranco;
    private javax.swing.JButton jBJogarPreto;
    private javax.swing.JButton jBNovoJogo;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLIconeAmarelo;
    private javax.swing.JLabel jLIconeAmarelo1;
    private javax.swing.JLabel jLIconeBranco;
    private javax.swing.JLabel jLIconePreto;
    private javax.swing.JLabel jLNomeAmarelo;
    private javax.swing.JLabel jLNomeAzul;
    private javax.swing.JLabel jLNomeBranco;
    private javax.swing.JLabel jLNomePreto;
    private javax.swing.JLabel jLObjetivoAmarelo;
    private javax.swing.JLabel jLObjetivoAzul;
    private javax.swing.JLabel jLObjetivoBranco;
    private javax.swing.JLabel jLObjetivoPreto;
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
    private javax.swing.JLabel jLQtdeObjetivoAmarelo;
    private javax.swing.JLabel jLQtdeObjetivoAzul;
    private javax.swing.JLabel jLQtdeObjetivoBranco;
    private javax.swing.JLabel jLQtdeObjetivoPreto;
    private javax.swing.JLabel jLSaldoAmarelo;
    private javax.swing.JLabel jLSaldoAzul;
    private javax.swing.JLabel jLSaldoBranco;
    private javax.swing.JLabel jLSaldoPreto;
    private javax.swing.JLabel jLValorSaldoAmarelo;
    private javax.swing.JLabel jLValorSaldoAzul;
    private javax.swing.JLabel jLValorSaldoBranco;
    private javax.swing.JLabel jLValorSaldoPreto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPFundoTela;
    private javax.swing.JPanel jPanelJogadorAmarelo;
    private javax.swing.JPanel jPanelJogadorAzul;
    private javax.swing.JPanel jPanelJogadorAzul1;
    private javax.swing.JPanel jPanelJogadorAzul2;
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

    private JLabel jLFundoCasa5 = new JLabel();
    private JLabel jLFundoCasa6 = new JLabel();
    private JLabel jLFundoCasa7 = new JLabel();
    private JLabel jLFundoCasa8 = new JLabel();
    private JLabel jLFundoCasa9 = new JLabel();
    private JLabel jLFundoCasa10 = new JLabel();

    private JLabel jLFundoCasa11 = new JLabel();
    private JLabel jLFundoCasa12 = new JLabel();
    private JLabel jLFundoCasa13 = new JLabel();
    private JLabel jLFundoCasa14 = new JLabel();
    private JLabel jLFundoCasa15 = new JLabel();
    private JLabel jLFundoCasa16 = new JLabel();
    private JLabel jLFundoCasa17 = new JLabel();
    private JLabel jLFundoCasa18 = new JLabel();
    private JLabel jLFundoCasa19 = new JLabel();
    private JLabel jLFundoCasa20 = new JLabel();

    private JLabel jLFundoCasa21 = new JLabel();
    private JLabel jLFundoCasa22 = new JLabel();
    private JLabel jLFundoCasa23 = new JLabel();
    private JLabel jLFundoCasa24 = new JLabel();

    // cria um array de tamanho fixo para os jogadores
    private final Jogador[] jogadores;
    private final int numeroCasasTabuleiro = 24;
    private List<JLayeredPane> jLPanels;

    private List<Casa> casas;
}
