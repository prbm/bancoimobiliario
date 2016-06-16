/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.entidades;

import br.org.recresiduos.constantes.TipodeMateriais;
import java.util.Random;

/**
 *
 * @author Thays
 */
public class Objetivo {
    private TipodeMateriais tipo;
    private String descricao;
    private double valor, qtdaVidro, qtdaPapel, qtdaFerro, qtdaAluminio, qtdaOleo, qtdaMadeira, qtdaPlastico;
    private int cont;
    private int numObjetivo;
    
    public Objetivo(String descricao,double valor, double vidro, double papel, double ferro, double aluminio, double oleo, double madeira, double plastico, int cont){
         this.valor = valor;
         this.descricao = descricao;
         this.qtdaVidro = vidro;
         this.qtdaPapel = papel;
         this.qtdaFerro = ferro;
         this.qtdaAluminio = aluminio;
         this.qtdaOleo = oleo;
         this.qtdaMadeira = madeira;
         this.qtdaPlastico = plastico;
         this.cont = cont;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    
     public void setDescr(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescr() {
        return descricao;
    }
    
     public void setVidro(double vidro) {
        this.qtdaVidro = vidro;
    }
    
    public double getVidro() {
        return qtdaVidro;
    }
    
     public void setPapel(double papel) {
        this.qtdaPapel = papel;
    }
    
    public double getPapel() {
        return qtdaPapel;
    }
    
     public void setFerro(double ferro) {
        this.qtdaFerro = ferro;
    }
    
    public double getFerro() {
        return qtdaFerro;
    }
    
     public void setAluminio(double aluminio) {
        this.qtdaAluminio = aluminio;
    }
    
    public double getAluminio() {
        return qtdaAluminio;
    }
    
     public void setOleo(double oleo) {
        this.qtdaOleo = oleo;
    }
    
    public double getOleo() {
        return qtdaOleo;
    }
    
     public void setMadeira(double madeira) {
        this.qtdaMadeira = madeira;
    }
    
    public double getMadeira() {
        return qtdaMadeira;
    }
    
     public void setPlastico(double plastico) {
        this.qtdaPlastico = plastico;
    }
    
    public double getPlastico() {
        return qtdaPlastico;
    }
    public Objetivo getAll() {
         return this;
    }
    
     public int sortearNumObjetivo(){
        Random rnd = new Random();
        numObjetivo = rnd.nextInt(6);
        numObjetivo++;
        return numObjetivo;
    }
     
     public int getNumObjetivo() {
        return numObjetivo;
    }
    
}
