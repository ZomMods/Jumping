package fr.zomdev.jumping.frames.panels;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Thomas on 11/08/2016.
 */
public class MenuPanel extends JPanel {


    public MenuPanel(){
        this.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        try {
            Image img = ImageIO.read(new File("favicon.jpg"));
            g.drawImage(img, getWidth()/2, getHeight()/2, this);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
