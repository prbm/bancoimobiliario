/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobancoimobiliario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paulo
 */
public class Casa {

    private boolean podeComprar;
    private double valorCasa;
    private double valorAluguel;
    private double aluguel;
    private double compra;
    private int numeroCasa;
    private boolean estaOcupada;
    private List<Jogador> jogadoresOcupandoCasa;

    public Casa(boolean podeComprar, double valorCasa, double valorAluguel, double aluguel, double compra, int numeroCasa) {
        this.podeComprar = podeComprar;
        this.valorCasa = valorCasa;
        this.valorAluguel = valorAluguel;
        this.aluguel = aluguel;
        this.compra = compra;
        this.numeroCasa = numeroCasa;
        this.estaOcupada = false;
        this.jogadoresOcupandoCasa = new ArrayList<Jogador>();
    }

    public Casa(){}

    public boolean isPodeComprar() {
        return podeComprar;
    }

    public void setPodeComprar(boolean podeComprar) {
        this.podeComprar = podeComprar;
    }

    public double getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(double valorCasa) {
        this.valorCasa = valorCasa;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public double getCompra() {
        return compra;
    }

    public void setCompra(double compra) {
        this.compra = compra;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public List<Jogador> getJogadoresOcupandoCasa() {
        return jogadoresOcupandoCasa;
    }

    public void setJogadoresOcupandoCasa(List<Jogador> jogadoresOcupandoCasa) {
        this.jogadoresOcupandoCasa = jogadoresOcupandoCasa;
    }

    public void ocuparCasa(Jogador j){
        // verifica se não atingiu o limite máximo de jogadores
        if(this.jogadoresOcupandoCasa.size()<=2)
            // se o jogador ainda não ocupa a casa
            if(!this.jogadoresOcupandoCasa.contains(j))
                // adiciona o jogador à lista de ocupantes
                this.jogadoresOcupandoCasa.add(j);

        System.out.println("[OCUPAR] Jogadores Ocupando a casa");
        for(int i = 0; i < this.jogadoresOcupandoCasa.size(); i++)
            System.out.println("Jogador " + this.jogadoresOcupandoCasa.get(i).getNome());

    }
    
    public void desocuparCasa(Jogador j){
        this.jogadoresOcupandoCasa.remove(j);

        System.out.println("[DESOCUPAR] Jogadores Ocupando a casa");
        for(int i = 0; i < this.jogadoresOcupandoCasa.size(); i++)
            System.out.println("Jogador " + this.jogadoresOcupandoCasa.get(i).getNome());

    }
    
}
