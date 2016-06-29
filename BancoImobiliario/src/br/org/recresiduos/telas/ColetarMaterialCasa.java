/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.constantes.TipodeMateriais;
import br.org.recresiduos.entidades.Casa;
import br.org.recresiduos.entidades.Jogador;
import br.org.recresiduos.uteis.Arredonda;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 */
public class ColetarMaterialCasa extends javax.swing.JDialog {

    /**
     * Creates new form LancaDado
     */
    public ColetarMaterialCasa(java.awt.Frame parent, boolean modal, Jogador jogador, Casa casa) {
        super(parent, modal);
        initComponents();

        // copia os dados do jogador e da casa, para uso nesta tela
        this.jogador = jogador;
        this.casa = casa;
        // define o nome do jogador
        jLNomeJogador.setText(this.jogador.getNome());
        // atualiza os labels de quantidade de material
        atualizaLabelsMaterialColetado();

        // preenche as informações da casa em que o jogador está
        jLTipoMaterial.setText(this.casa.getMaterial().toString());

        // verifica o tipo de material, para configurar os labels associados ao que precisa
        // ser coletado, de acordo com a cor do label que o jogador tá tem coletado
        switch (this.casa.getMaterial()) {
            case METAL:
                jLTipoMaterial.setBackground(jLMetal.getBackground());
                jLTipoMaterial.setForeground(jLMetal.getForeground());
                break;
            case MADEIRA:
                jLTipoMaterial.setBackground(jLMadeira.getBackground());
                jLTipoMaterial.setForeground(jLMadeira.getForeground());
                break;
            case PAPEL:
                jLTipoMaterial.setBackground(jLPapel.getBackground());
                jLTipoMaterial.setForeground(jLPapel.getForeground());
                break;
            case PLASTICO:
                jLTipoMaterial.setBackground(jLPlastico.getBackground());
                jLTipoMaterial.setForeground(jLPlastico.getForeground());
                break;
            case VIDRO:
                jLTipoMaterial.setBackground(jLVidro.getBackground());
                jLTipoMaterial.setForeground(jLVidro.getForeground());
                break;
            case ORGANICO:
                jLTipoMaterial.setBackground(jLOrganicos.getBackground());
                jLTipoMaterial.setForeground(jLOrganicos.getForeground());
                break;
        }

        // cria uma quantidade entre 1 e 4
        jLQtdeMaterial.setText(String.valueOf((new Random().nextInt(10)) + 1));
        // mostra a carta sorteada 
        jLCartaObjetivo.setIcon(this.jogador.getObjetivo().getImagem());

        // verifica os check boxes que podem ser habilitados
        habilitaDesabilitaCheckBoxReciclagem();
    }

    // efetua a coleta do material pelo jogador
    private void coletarMaterial() {

        // lê o número da casa em que o jogador se encontra
        int numeroCasa = this.jogador.getNumeroCasa();

        // log de debug
        System.out.println("casa[" + numeroCasa + "], Material: " + this.casa.getMaterial().toString() + ", Qtde: " + jLQtdeMaterial.getText());

        // verifica o quanto de material vai ser coletado
        double qtdeColetado = Double.parseDouble(jLQtdeMaterial.getText());
        // verifica o material da casa que o jogador se encontra, e ajusta a tela de acordo com a quantidade coletada
        switch (this.casa.getMaterial()) {
            case NENHUM:
                System.out.println("Nada a recolher!");
                break;
            case METAL:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade metal: " + this.jogador.getMaterialColetado().getQtdeMetal());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.METAL);
                jLQtdeMetal.setText(String.valueOf(this.jogador.getMaterialColetado().getQtdeMetal()));
                System.out.println("jogador " + this.jogador.getNome() + " quantidade metal atual: " + this.jogador.getMaterialColetado().getQtdeMetal());
                break;
            case PAPEL:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade papel: " + this.jogador.getMaterialColetado().getQtdePapel());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.PAPEL);
                jLQtdePapel.setText(String.valueOf(this.jogador.getMaterialColetado().getQtdePapel()));
                System.out.println("jogador " + this.jogador.getNome() + " quantidade papel atual: " + this.jogador.getMaterialColetado().getQtdePapel());
                break;
            case ORGANICO:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade organico: " + this.jogador.getMaterialColetado().getQtdeOrganico());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.ORGANICO);
                jLQtdeOrganicos.setText(String.valueOf(this.jogador.getMaterialColetado().getQtdeOrganico()));
                System.out.println("jogador " + this.jogador.getNome() + " quantidade organico atual: " + this.jogador.getMaterialColetado().getQtdeOrganico());
                break;
            case PLASTICO:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade plastico: " + this.jogador.getMaterialColetado().getQtdePlastico());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.PLASTICO);
                jLQtdePlastico.setText(String.valueOf(this.jogador.getMaterialColetado().getQtdePlastico()));
                System.out.println("jogador " + this.jogador.getNome() + " quantidade plastico atual: " + this.jogador.getMaterialColetado().getQtdePlastico());
                break;
            case VIDRO:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade vidro: " + this.jogador.getMaterialColetado().getQtdeVidro());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.VIDRO);
                jLQtdeVidro.setText(String.valueOf(this.jogador.getMaterialColetado().getQtdeVidro()));
                System.out.println("jogador " + this.jogador.getNome() + " quantidade vidro atual: " + this.jogador.getMaterialColetado().getQtdeVidro());
                break;
            case MADEIRA:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade madeira: " + this.jogador.getMaterialColetado().getQtdeMadeira());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.MADEIRA);
                jLQtdeMadeira.setText(String.valueOf(this.jogador.getMaterialColetado().getQtdeMadeira()));
                System.out.println("jogador " + this.jogador.getNome() + " quantidade madeira atual: " + this.jogador.getMaterialColetado().getQtdeMadeira());
                break;
            case NAORECICLAVEL:
                System.out.println("jogador " + this.jogador.getNome() + " quantidade naoreciclavel: " + this.jogador.getMaterialColetado().getQtdeNaoReciclavel());
                this.jogador.setMaterialColetado(qtdeColetado, TipodeMateriais.NAORECICLAVEL);
                System.out.println("jogador " + this.jogador.getNome() + " quantidade naoreciclavel atual: " + this.jogador.getMaterialColetado().getQtdeNaoReciclavel());
                break;
        }
        // impede que o jogador colete mais material
        jLQtdeMaterial.setText("0");
        jBColetar.setEnabled(false);
        jBColetar.setToolTipText("Você não pode coletar mais material");

        // atualiza os check boxes que indicam a reciclagem
        habilitaDesabilitaCheckBoxReciclagem();
    }
    
