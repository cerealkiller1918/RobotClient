package com.justinfrasier.robot.client;


import javax.swing.*;

public class Window extends JFrame{

    public Window(Master master) throws Exception{
        //Thread.sleep(500);
        this.setTitle("Client");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(650,515);
        this.setVisible(true);
        JPanel panel = new VideoPanel(master);
        panel.repaint();
        this.add(panel);
        while(true){
            panel.repaint();
            //Thread.sleep(700);
        }
    }
}
