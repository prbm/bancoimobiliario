/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.entidades;
import br.org.recresiduos.constantes.TipoSorteReves;
import java.util.Random;
/**
 *
 * @author Thays
 */
public class SorteReves {
    private TipoSorteReves tipo;
    private double valor;
    private int cont;
    private int numCarta;
    
    public SorteReves(TipoSorteReves tipo, double valor,int cont){
    this.tipo = tipo;
    this.valor = valor;
    this.cont = cont;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
     public void setSR(TipoSorteReves tipo){
        this.tipo = tipo;
    }
   
    public TipoSorteReves getSR() {
         return tipo;
    }
    
    public int sortearCartas(){
        Random rnd = new Random();
        numCarta = rnd.nextInt(6);
        numCarta++;
        return numCarta;
    }
    
     public int getNumCarta() {
        return numCarta;
    }
}

