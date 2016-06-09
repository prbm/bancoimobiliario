package exemplobancoimobiliario;

/**
 *
 * @author Paulo
 */
public class Main {
    
    public static void main(String args[]){
        // exibe a tela de Splash
        Splash splash = new Splash(7500);
        splash.mostrar();

        // ativa o tabuleiro
        Tabuleiro tab = new Tabuleiro();
        tab.setVisible(true);
    }
}
