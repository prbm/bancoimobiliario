package br.org.recresiduos.telas;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Paulo
 */
public class BackGroundPanel extends JPanel{

    private Image image;

    public BackGroundPanel(String path) {
        try {
            image = ImageIO.read(getClass().getResource(path));
        } catch (IOException ioe) {
            System.out.println("BackGroundPanel IOException:" + ioe.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }

}

