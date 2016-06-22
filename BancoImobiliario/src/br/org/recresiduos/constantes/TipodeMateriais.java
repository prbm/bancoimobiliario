/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.constantes;

/**
 *
 * @author Thays
 */
public enum TipodeMateriais {
    // declaracao dos dados do material
    // NOME (valor)
    NENHUM  (0.0),
    METAL   (1.5),
    MADEIRA (3.4),
    PAPEL   (2.6),
    OLEO    (0.8),
    ORGANICO(0.3),
    VIDRO   (0.75),
    ALUMINIO(2.4),
    FERRO   (1.75),
    PLASTICO(0.95),
    NAORECICLAVEL(0.0);
    
    // atributo que determina o valor do material
    private final double valorMaterial;
    
    // construtos que indica que este enum informa o valor, alem do nome do material
    private TipodeMateriais(double valorMaterial){
        this.valorMaterial = valorMaterial;
    }
    
    // declara o metodo que informa o valor do material
    public double getValorMaterial(){
        return this.valorMaterial;
    }
}
