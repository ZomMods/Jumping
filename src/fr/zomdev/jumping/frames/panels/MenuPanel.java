package fr.zomdev.jumping.frames.panels;

import fr.zomdev.jumping.frames.MenuFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Thomas on 11/08/2016.
 */
public class MenuPanel extends JPanel {

    public void paintComponent(Graphics g) {
        try {
            Image img;
            img = ImageIO.read(new FileInputStream("favicon.jpg"));
            g.drawImage(img, getWidth()/2, getHeight()/2, this);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public MenuPanel(){
        this.setSize(MenuFrame.WIDTH, MenuFrame.HEIGHT);
    }
}
