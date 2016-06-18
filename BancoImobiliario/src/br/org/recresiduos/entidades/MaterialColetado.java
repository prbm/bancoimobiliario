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
    private double valor;
    private double qtdeVidro;
    private double qtdePapel;
    private double qtdeOrganico;
    private double qtdeMetal;
    private double qtdeMadeira;
    private double qtdePlastico;
    private double qtdeNReciclavel;
    private int cont;
    
     public MaterialColetado(String descricao,double valor, double vidro, double papel, double organico, double metal, double madeira, double plastico,double nreciclavel, int cont){
         this.valor = valor;
         this.descricao = descricao;
         this.qtdeVidro = vidro;
         this.qtdePapel = papel;
         this.qtdeOrganico = organico;
         this.qtdeMetal = metal;
         this.qtdeMadeira = madeira;
         this.qtdePlastico = plastico;
         this.qtdeNReciclavel = nreciclavel;
         this.cont = cont;
    }
     
     public MaterialColetado(){
         //construtor padrão para iniciar os valores;
         this.valor = 0;
         this.descricao = "";
         this.qtdeVidro = 0;
         this.qtdePapel = 0;
         this.qtdeOrganico = 0;
         this.qtdeMetal = 0;
         this.qtdeMadeira = 0;
         this.qtdePlastico = 0;
         this.qtdeNReciclavel = 0;
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
    
     public void setQtdeVidro(double vidro) {
        this.qtdeVidro = vidro;
    }
    
    public double getQtdeVidro() {
        return qtdeVidro;
    }
    
     public void setQtdePapel(double papel) {
        this.qtdePapel = papel;
    }
    
    public double getQtdePapel() {
        return qtdePapel;
    }

    public double getQtdeOrganico() {
        return qtdeOrganico;
    }

    public void setQtdeOrganico(double qtdaOrganico) {
        this.qtdeOrganico = qtdaOrganico;
    }

    public double getQtdeMetal() {
        return qtdeMetal;
    }

    public void setQtdeMetal(double qtdaMetal) {
        this.qtdeMetal = qtdaMetal;
    }
        
    public void setQtdeMadeira(double madeira) {
        this.qtdeMadeira = madeira;
    }
    
    public double getQtdeMadeira() {
        return qtdeMadeira;
    }
    
     public void setQtdePlastico(double plastico) {
        this.qtdePlastico = plastico;
    }
    
    public double getQtdePlastico() {
        return qtdePlastico;
    }
    public MaterialColetado getAll() {
         return this;
    }

    public double getQtdeNaoReciclavel() {
        return qtdeNReciclavel;
    }

    public void setQtdeNaoReciclavel(double qtdaNReciclavel) {
        this.qtdeNReciclavel = qtdaNReciclavel;
    }
    
}
