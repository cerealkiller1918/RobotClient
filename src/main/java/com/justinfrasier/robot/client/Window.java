package com.justinfrasier.robot.client;


import javax.swing.*;

public class Window {
    JFrame frame;
    JPanel panel;
    public Window(Master master) throws Exception{
        frame = new JFrame();
        frame.setTitle("Client");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(650,515);
        frame.setVisible(true);
        panel = new VideoPanel(master);
        panel.repaint();
        frame.add(panel);
        Repainter.run(panel);
    }
}
