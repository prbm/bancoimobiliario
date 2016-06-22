/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.recresiduos.telas;

import br.org.recresiduos.uteis.Sprite;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class RolarDados extends JFrame {

    BufferedImage backBuffer;
    int FPS = 30;
    int janelaW = 200;
    int janelaH = 200;

    //ESSA É A NOSSA SPRITE!
    //VERIFIQUE AGORA O MÉTODO inicializar()
    //LÁ VAMOS INICIAR AS IMAGENS QUE VAMOS USAR NESSA SPRITE!
    //DEPOIS VERIFIQUE O MÉTODO desenharGraficos()
    //VEJA QUE ESSA SPRITE TEM 3 CENAS!!!
    Sprite vilao = new Sprite(6, 25, 50);
//    Sprite vilao2 = new Sprite(3, 100, 200);

    ImageIcon fundo = new ImageIcon(getClass().getResource("/imagensbir/CartaObjetivoCostas.png"));

    public void atualizar() {

    }

    public void desenharGraficos() {
        Graphics g = getGraphics(); //ISSO JÁ ESTAVA AQUI
        Graphics bbg = backBuffer.getGraphics();//ISSO TAMBÉM JÁ ESTAVA AQUI...
        //AQUI VAMOS MANDAR DESENHAR ALGUNS IMAGENS NA TELA
        bbg.drawImage(fundo.getImage(), 0, 0, this);//QUI DESENHAMOS O FUNDO
        //AS DIMENSÕES ORIGINAIS DO FUNDO SÃO: 500X500 QUE É O TAMANHO DA NOSSA TELA!

        //AQUI TO DESENHANDO A O NOSSO PERSONAGEM
        //VEJA QUE NOSSO vilão tem tudo que agente precisa!
        //SUAS COORDENADAS, LARGURA, ALTURA, E AS IMAGENS!!!
        ImageIcon[] vilaoCenas = vilao.getCenas();
          
        bbg.drawImage(vilaoCenas[vilao.getCena()].getImage(), vilao.getX(), vilao.getY(), this);
        vilao.animar(); //AQUI CHAMEI O MÉTODO ANIMAR

//        bbg.drawImage(vilao2.cenas[vilao2.cena].getImage(), vilao2.x, vilao2.y, this);
//        vilao2.animarMaisLento(); //AQUI CHAMEI O MÉTODO ANIMAR MAIS LENTO

        //================================================================================== 
        g.drawImage(backBuffer, 0, 0, this);//OBS: ISSO DEVE FICAR SEMPRE NO FINAL!
    }

    public void inicializar() {
        setTitle("Titulo do Jogo!");
        setSize(janelaW, janelaH);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        backBuffer = new BufferedImage(janelaW, janelaH, BufferedImage.TYPE_INT_RGB);

        //QUI CARREGAMOS AS IMAGENS DE NOSSA SPIRTE!!!!!!!
        //PARA O VETOR DE ImageIcon[] !!!
        ImageIcon[] vilaoCenas = new ImageIcon[6];
        vilaoCenas[0] = new ImageIcon(getClass().getResource("/imagensbir/Dice001.png"));
        vilaoCenas[1] = new ImageIcon(getClass().getResource("/imagensbir/Dice002.png"));
        vilaoCenas[2] = new ImageIcon(getClass().getResource("/imagensbir/Dice003.png"));
        vilaoCenas[3] = new ImageIcon(getClass().getResource("/imagensbir/Dice004.png"));
        vilaoCenas[4] = new ImageIcon(getClass().getResource("/imagensbir/Dice005.png"));
        vilaoCenas[5] = new ImageIcon(getClass().getResource("/imagensbir/Dice006.png"));
        vilao.setLargura(75); //LARGURA DO VILÃO
        vilao.setAltura(75); //ALTURA DO VILÃO , mas não vou usar isso agora..
        vilao.setCenas(vilaoCenas);

        //QUI CARREGAMOS AS IMAGENS DE NOSSA SPIRTE!!!!!!!
        //PARA O VETOR DE ImageIcon[] !!!
//        vilao2.cenas[0] = new ImageIcon(getClass().getResource("/testesprite/imagens/s1.gif"));
//        vilao2.cenas[1] = new ImageIcon(getClass().getResource("/testesprite/imagens/s2.gif"));
//        vilao2.cenas[2] = new ImageIcon(getClass().getResource("/testesprite/imagens/s3.gif"));
//        vilao2.largura = 100; //LARGURA DO VILÃO
//        vilao2.altura = 200; //ALTURA DO VILÃO , mas não vou usar isso agora..
    }

    public void run() {
        inicializar();
        while (true) {
            atualizar();
            desenharGraficos();
            try {
                Thread.sleep(1000 / FPS);
            } catch (Exception e) {
                System.out.println("Thread interrompida!");
            }
        }
    }

    public static void main(String[] args) {
        RolarDados game = new RolarDados();
        game.run();
    }
}
