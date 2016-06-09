package exemplobancoimobiliario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 *
 * @author Paulo
 */
public class Splash extends JWindow {

    private int tempoDuracao;
    
    public Splash(int i){
        tempoDuracao = i;
    }
    
    /*
     * Este método mostra a tela no centro da tela, de acordo com
     * o tempo de duração iniciado no construtor
    */
    public void mostrar() {
        // cria o panel onde será montad o Splash Screen
        JPanel painelSplashScreen = (JPanel) getContentPane();
        painelSplashScreen.setBackground(Color.white);

        // Define o tamanho da tela e a posição no centro da tela
        int largura = 600;
        int altura = 450;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - largura) / 2;
        int y = (screen.height - altura) / 2;
        setBounds(x, y, largura, altura);

        // Monta a splash screen
        JLabel imagem = new JLabel(new ImageIcon(getClass().getResource("/imagens/splash.gif")));
        JLabel copyrt = new JLabel("Copyright 2016, Uninove", JLabel.CENTER);
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        painelSplashScreen.add(imagem, BorderLayout.CENTER);
        painelSplashScreen.add(copyrt, BorderLayout.SOUTH);
        Color contorno = new Color(0,0,125,255);
        painelSplashScreen.setBorder(BorderFactory.createLineBorder(contorno, 10));

        // ativa a tela
        setVisible(true);

        // interrompe o processamento por um período de tempo
        try {
            Thread.sleep(tempoDuracao);
        } catch (Exception e) {
        }
        
        // desativa a tela
        setVisible(false);
    }
    
    /*
     * OS dois métodos a seguir são usados somente para testes da 
     * tela de splash
    **/
    public void mostrarESair() {
        // exibe o splash e encerra o aplicativo
        mostrar();
        System.exit(0);
    }

    public static void main(String[] args) {
        // declara a tela de splash
        Splash splash = new Splash(10000);
        // apresenta a tela e encerra o aplicativo
        splash.mostrarESair();
    }    
}
