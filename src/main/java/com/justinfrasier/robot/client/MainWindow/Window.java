package com.justinfrasier.robot.client.MainWindow;


import com.justinfrasier.robot.client.ButtonPanel.ButtonPanel;
import com.justinfrasier.robot.client.Master.Master;
import com.justinfrasier.robot.client.VideoPanel.Repainter;
import com.justinfrasier.robot.client.VideoPanel.VideoPanel;

import javax.swing.*;

public class Window {

    public Window(Master master) throws Exception{
        JFrame frame = new JFrame();
        frame.setTitle("Client");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int size = 900;
        frame.setSize(size,(int)(size /1.5));
        frame.setVisible(true);
        JPanel videoPanel = new VideoPanel(master);
        JPanel buttonPanel = new ButtonPanel();
        videoPanel.repaint();
        frame.add(videoPanel);
        frame.add(buttonPanel);
        Repainter.run(videoPanel);
    }

}