    private void atualizaLabelsMaterialColetado(){
        // preenche as quantidades que ele coletou, através de uma variável temporária
        String tmp = String.valueOf(this.jogador.getMaterialColetado().getQtdeMetal());
        jLQtdeMetal.setText(tmp);
        tmp = String.valueOf(this.jogador.getMaterialColetado().getQtdePapel());
        jLQtdePapel.setText(tmp);
        tmp = String.valueOf(this.jogador.getMaterialColetado().getQtdePlastico());
        jLQtdePlastico.setText(tmp);
        tmp = String.valueOf(this.jogador.getMaterialColetado().getQtdeMadeira());
        jLQtdeMadeira.setText(tmp);
        tmp = String.valueOf(this.jogador.getMaterialColetado().getQtdeVidro());
        jLQtdeVidro.setText(tmp);
        tmp = String.valueOf(this.jogador.getMaterialColetado().getQtdeOrganico());
        jLQtdeOrganicos.setText(tmp);

        // define a propriedade isSelected dos CheckBoxes como false
        jCBReciclaMetal.setSelected(false);
        jCBReciclaPapel.setSelected(false);
        jCBReciclaPlastico.setSelected(false);
        jCBReciclaMadeira.setSelected(false);
        jCBReciclaVidro.setSelected(false);
        jCBReciclaOrganico.setSelected(false);

        // se os valores coletados estiverem como zero, desabilita os botões
        if(this.jogador.getMaterialColetado().getQtdeMetal()<1)
            jCBReciclaMetal.setEnabled(false);
        if(this.jogador.getMaterialColetado().getQtdePapel()<1)
            jCBReciclaPapel.setEnabled(false);
        if(this.jogador.getMaterialColetado().getQtdePlastico()<1)
            jCBReciclaPlastico.setEnabled(false);
        if(this.jogador.getMaterialColetado().getQtdeMadeira()<1)
            jCBReciclaMadeira.setEnabled(false);
        if(this.jogador.getMaterialColetado().getQtdeVidro()<1)
            jCBReciclaVidro.setEnabled(false);
        if(this.jogador.getMaterialColetado().getQtdeOrganico()<1)
            jCBReciclaOrganico.setEnabled(false);
    }
    
    private void subMaterialColetado(){
        
        // subtrai o material coletado do objetivo
        double madeira = jogador.getMaterialColetado().getQtdeMadeira()- jogador.getObjetivo().getQtdeMadeira();
        double aluminio = jogador.getMaterialColetado().getQtdeAluminio() -jogador.getObjetivo().getQtdeAluminio();
        double ferro = jogador.getMaterialColetado().getQtdeFerro()- jogador.getObjetivo().getQtdeFerro();
        double metal = jogador.getMaterialColetado().getQtdeMetal() - jogador.getObjetivo().getQtdeMetal();
        double oleo = jogador.getMaterialColetado().getQtdeOleo() - jogador.getObjetivo().getQtdeOleo();
        double organico = jogador.getMaterialColetado().getQtdeOrganico() - jogador.getObjetivo().getQtdeOrganico();
        double papel = jogador.getMaterialColetado().getQtdePapel()- jogador.getObjetivo().getQtdePapel();
        double plastico = jogador.getMaterialColetado().getQtdePlastico()-jogador.getObjetivo().getQtdePlastico();
        double vidro = jogador.getMaterialColetado().getQtdeVidro()-jogador.getObjetivo().getQtdeVidro();
        
        // passa a informação
        jogador.setAtualizarMaterial(madeira, TipodeMateriais.MADEIRA);
        jogador.setAtualizarMaterial(aluminio, TipodeMateriais.ALUMINIO);
        jogador.setAtualizarMaterial(ferro, TipodeMateriais.FERRO);
        jogador.setAtualizarMaterial(metal, TipodeMateriais.METAL);
        jogador.setAtualizarMaterial(oleo, TipodeMateriais.OLEO);
        jogador.setAtualizarMaterial(organico, TipodeMateriais.ORGANICO);
        jogador.setAtualizarMaterial(papel, TipodeMateriais.PAPEL);
        jogador.setAtualizarMaterial(plastico, TipodeMateriais.PLASTICO);
        jogador.setAtualizarMaterial(vidro, TipodeMateriais.VIDRO);
        
        // atualiza os labels de quantidade
        atualizaLabelsMaterialColetado();
    }
	
