
package br.org.recresiduos.uteis;

import java.util.Random;


public class Dado {

    private int numFace;
    
    public int rolarDados(){
        Random rnd = new Random();
        numFace = rnd.nextInt(3);
        numFace++;
        return numFace;
    }

    public int getNumFace() {
        return numFace;
    }
    
    
}
