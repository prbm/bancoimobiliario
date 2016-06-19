
package br.org.recresiduos.uteis;

import java.util.Random;


public class Dado {

    private int numFace;
    private Random rnd;
    
    public Dado(){
        rnd = new Random();
    }
    
    public int rolarDados(){
        //Random rnd = new Random();
        numFace = rnd.nextInt(6);
        numFace++;
        return numFace;
    }

    public int getNumFace() {
        return numFace;
    }
    
    
}
