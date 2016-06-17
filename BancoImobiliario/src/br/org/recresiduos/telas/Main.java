package br.org.recresiduos.telas;
import javax.swing.JOptionPane;
/**
 *
 * @author Paulo
 */
public class Main {
    
    public static void main(String args[]){
        
        // exibe a tela de Splash
        Splash splash = new Splash(7500);
        splash.mostrar();
        
       JOptionPane.showMessageDialog(null, "\t Instruções: \n\n\n"+
                "- Vocês deveram escolher um dentre os 4 personagens no início do jogo;\n" +
                "- Em seguida o jogador sorteará o seu objetivo;\n" +
                "- Os jogadores se movem no tabuleiro de acordo com o resultado de um dado;\n" +
                "- Ao parar em uma casa ele pode ou não recolher o material que ela contém, com intuito de alcançar seu objetivo;\n" +
                "- Os materias são guardados até que o jogador atinga seu objetivo ou decida recicla-los;\n" +
                "- O jogador ganha pontos ao atingir seu objetivo, e menos pontos caso só reciclar os materias coletados;\n" +
                "- Vence o jogador que ao fim de 'X' rodadas tiver mais pontos;");

        // ativa o tabuleiro
        Tabuleiro tab = new Tabuleiro();
        tab.setVisible(true);
    }
}