    // verifica quais os check box de reciclagem que podem ser habilitados 
    private void habilitaDesabilitaCheckBoxReciclagem() {

        if (this.jogador.getMaterialColetado().getQtdeMetal() > 0) {
            jCBReciclaMetal.setEnabled(true);
        } else {
            jCBReciclaMetal.setEnabled(false);
        }

        if (this.jogador.getMaterialColetado().getQtdeMadeira() > 0) {
            jCBReciclaMadeira.setEnabled(true);
        } else {
            jCBReciclaMadeira.setEnabled(false);
        }

        if (this.jogador.getMaterialColetado().getQtdePapel() > 0) {
            jCBReciclaPapel.setEnabled(true);
        } else {
            jCBReciclaPapel.setEnabled(false);
        }

        if (this.jogador.getMaterialColetado().getQtdePlastico() > 0) {
            jCBReciclaPlastico.setEnabled(true);
        } else {
            jCBReciclaPlastico.setEnabled(false);
        }

        if (this.jogador.getMaterialColetado().getQtdeVidro() > 0) {
            jCBReciclaVidro.setEnabled(true);
        } else {
            jCBReciclaVidro.setEnabled(false);
        }

        if (this.jogador.getMaterialColetado().getQtdeOrganico() > 0) {
            jCBReciclaOrganico.setEnabled(true);
        } else {
            jCBReciclaOrganico.setEnabled(false);
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPFundoTela = new javax.swing.JPanel();
        jLNomeJogador = new javax.swing.JLabel();
        jPMaterialColetado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLMetal = new javax.swing.JLabel();
        jLPapel = new javax.swing.JLabel();
        jLPlastico = new javax.swing.JLabel();
        jLVidro = new javax.swing.JLabel();
        jLMadeira = new javax.swing.JLabel();
        jLOrganicos = new javax.swing.JLabel();
        jLQtdeOrganicos = new javax.swing.JLabel();
        jLQtdeMadeira = new javax.swing.JLabel();
        jLQtdeVidro = new javax.swing.JLabel();
        jLQtdePlastico = new javax.swing.JLabel();
        jLQtdePapel = new javax.swing.JLabel();
        jLQtdeMetal = new javax.swing.JLabel();
        jBReciclar = new javax.swing.JButton();
        jCBReciclaMetal = new javax.swing.JCheckBox();
        jCBReciclaPapel = new javax.swing.JCheckBox();
        jCBReciclaPlastico = new javax.swing.JCheckBox();
        jCBReciclaVidro = new javax.swing.JCheckBox();
        jCBReciclaMadeira = new javax.swing.JCheckBox();
        jCBReciclaOrganico = new javax.swing.JCheckBox();
        jPObjetivo = new javax.swing.JPanel();
        jLObjetivo = new javax.swing.JLabel();
        jBProduzir = new javax.swing.JButton();
        jLCartaObjetivo = new javax.swing.JLabel();
        jPColetar = new javax.swing.JPanel();
        jLMaterial = new javax.swing.JLabel();
        jLTipoMaterial = new javax.swing.JLabel();
        jLQtdeMaterial = new javax.swing.JLabel();
        jBDescartar = new javax.swing.JButton();
        jLEscolha = new javax.swing.JLabel();
        jBColetar = new javax.swing.JButton();
        jbContinuarJogando = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setMaximumSize(new java.awt.Dimension(660, 520));
        setMinimumSize(new java.awt.Dimension(660, 520));
        setName("dialogColetar"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(660, 520));
        setResizable(false);

        jPFundoTela.setBackground(new java.awt.Color(26, 64, 35));
        jPFundoTela.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPFundoTela.setMaximumSize(new java.awt.Dimension(656, 520));
        jPFundoTela.setMinimumSize(new java.awt.Dimension(656, 520));
        jPFundoTela.setName("FundoTela"); // NOI18N
        jPFundoTela.setPreferredSize(new java.awt.Dimension(656, 520));

        jLNomeJogador.setBackground(new java.awt.Color(161, 165, 108));
        jLNomeJogador.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLNomeJogador.setForeground(new java.awt.Color(26, 64, 35));
        jLNomeJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNomeJogador.setText("Nome Do Jogador");
        jLNomeJogador.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLNomeJogador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLNomeJogador.setMaximumSize(new java.awt.Dimension(250, 60));
        jLNomeJogador.setMinimumSize(new java.awt.Dimension(250, 60));
        jLNomeJogador.setOpaque(true);
        jLNomeJogador.setPreferredSize(new java.awt.Dimension(250, 60));

        jPMaterialColetado.setBackground(new java.awt.Color(161, 165, 108));
        jPMaterialColetado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPMaterialColetado.setForeground(new java.awt.Color(26, 64, 35));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 64, 35));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quantidades Coletadas");

        jLMetal.setBackground(new java.awt.Color(255, 255, 0));
        jLMetal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMetal.setText("Metal");
        jLMetal.setMaximumSize(new java.awt.Dimension(75, 35));
        jLMetal.setMinimumSize(new java.awt.Dimension(75, 35));
        jLMetal.setName("Metal"); // NOI18N
        jLMetal.setOpaque(true);
        jLMetal.setPreferredSize(new java.awt.Dimension(75, 35));

