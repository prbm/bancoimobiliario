package br.org.recresiduos.entidades;

import br.org.recresiduos.constantes.CorJogador;
import br.org.recresiduos.constantes.TipodeMateriais;
import javax.swing.JLabel;

/**
 *
 * @author Paulo
 */
public class Jogador {
    // criei um atributo nome para o Jogador, para facilitar a identificação dele
    private String nome;
    private int numeroCasa;
    private boolean podeSortear;
    private double saldo;
    private CorJogador cor;
    private JLabel peaoJogador;
    private JLabel iconeJogador;
    private Objetivo objetivo;
    private MaterialColetado materialColetado;
    private boolean jogando;
       
    public Jogador() {
        configuracaoInicial();
    }

    public Jogador(String nome, CorJogador cor, JLabel peaoJogador){
        this.nome = nome;
        this.cor = cor;
        this.peaoJogador = peaoJogador;
        configuracaoInicial();
    }

    private void configuracaoInicial(){
        numeroCasa = 1;
        saldo = 20000; // saldo do jogador no jogo
        podeSortear = true;
        // cria os materiais coletados
        this.materialColetado = new MaterialColetado();
        // determina que o jogador está sem objetivo no jogo
        this.objetivo = null;
        // determina se o jogador deu a saída
        this.jogando = false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public boolean isPodeSortear() {
        return podeSortear;
    }

    public void setPodeSortear(boolean podeSortear) {
        this.podeSortear = podeSortear;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CorJogador getCor() {
        return cor;
    }

    public void setCor(CorJogador cor) {
        this.cor = cor;
    }

    public JLabel getPeaoJogador() {
        return peaoJogador;
    }

    public JLabel getIconeJogador() {
        return iconeJogador;
    }

    public void setIconeJogador(JLabel iconeJogador) {
        this.iconeJogador = iconeJogador;
    }
    
    public void setPeaoJogador(JLabel peaoJogador) {
        this.peaoJogador = peaoJogador;
    }

    public void setObjetivo (Objetivo objetivo){
      this.objetivo = objetivo;  
    }

    public Objetivo getObjetivo (){
        return objetivo;
    }

    public MaterialColetado getMaterialColetado() {
        return materialColetado;
    }

    public void setMaterialColetado(MaterialColetado materialColetado) {
        this.materialColetado = materialColetado;
    }

    public void setMaterialColetado(double quantidade, TipodeMateriais tm) {
        //verifica o tipo de material, para saber onde jogar a quantidade
        switch(tm){
            case NENHUM:
                break;
            case MADEIRA:
                this.materialColetado.setQtdeMadeira(quantidade + this.materialColetado.getQtdeMadeira());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeMadeira());
                break;
            case METAL:
                this.materialColetado.setQtdeMetal(quantidade + this.materialColetado.getQtdeMetal());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeMetal());
                break;
            case ORGANICO:
                this.materialColetado.setQtdeOrganico(quantidade + this.materialColetado.getQtdeOrganico());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeOrganico());
                break;
            case NAORECICLAVEL:
                this.materialColetado.setQtdeNaoReciclavel(quantidade + this.materialColetado.getQtdeNaoReciclavel());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeNaoReciclavel());
                break;
            case FERRO:
                this.materialColetado.setQtdeFerro(quantidade + this.materialColetado.getQtdeFerro());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeFerro());
                break;
            case ALUMINIO:
                this.materialColetado.setQtdeAluminio(quantidade + this.materialColetado.getQtdeAluminio());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeAluminio());
                break;
            case OLEO:
                this.materialColetado.setQtdeOleo(quantidade + this.materialColetado.getQtdeOleo());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeOleo());
                break;
            case PLASTICO:
                this.materialColetado.setQtdePlastico(quantidade + this.materialColetado.getQtdePlastico());
                System.out.println("Agora tem : " + this.materialColetado.getQtdePlastico());
                break;
            case VIDRO:
                this.materialColetado.setQtdeVidro(quantidade + this.materialColetado.getQtdeVidro());
                System.out.println("Agora tem : " + this.materialColetado.getQtdeVidro());
                break;
            case PAPEL:
                this.materialColetado.setQtdePapel(quantidade + this.materialColetado.getQtdePapel());
                System.out.println("Agora tem : " + this.materialColetado.getQtdePapel());
                break;
        }
    }

    public boolean isJogando() {
        return jogando;
    }

    public void setJogando(boolean jogando) {
        this.jogando = jogando;
    }
    
    public void atualizarSaldo(double valor, String tipoAtualizacao) {
        System.out.println("Atualizando saldo do jogador [" + nome + "][" + tipoAtualizacao + "]");
        if (tipoAtualizacao.trim().toUpperCase().equals("AUMENTAR")) {
            this.saldo = this.saldo + valor;
        } else if (tipoAtualizacao.trim().toUpperCase().equals("DIMINUIR")) {
            this.saldo = this.saldo - valor;
        } else if (tipoAtualizacao.trim().toUpperCase().equals("ZERAR")) {
            this.saldo = 0.0;
        }
    }
}
