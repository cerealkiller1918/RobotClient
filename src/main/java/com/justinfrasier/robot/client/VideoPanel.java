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
        //if(image==null) System.out.println("Image in panel is NULL");
        super.paintComponent(g);
        g.drawImage(image,0,0,null);
    }

    public void updateImage(){
        image = master.getImage();
    }
}
