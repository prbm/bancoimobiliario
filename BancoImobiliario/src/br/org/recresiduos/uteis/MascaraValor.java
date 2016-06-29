/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.uteis;

import java.text.DecimalFormat;

/**
 *
 * @author Paulo
 */
public class MascaraValor {

    private final String mascara = "R$ ##,###.##";
    private double valor;
    private DecimalFormat df;

    public MascaraValor(double valor) {
        this.valor = valor;
        this.df = new DecimalFormat(this.mascara);
    }
    
    public String numeroFormatado(){
        return (df.format(this.valor));
    }
    
}
