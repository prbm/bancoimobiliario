/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.entidades;

/**
 *
 * @author Thays
 */
public class MaterialColetado {
    private String descricao;
    private double valor, qtdaVidro, qtdaPapel, qtdaOrganico, qtdaMetal, qtdaMadeira, qtdaPlastico,qtdaNReciclavel;
    private int cont;
    
     public MaterialColetado(String descricao,double valor, double vidro, double papel, double organico, double metal, double madeira, double plastico,double nreciclavel, int cont){
         this.valor = valor;
         this.descricao = descricao;
         this.qtdaVidro = vidro;
         this.qtdaPapel = papel;
         this.qtdaOrganico = organico;
         this.qtdaMetal = metal;
         this.qtdaMadeira = madeira;
         this.qtdaPlastico = plastico;
         this.qtdaNReciclavel = nreciclavel;
         this.cont = cont;
    }
     
     public MaterialColetado(){
         //construtor padrão para iniciar os valores;
         this.valor = 0;
         this.descricao = "";
         this.qtdaVidro = 0;
         this.qtdaPapel = 0;
         this.qtdaOrganico = 0;
         this.qtdaMetal = 0;
         this.qtdaMadeira = 0;
         this.qtdaPlastico = 0;
         this.qtdaNReciclavel = 0;
         this.cont = 0;
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

    public double getQtdaOrganico() {
        return qtdaOrganico;
    }

    public void setQtdaOrganico(double qtdaOrganico) {
        this.qtdaOrganico = qtdaOrganico;
    }

    public double getQtdaMetal() {
        return qtdaMetal;
    }

    public void setQtdaMetal(double qtdaMetal) {
        this.qtdaMetal = qtdaMetal;
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
    public MaterialColetado getAll() {
         return this;
    }

    public double getQtdaNReciclavel() {
        return qtdaNReciclavel;
    }

    public void setQtdaNReciclavel(double qtdaNReciclavel) {
        this.qtdaNReciclavel = qtdaNReciclavel;
    }
    
}
