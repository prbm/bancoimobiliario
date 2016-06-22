/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.uteis;

import javax.swing.ImageIcon;

/**
 *
 * @author aluno
 */
public class Sprite {

    ImageIcon cenas[]; //VETOR DE IMAGENS,
    int x;     //AQUI É A COORDENADA X
    int y;     //AQUI É A COORDENADA Y
    int largura;   //LARGURA DA IMAGEM, CASO QUEIRA DEFINIR UMA
    int altura;    //ALTURA DA IMAGEM, CASO QUEIRA DEFINIR UMA
    int cena = 0;   //O INDICE DA CENA DA NOSSA SPRITE ANIMADA
    int controlaVelocidade = 0;
    int velocidade = 5;

    //ISSO AQUI EM BAIXO PRA QUEM NÃO SABE É UM CONSTRUTOR
    //QUANDO FORMOS CRIAR UM OBJETO A PARTIR DESSA CLASSE
    //TEREMOS QUE: INFORMAR O NÚMERO DE CENAS, E A SUA COORDENADA INICIAL
    //+ OU - ASSIM: new Sprite(3, 200, 300);
    public Sprite(int numeroDeCenas, int x, int y) {
        cenas = new ImageIcon[numeroDeCenas];
        this.x = x;
        this.y = y;
    }

    //ESSE MÉTODO VAI ALTERNAR AS IMAGENS QUE COMPÕES NOSSA SPRITE
    //DEPENDENDO DO QUE VC PRETENDER FAZER, ESSE MÉTODO PODERIA
    //SER MAIS COMPLEXO!
    //TIPO: animarCorrer() animarChutar() animarPular()
    //E ESSES MÉTODOS SERIAM CHAMADOS AO CLICAR EM ALGUMA TECLA!!!
    //ESSA ANIMAÇÃO VAI FICAR MUITO RÁPIDA, PQ ELE MUDAR A IMAGEM DA CENA
    //A CADA 1/30 milissegundos
    public void animar() {
        cena += 1;
        if (cena == cenas.length) {
            cena = 0;
        }
    }

    //ESSE MÉTODO CONTROLA A VELOCIDADE DA ANIMAÇÃO
    //TENTEN ENTENDER ISSO AI...:
    //isso é um controle de tempo paralelo ao que já tem no game loop!!!!
    //o game loop vai rodar isso 30x a cada segundo
    //e esse método vai mudar a cena a cada, 5 vezes que o game loop for 
    //executado!!!!
    public void animarMaisLento() {
        controlaVelocidade += 1;
        if (controlaVelocidade > velocidade) {
            cena += 1;
            controlaVelocidade = 0;
            if (cena == cenas.length) {
                cena = 0;
            }
        }
    }

    /*
     * Métodos get e set para os atributos da classe Sprite, definidos como private
    */
    
    public ImageIcon[] getCenas() {
        return cenas;
    }

    public void setCenas(ImageIcon[] cenas) {
        this.cenas = cenas;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getControlaVelocidade() {
        return controlaVelocidade;
    }

    public void setControlaVelocidade(int controlaVelocidade) {
        this.controlaVelocidade = controlaVelocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
