/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.entidades;

import br.org.recresiduos.constantes.TipodeMateriais;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Thays
 */
public class Objetivo {
    private TipodeMateriais tipo;
    private String descricao;
    private double valor;
    private double qtdeVidro;
    private double qtdePapel;
    private double qtdeOrganico;
    private double qtdeMetal;
    private double qtdeMadeira;
    private double qtdePlastico;
    private double qtdeNReciclavel;
    private double qtdeFerro;
    private double qtdeOleo;
    private double qtdeAluminio;
    private int cont;
    private int numObjetivo;
    private ImageIcon imagem;

    public Objetivo(String descricao, double valor, ImageIcon imagem) {
        this.descricao = descricao;
        this.valor = valor;
        this.imagem = imagem;
        this.qtdeVidro = 0;
        this.qtdePapel = 0;
        this.qtdeOrganico = 0;
        this.qtdeMetal = 0;
        this.qtdeMadeira = 0;
        this.qtdePlastico = 0;
        this.qtdeNReciclavel = 0;
        this.qtdeFerro = 0;
        this.qtdeOleo = 0;
        this.qtdeAluminio = 0;
    }
    
    public Objetivo(String descricao, double valor, double qtdeVidro, double qtdePapel, double qtdeOrganico, double qtdeMetal, double qtdeMadeira, double qtdePlastico, double qtdeNReciclavel, double qtdeFerro, double qtdeOleo, double qtdeAluminio, int cont, ImageIcon imagem) {
        this.descricao = descricao;
        this.valor = valor;
        this.qtdeVidro = qtdeVidro;
        this.qtdePapel = qtdePapel;
        this.qtdeOrganico = qtdeOrganico;
        this.qtdeMetal = qtdeMetal;
        this.qtdeMadeira = qtdeMadeira;
        this.qtdePlastico = qtdePlastico;
        this.qtdeNReciclavel = qtdeNReciclavel;
        this.qtdeFerro = qtdeFerro;
        this.qtdeOleo = qtdeOleo;
        this.qtdeAluminio = qtdeAluminio;
        this.cont = cont;
        this.imagem = imagem;
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

    public double getQtdeVidro() {
        return qtdeVidro;
    }

    public void setQtdeVidro(double qtdeVidro) {
        this.qtdeVidro = qtdeVidro;
    }

    public double getQtdePapel() {
        return qtdePapel;
    }

    public void setQtdePapel(double qtdePapel) {
        this.qtdePapel = qtdePapel;
    }

    public double getQtdeOrganico() {
        return qtdeOrganico;
    }

    public void setQtdeOrganico(double qtdeOrganico) {
        this.qtdeOrganico = qtdeOrganico;
    }

    public double getQtdeMetal() {
        return qtdeMetal;
    }

    public void setQtdeMetal(double qtdeMetal) {
        this.qtdeMetal = qtdeMetal;
    }

    public double getQtdeMadeira() {
        return qtdeMadeira;
    }

    public void setQtdeMadeira(double qtdeMadeira) {
        this.qtdeMadeira = qtdeMadeira;
    }

    public double getQtdePlastico() {
        return qtdePlastico;
    }

    public void setQtdePlastico(double qtdePlastico) {
        this.qtdePlastico = qtdePlastico;
    }

    public double getQtdeNReciclavel() {
        return qtdeNReciclavel;
    }

    public void setQtdeNReciclavel(double qtdeNReciclavel) {
        this.qtdeNReciclavel = qtdeNReciclavel;
    }

    public double getQtdeFerro() {
        return qtdeFerro;
    }

    public void setQtdeFerro(double qtdeFerro) {
        this.qtdeFerro = qtdeFerro;
    }

    public double getQtdeOleo() {
        return qtdeOleo;
    }

    public void setQtdeOleo(double qtdeOleo) {
        this.qtdeOleo = qtdeOleo;
    }

    public double getQtdeAluminio() {
        return qtdeAluminio;
    }

    public void setQtdeAluminio(double qtdeAluminio) {
        this.qtdeAluminio = qtdeAluminio;
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

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }
    
     
}
