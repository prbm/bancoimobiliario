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
        
       JOptionPane.showMessageDialog(null, "\t Instru��es: \n\n\n"+
                "- Voc�s deveram escolher um dentre os 4 personagens no in�cio do jogo;\n" +
                "- Em seguida o jogador sortear� o seu objetivo;\n" +
                "- Os jogadores se movem no tabuleiro de acordo com o resultado de um dado;\n" +
                "- Ao parar em uma casa ele pode ou n�o recolher o material que ela cont�m, com intuito de alcan�ar seu objetivo;\n" +
                "- Os materias s�o guardados at� que o jogador atinga seu objetivo ou decida recicla-los;\n" +
                "- O jogador ganha pontos ao atingir seu objetivo, e menos pontos caso s� reciclar os materias coletados;\n" +
                "- Vence o jogador que ao fim de 'X' rodadas tiver mais pontos;");

        // ativa o tabuleiro
        Tabuleiro tab = new Tabuleiro();
        tab.setVisible(true);
    }
}