        jLPapel.setBackground(new java.awt.Color(0, 0, 153));
        jLPapel.setForeground(new java.awt.Color(255, 255, 255));
        jLPapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPapel.setText("Papel");
        jLPapel.setMaximumSize(new java.awt.Dimension(75, 35));
        jLPapel.setMinimumSize(new java.awt.Dimension(75, 35));
        jLPapel.setName("Metal"); // NOI18N
        jLPapel.setOpaque(true);
        jLPapel.setPreferredSize(new java.awt.Dimension(75, 35));

        jLPlastico.setBackground(new java.awt.Color(255, 0, 0));
        jLPlastico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPlastico.setText("Plástico");
        jLPlastico.setMaximumSize(new java.awt.Dimension(75, 35));
        jLPlastico.setMinimumSize(new java.awt.Dimension(75, 35));
        jLPlastico.setName("Plastico"); // NOI18N
        jLPlastico.setOpaque(true);
        jLPlastico.setPreferredSize(new java.awt.Dimension(75, 35));

        jLVidro.setBackground(new java.awt.Color(51, 153, 0));
        jLVidro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLVidro.setText("Vidro");
        jLVidro.setMaximumSize(new java.awt.Dimension(75, 35));
        jLVidro.setMinimumSize(new java.awt.Dimension(75, 35));
        jLVidro.setName("Vidro"); // NOI18N
        jLVidro.setOpaque(true);
        jLVidro.setPreferredSize(new java.awt.Dimension(75, 35));

        jLMadeira.setBackground(new java.awt.Color(0, 0, 0));
        jLMadeira.setForeground(new java.awt.Color(255, 255, 255));
        jLMadeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMadeira.setText("Madeira");
        jLMadeira.setMaximumSize(new java.awt.Dimension(75, 35));
        jLMadeira.setMinimumSize(new java.awt.Dimension(75, 35));
        jLMadeira.setName("Madeira"); // NOI18N
        jLMadeira.setOpaque(true);
        jLMadeira.setPreferredSize(new java.awt.Dimension(75, 35));

        jLOrganicos.setBackground(new java.awt.Color(153, 102, 0));
        jLOrganicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLOrganicos.setText("Orgânicos");
        jLOrganicos.setMaximumSize(new java.awt.Dimension(75, 35));
        jLOrganicos.setMinimumSize(new java.awt.Dimension(75, 35));
        jLOrganicos.setName("Organicos"); // NOI18N
        jLOrganicos.setOpaque(true);
        jLOrganicos.setPreferredSize(new java.awt.Dimension(75, 35));

        jLQtdeOrganicos.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdeOrganicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeOrganicos.setText("jLabel1");
        jLQtdeOrganicos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLQtdeOrganicos.setMaximumSize(new java.awt.Dimension(50, 35));
        jLQtdeOrganicos.setMinimumSize(new java.awt.Dimension(50, 35));
        jLQtdeOrganicos.setName("QtdeOrganicos"); // NOI18N
        jLQtdeOrganicos.setOpaque(true);
        jLQtdeOrganicos.setPreferredSize(new java.awt.Dimension(50, 35));

        jLQtdeMadeira.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdeMadeira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeMadeira.setText("jLabel1");
        jLQtdeMadeira.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLQtdeMadeira.setMaximumSize(new java.awt.Dimension(50, 35));
        jLQtdeMadeira.setMinimumSize(new java.awt.Dimension(50, 35));
        jLQtdeMadeira.setName("QtdeMadeira"); // NOI18N
        jLQtdeMadeira.setOpaque(true);
        jLQtdeMadeira.setPreferredSize(new java.awt.Dimension(50, 35));

        jLQtdeVidro.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdeVidro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeVidro.setText("jLabel1");
        jLQtdeVidro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLQtdeVidro.setMaximumSize(new java.awt.Dimension(50, 35));
        jLQtdeVidro.setMinimumSize(new java.awt.Dimension(50, 35));
        jLQtdeVidro.setName("QtdeVidro"); // NOI18N
        jLQtdeVidro.setOpaque(true);
        jLQtdeVidro.setPreferredSize(new java.awt.Dimension(50, 35));

        jLQtdePlastico.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdePlastico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdePlastico.setText("jLabel1");
        jLQtdePlastico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLQtdePlastico.setMaximumSize(new java.awt.Dimension(50, 35));
        jLQtdePlastico.setMinimumSize(new java.awt.Dimension(50, 35));
        jLQtdePlastico.setName("QtdePlastico"); // NOI18N
        jLQtdePlastico.setOpaque(true);
        jLQtdePlastico.setPreferredSize(new java.awt.Dimension(50, 35));

        jLQtdePapel.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdePapel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdePapel.setText("jLabel1");
        jLQtdePapel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLQtdePapel.setMaximumSize(new java.awt.Dimension(50, 35));
        jLQtdePapel.setMinimumSize(new java.awt.Dimension(50, 35));
        jLQtdePapel.setName("QtdePapel"); // NOI18N
        jLQtdePapel.setOpaque(true);
        jLQtdePapel.setPreferredSize(new java.awt.Dimension(50, 35));

        jLQtdeMetal.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdeMetal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeMetal.setText("jLabel1");
        jLQtdeMetal.setMaximumSize(new java.awt.Dimension(50, 35));
        jLQtdeMetal.setMinimumSize(new java.awt.Dimension(50, 35));
        jLQtdeMetal.setName("QtdeMetal"); // NOI18N
        jLQtdeMetal.setOpaque(true);
        jLQtdeMetal.setPreferredSize(new java.awt.Dimension(50, 35));

