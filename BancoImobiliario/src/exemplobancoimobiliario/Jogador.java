package exemplobancoimobiliario;

import javax.swing.JLabel;

/**
 *
 * @author Paulo
 */
public class Jogador {
    // criei um atributo nome para o Jogador, para facilitar a identificação dele
    private String nome;
    private int numeroCasa;
    private boolean podeJogar;
    private double saldo;
    private CorJogador cor;
    private JLabel peaoJogador;

    public Jogador() {
        configuracaoInicial();
    }

    public Jogador(String nome, CorJogador cor, JLabel peaoJogador){
        this.nome = nome;
        this.cor = cor;
        this.peaoJogador = peaoJogador;
        configuracaoInicial();
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

    public boolean isPodeJogar() {
        return podeJogar;
    }

    public void setPodeJogar(boolean podeJogar) {
        this.podeJogar = podeJogar;
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

    public void setPeaoJogador(JLabel peaoJogador) {
        this.peaoJogador = peaoJogador;
    }
    
    
    private void configuracaoInicial(){
        numeroCasa = 1;
        saldo = 20000; // saldo do jogador no jogo
        //saldo = 200;
        podeJogar = true;
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
