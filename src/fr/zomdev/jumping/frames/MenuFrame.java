package fr.zomdev.jumping.frames;

import fr.zomdev.jumping.frames.panels.MenuPanel;

import javax.swing.*;

/**
 * Created by Thomas on 11/08/2016.
 */
public class MenuFrame extends JFrame {

    public MenuFrame(String title){
        this.setTitle(title);
        this.setSize(400,600);
        this.setResizable(false);
        this.setContentPane(new MenuPanel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