        jBReciclar.setMnemonic('R');
        jBReciclar.setText("Reciclar");
        jBReciclar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBReciclar.setMaximumSize(new java.awt.Dimension(105, 35));
        jBReciclar.setMinimumSize(new java.awt.Dimension(105, 35));
        jBReciclar.setName("Descartar"); // NOI18N
        jBReciclar.setPreferredSize(new java.awt.Dimension(105, 35));
        jBReciclar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReciclarActionPerformed(evt);
            }
        });

        jCBReciclaMetal.setEnabled(false);
        jCBReciclaMetal.setName("CBReciclaMetal"); // NOI18N
        jCBReciclaMetal.setOpaque(false);

        jCBReciclaPapel.setEnabled(false);
        jCBReciclaPapel.setName("CBReciclaPapel"); // NOI18N
        jCBReciclaPapel.setOpaque(false);

        jCBReciclaPlastico.setEnabled(false);
        jCBReciclaPlastico.setName("CBReciclaPlastico"); // NOI18N
        jCBReciclaPlastico.setOpaque(false);

        jCBReciclaVidro.setEnabled(false);
        jCBReciclaVidro.setName("CBReciclaVidro"); // NOI18N
        jCBReciclaVidro.setOpaque(false);

        jCBReciclaMadeira.setEnabled(false);
        jCBReciclaMadeira.setName("CBReciclaMadeira"); // NOI18N
        jCBReciclaMadeira.setOpaque(false);

        jCBReciclaOrganico.setEnabled(false);
        jCBReciclaOrganico.setName("CBReciclaOrganico"); // NOI18N
        jCBReciclaOrganico.setOpaque(false);

        javax.swing.GroupLayout jPMaterialColetadoLayout = new javax.swing.GroupLayout(jPMaterialColetado);
        jPMaterialColetado.setLayout(jPMaterialColetadoLayout);
        jPMaterialColetadoLayout.setHorizontalGroup(
            jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMaterialColetadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBReciclar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPMaterialColetadoLayout.createSequentialGroup()
                            .addComponent(jLMetal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLQtdeMetal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMaterialColetadoLayout.createSequentialGroup()
                            .addComponent(jLPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLQtdePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPMaterialColetadoLayout.createSequentialGroup()
                            .addComponent(jLPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLQtdePlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPMaterialColetadoLayout.createSequentialGroup()
                            .addComponent(jLVidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLQtdeVidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPMaterialColetadoLayout.createSequentialGroup()
                            .addComponent(jLMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLQtdeMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPMaterialColetadoLayout.createSequentialGroup()
                            .addComponent(jLOrganicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLQtdeOrganicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBReciclaMetal)
                    .addComponent(jCBReciclaPapel)
                    .addComponent(jCBReciclaPlastico)
                    .addComponent(jCBReciclaVidro)
                    .addComponent(jCBReciclaMadeira)
                    .addComponent(jCBReciclaOrganico))
                .addGap(23, 23, 23))
        );
        jPMaterialColetadoLayout.setVerticalGroup(
            jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMaterialColetadoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQtdeMetal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBReciclaMetal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQtdePapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBReciclaPapel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLPlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQtdePlastico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBReciclaPlastico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLVidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQtdeVidro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBReciclaVidro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQtdeMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBReciclaMadeira))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMaterialColetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLOrganicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLQtdeOrganicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBReciclaOrganico))
                .addGap(26, 26, 26)
                .addComponent(jBReciclar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLPlastico.getAccessibleContext().setAccessibleName("Plastico");
        jLOrganicos.getAccessibleContext().setAccessibleName("Organicos");
        jLQtdeOrganicos.getAccessibleContext().setAccessibleName("QtdeOrganicos");
        jLQtdeMadeira.getAccessibleContext().setAccessibleName("QtdeMadeira");
        jLQtdeVidro.getAccessibleContext().setAccessibleName("QtdeVidro");
        jLQtdePlastico.getAccessibleContext().setAccessibleName("QtdePlastico");
        jLQtdePapel.getAccessibleContext().setAccessibleName("QtdePapel");
        jLQtdeMetal.getAccessibleContext().setAccessibleName("QtdeMetal");
        jCBReciclaMetal.getAccessibleContext().setAccessibleName("CBReciclaMetal");
        jCBReciclaPapel.getAccessibleContext().setAccessibleName("CBReciclaPapel");
        jCBReciclaPlastico.getAccessibleContext().setAccessibleName("CBReciclaPlastico");
        jCBReciclaVidro.getAccessibleContext().setAccessibleName("CBReciclaVidro");
        jCBReciclaMadeira.getAccessibleContext().setAccessibleName("CBReciclaMadeira");
        jCBReciclaOrganico.getAccessibleContext().setAccessibleName("CBReciclaOrganico");

        jPObjetivo.setBackground(new java.awt.Color(161, 165, 108));
        jPObjetivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPObjetivo.setMaximumSize(new java.awt.Dimension(209, 341));
        jPObjetivo.setMinimumSize(new java.awt.Dimension(209, 341));
        jPObjetivo.setName("Objetivo"); // NOI18N
        jPObjetivo.setPreferredSize(new java.awt.Dimension(209, 341));

        jLObjetivo.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLObjetivo.setForeground(new java.awt.Color(26, 64, 35));
        jLObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLObjetivo.setText("Seu Objetivo");
        jLObjetivo.setName("Objetivo"); // NOI18N

        jBProduzir.setMnemonic('P');
        jBProduzir.setText("Produzir");
        jBProduzir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBProduzir.setMaximumSize(new java.awt.Dimension(105, 35));
        jBProduzir.setMinimumSize(new java.awt.Dimension(105, 35));
        jBProduzir.setName("Coletar"); // NOI18N
        jBProduzir.setPreferredSize(new java.awt.Dimension(105, 35));
        jBProduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProduzirActionPerformed(evt);
            }
        });

        jLCartaObjetivo.setBackground(new java.awt.Color(204, 0, 0));
        jLCartaObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCartaObjetivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoFrente.png"))); // NOI18N
        jLCartaObjetivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLCartaObjetivo.setName("CartaObjetivo"); // NOI18N

        javax.swing.GroupLayout jPObjetivoLayout = new javax.swing.GroupLayout(jPObjetivo);
        jPObjetivo.setLayout(jPObjetivoLayout);
        jPObjetivoLayout.setHorizontalGroup(
            jPObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLObjetivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPObjetivoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPObjetivoLayout.createSequentialGroup()
                        .addComponent(jLCartaObjetivo)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPObjetivoLayout.createSequentialGroup()
                        .addComponent(jBProduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPObjetivoLayout.setVerticalGroup(
            jPObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPObjetivoLayout.createSequentialGroup()
                .addComponent(jLObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCartaObjetivo)
                .addGap(18, 18, 18)
                .addComponent(jBProduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jLObjetivo.getAccessibleContext().setAccessibleName("Objetivo");
        jLCartaObjetivo.getAccessibleContext().setAccessibleName("CartaObjetivo");

        jPColetar.setBackground(new java.awt.Color(161, 165, 108));
        jPColetar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPColetar.setMaximumSize(new java.awt.Dimension(196, 341));
        jPColetar.setMinimumSize(new java.awt.Dimension(196, 341));
        jPColetar.setName("Coletar"); // NOI18N
        jPColetar.setPreferredSize(new java.awt.Dimension(196, 341));

        jLMaterial.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLMaterial.setForeground(new java.awt.Color(26, 64, 35));
        jLMaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLMaterial.setText("Material Para Coletar");
        jLMaterial.setName("Material"); // NOI18N

        jLTipoMaterial.setBackground(new java.awt.Color(255, 255, 0));
        jLTipoMaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTipoMaterial.setText("Tipo de Material");
        jLTipoMaterial.setMaximumSize(new java.awt.Dimension(75, 35));
        jLTipoMaterial.setMinimumSize(new java.awt.Dimension(75, 35));
        jLTipoMaterial.setName("TipoMaterial"); // NOI18N
        jLTipoMaterial.setOpaque(true);
        jLTipoMaterial.setPreferredSize(new java.awt.Dimension(75, 35));

        jLQtdeMaterial.setBackground(new java.awt.Color(255, 255, 255));
        jLQtdeMaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLQtdeMaterial.setText("jLabel1");
        jLQtdeMaterial.setMaximumSize(new java.awt.Dimension(75, 35));
        jLQtdeMaterial.setMinimumSize(new java.awt.Dimension(75, 35));
        jLQtdeMaterial.setName("QtdeMaterial"); // NOI18N
        jLQtdeMaterial.setOpaque(true);
        jLQtdeMaterial.setPreferredSize(new java.awt.Dimension(75, 35));

        jBDescartar.setMnemonic('D');
        jBDescartar.setText("Descartar");
        jBDescartar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBDescartar.setMaximumSize(new java.awt.Dimension(105, 35));
        jBDescartar.setMinimumSize(new java.awt.Dimension(105, 35));
        jBDescartar.setName("Descartar"); // NOI18N
        jBDescartar.setPreferredSize(new java.awt.Dimension(105, 35));
        jBDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDescartarActionPerformed(evt);
            }
        });

        jLEscolha.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLEscolha.setForeground(new java.awt.Color(26, 64, 35));
        jLEscolha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEscolha.setText("O que você vai fazer?");
        jLEscolha.setName("Material"); // NOI18N

        jBColetar.setMnemonic('C');
        jBColetar.setText("Coletar");
        jBColetar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBColetar.setMaximumSize(new java.awt.Dimension(105, 35));
        jBColetar.setMinimumSize(new java.awt.Dimension(105, 35));
        jBColetar.setName("Coletar"); // NOI18N
        jBColetar.setPreferredSize(new java.awt.Dimension(105, 35));
        jBColetar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBColetarMouseClicked(evt);
            }
        });
        jBColetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBColetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPColetarLayout = new javax.swing.GroupLayout(jPColetar);
        jPColetar.setLayout(jPColetarLayout);
        jPColetarLayout.setHorizontalGroup(
            jPColetarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
            .addComponent(jLEscolha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPColetarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPColetarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBColetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPColetarLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPColetarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLTipoMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLQtdeMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPColetarLayout.setVerticalGroup(
            jPColetarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColetarLayout.createSequentialGroup()
                .addComponent(jLMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTipoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLQtdeMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBColetar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDescartar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLTipoMaterial.getAccessibleContext().setAccessibleName("TipoMaterial");
        jLQtdeMaterial.getAccessibleContext().setAccessibleName("QtdeMaterial");

        jbContinuarJogando.setMnemonic('J');
        jbContinuarJogando.setText("Continuar Jogando");
        jbContinuarJogando.setActionCommand("ContinuarJogando");
        jbContinuarJogando.setName("ContinuarJogando"); // NOI18N
        jbContinuarJogando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContinuarJogandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPFundoTelaLayout = new javax.swing.GroupLayout(jPFundoTela);
        jPFundoTela.setLayout(jPFundoTelaLayout);
        jPFundoTelaLayout.setHorizontalGroup(
            jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLNomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPFundoTelaLayout.createSequentialGroup()
                        .addComponent(jPObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbContinuarJogando, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPMaterialColetado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPColetar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPFundoTelaLayout.setVerticalGroup(
            jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPFundoTelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPFundoTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMaterialColetado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPObjetivo, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jPColetar, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbContinuarJogando, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jPObjetivo.getAccessibleContext().setAccessibleName("Objetivo");
        jPColetar.getAccessibleContext().setAccessibleName("Coletar");
        jbContinuarJogando.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundoTela, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFundoTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPFundoTela.getAccessibleContext().setAccessibleName("FundoTela");

        getAccessibleContext().setAccessibleName("DialogColetar");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDescartarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBDescartarActionPerformed

    private void jBColetarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBColetarMouseClicked
        coletarMaterial();
    }//GEN-LAST:event_jBColetarMouseClicked

    private void jBProduzirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProduzirActionPerformed
        
        if(jogador.getMaterialColetado().getQtdeMadeira()>= jogador.getObjetivo().getQtdeMadeira()){
            if(jogador.getMaterialColetado().getQtdeAluminio()>=jogador.getObjetivo().getQtdeAluminio()){
                if(jogador.getMaterialColetado().getQtdeFerro()>=jogador.getObjetivo().getQtdeFerro()){
                    if(jogador.getMaterialColetado().getQtdeMetal()>=jogador.getObjetivo().getQtdeMetal()){
                        if(jogador.getMaterialColetado().getQtdeOleo()>=jogador.getObjetivo().getQtdeOleo()){
                            if(jogador.getMaterialColetado().getQtdeOrganico()>=jogador.getObjetivo().getQtdeOrganico()){
                                if(jogador.getMaterialColetado().getQtdePapel()>=jogador.getObjetivo().getQtdePapel()){
                                    if(jogador.getMaterialColetado().getQtdePlastico()>=jogador.getObjetivo().getQtdePlastico()){
                                        if(jogador.getMaterialColetado().getQtdeVidro()>=jogador.getObjetivo().getQtdeVidro()){
                                            
                                          // atualiza o saldo do jogador com o valor da carta objetivo produzida  
                                          jogador.atualizarSaldo(jogador.getObjetivo().getValor(), "AUMENTAR");
                                          
                                          // subtrair os materiais que foram usados para a produção
                                          subMaterialColetado();
                                          
                                          // permite que o jogador produza apenas uma vez
                                          jBProduzir.setEnabled(false);
                                          jBProduzir.setToolTipText("Você lucrou "+jogador.getObjetivo().getValor()+" com a sua produção! ");
                                          
                                          // Se produziu o objetivo, pode sortear novo objetivo
                                          jogador.setPodeSortear(true);
                                          
                                          JOptionPane.showMessageDialog(null, "Você cumpriu o objetivo objetivo! ");
                                          jogador.setNumeroObjetivosConcluidos(jogador.getNumeroObjetivosConcluidos()+1);
                                        }
                                        else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
                                    }
                                    else  JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
                                } 
                                else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
                            }
                            else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
                        }
                        else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
                    }
                    else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
                }
                else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
            }
            else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
        }  
        else JOptionPane.showMessageDialog(null, "Ainda falta alguns materiais! ");
    }//GEN-LAST:event_jBProduzirActionPerformed


    private void jbContinuarJogandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContinuarJogandoActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbContinuarJogandoActionPerformed



    private void jBReciclarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReciclarActionPerformed
        // verifica se entre os check boxes de reciclagem, se pelo menos um está selecionado
        String msg = "";

        if (jCBReciclaMetal.isEnabled() && jCBReciclaMetal.isSelected()) {
            msg += "\n" + TipodeMateriais.METAL.name();
        }

        if (jCBReciclaPapel.isEnabled() && jCBReciclaPapel.isSelected()) {
            msg += "\n" + TipodeMateriais.PAPEL.name();
        }

        if (jCBReciclaPlastico.isEnabled() && jCBReciclaPlastico.isSelected()) {
            msg += "\n" + TipodeMateriais.PLASTICO.name();
        }

        if (jCBReciclaVidro.isEnabled() && jCBReciclaVidro.isSelected()) {
            msg += "\n" + TipodeMateriais.VIDRO.name();
        }

        if (jCBReciclaMadeira.isEnabled() && jCBReciclaMadeira.isSelected()) {
            msg += "\n" + TipodeMateriais.MADEIRA.name();
        }

        if (jCBReciclaOrganico.isEnabled() && jCBReciclaOrganico.isSelected()) {
            msg += "\n" + TipodeMateriais.ORGANICO.name();
        }

        // se não tiver sido selecionado nenhum item
        if (msg.trim().isEmpty()) {
            // mosttra a mensagem e aborta
            JOptionPane.showMessageDialog(null, "Você tem que selecionar pelo menos um item para reciclar!", "Cuidado", JOptionPane.ERROR_MESSAGE);
            jCBReciclaMetal.requestFocus();
            return;
        } else {
            // mostra os itens selecionados e verifica se o jogador quer realmente reciclar
            msg = "Se você quer reciclar todos estes itens:\n\n" + msg + "\n\nClique SIM para confirmar";
            int res = JOptionPane.showConfirmDialog(null, msg, "Confirma a reciclagem", JOptionPane.YES_NO_OPTION);

            if (res == JOptionPane.NO_OPTION) {
                return;
            }
        }

        // declara uma variável para determinar o ganho com a reciclagem
        double ganhoReciclagem = 0.0;
        double valorReciclagem = 0.0;

        // verifica as quantidades que serão recicladas, e calcula o lucro
        if (jCBReciclaMetal.isEnabled() && jCBReciclaMetal.isSelected()) {
            valorReciclagem = Double.parseDouble(jLQtdeMetal.getText());
            ganhoReciclagem += TipodeMateriais.METAL.getValorMaterial() * valorReciclagem;
            this.jogador.getMaterialColetado().setQtdeMetal(0);
        }

        if (jCBReciclaPapel.isEnabled() && jCBReciclaPapel.isSelected()) {
            valorReciclagem = Double.parseDouble(jLQtdePapel.getText());
            ganhoReciclagem += TipodeMateriais.PAPEL.getValorMaterial() * valorReciclagem;        
            this.jogador.getMaterialColetado().setQtdePapel(0);
        }

        if (jCBReciclaPlastico.isEnabled() && jCBReciclaPlastico.isSelected()) {
            valorReciclagem = Double.parseDouble(jLQtdePlastico.getText());
            ganhoReciclagem += TipodeMateriais.PLASTICO.getValorMaterial() * valorReciclagem;        
            this.jogador.getMaterialColetado().setQtdePlastico(0);
        }

        if (jCBReciclaVidro.isEnabled() && jCBReciclaVidro.isSelected()) {
            valorReciclagem = Double.parseDouble(jLQtdeVidro.getText());
            ganhoReciclagem += TipodeMateriais.VIDRO.getValorMaterial() * valorReciclagem;        
            this.jogador.getMaterialColetado().setQtdeVidro(0);
        }

        if (jCBReciclaMadeira.isEnabled() && jCBReciclaMadeira.isSelected()) {
            valorReciclagem = Double.parseDouble(jLQtdeMadeira.getText());
            ganhoReciclagem += TipodeMateriais.MADEIRA.getValorMaterial() * valorReciclagem;        
            this.jogador.getMaterialColetado().setQtdeMadeira(0);
        }

        if (jCBReciclaOrganico.isEnabled() && jCBReciclaOrganico.isSelected()) {
            valorReciclagem = Double.parseDouble(jLQtdeOrganicos.getText());
            ganhoReciclagem += TipodeMateriais.ORGANICO.getValorMaterial() * valorReciclagem;
            this.jogador.getMaterialColetado().setQtdeOrganico(0);
        }
        
        ganhoReciclagem = new Arredonda(ganhoReciclagem).valorArredondado();
        JOptionPane.showMessageDialog(null, "Você lucrou " + ganhoReciclagem + " reciclando seus materiais!");

        // atualiza os labels de quantidade de material
        atualizaLabelsMaterialColetado();
        
        // atualiza o saldo do jogador
        this.jogador.setSaldo(this.jogador.getSaldo() + ganhoReciclagem);
        
        // desabilita botão reciclar
        jBReciclar.setEnabled(false);
    }//GEN-LAST:event_jBReciclarActionPerformed

    private void jBColetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBColetarActionPerformed
        coletarMaterial();
    }//GEN-LAST:event_jBColetarActionPerformed

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
            java.util.logging.Logger.getLogger(ColetarMaterialCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ColetarMaterialCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ColetarMaterialCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ColetarMaterialCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ColetarMaterialCasa dialog = new ColetarMaterialCasa(new javax.swing.JFrame(), true, new Jogador(), new Casa());
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
    private javax.swing.JButton jBColetar;
    private javax.swing.JButton jBDescartar;
    private javax.swing.JButton jBProduzir;
    private javax.swing.JButton jBReciclar;
    private javax.swing.JCheckBox jCBReciclaMadeira;
    private javax.swing.JCheckBox jCBReciclaMetal;
    private javax.swing.JCheckBox jCBReciclaOrganico;
    private javax.swing.JCheckBox jCBReciclaPapel;
    private javax.swing.JCheckBox jCBReciclaPlastico;
    private javax.swing.JCheckBox jCBReciclaVidro;
    private javax.swing.JLabel jLCartaObjetivo;
    private javax.swing.JLabel jLEscolha;
    private javax.swing.JLabel jLMadeira;
    private javax.swing.JLabel jLMaterial;
    private javax.swing.JLabel jLMetal;
    private javax.swing.JLabel jLNomeJogador;
    private javax.swing.JLabel jLObjetivo;
    private javax.swing.JLabel jLOrganicos;
    private javax.swing.JLabel jLPapel;
    private javax.swing.JLabel jLPlastico;
    private javax.swing.JLabel jLQtdeMadeira;
    private javax.swing.JLabel jLQtdeMaterial;
    private javax.swing.JLabel jLQtdeMetal;
    private javax.swing.JLabel jLQtdeOrganicos;
    private javax.swing.JLabel jLQtdePapel;
    private javax.swing.JLabel jLQtdePlastico;
    private javax.swing.JLabel jLQtdeVidro;
    private javax.swing.JLabel jLTipoMaterial;
    private javax.swing.JLabel jLVidro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPColetar;
    private javax.swing.JPanel jPFundoTela;
    private javax.swing.JPanel jPMaterialColetado;
    private javax.swing.JPanel jPObjetivo;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton jbContinuarJogando;
    // End of variables declaration//GEN-END:variables

    // Atributos adicionais para esta classe
    private Jogador jogador;
    private Casa casa;

}
