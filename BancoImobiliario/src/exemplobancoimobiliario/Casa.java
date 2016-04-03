/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplobancoimobiliario;

/**
 *
 * @author Paulo
 */
public class Casa {

    private boolean podeComprar;
    private double valorCasa, valorAluguel;
    private double aluguel, compra;
    private int numeroCasa;

    public Casa(boolean podeComprar, double valorCasa, double valorAluguel, double aluguel, double compra, int numeroCasa) {
        this.podeComprar = podeComprar;
        this.valorCasa = valorCasa;
        this.valorAluguel = valorAluguel;
        this.aluguel = aluguel;
        this.compra = compra;
        this.numeroCasa = numeroCasa;
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
    
    
}
