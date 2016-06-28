/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.uteis;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Paulo
 */
public class Arredonda {
    
    private static BigDecimal valor;

    public Arredonda(double valor) {
        this.valor = new BigDecimal(valor);
    }
    
    public double valorArredondado(){
        this.valor = this.valor.setScale(2, RoundingMode.UP);
        return this.valor.doubleValue();
    }
}
