package com.justinfrasier.robot.client;


import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class VideoPanel extends JPanel {


    private BufferedImage image;
    private Master master;

    public VideoPanel(Master master){
        this.master = master;
        image = master.getImage();

    }
    @Override
    protected void paintComponent(Graphics g){
        updateImage();
        if(image==null) return;
        super.paintComponent(g);
        g.drawImage(image,0,0,null);
    }

    public void updateImage(){
        image = master.getImage();
    }
}
